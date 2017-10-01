
package br.edu.ifpb.dac.dac.cenario2.domain.entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Edilva
 */
@Entity
public class Evento implements Serializable{
    
    @Id
    @GeneratedValue
    private int codigo;
    @Column(nullable=false, length=80)
    private String nome;
    private int ano;
    @Embedded
    private Local local;

    public Evento() {
    }

    public Evento(int codigo, String nome, int ano, Local local) {
        this.codigo = codigo;
        this.nome = nome;
        this.ano = ano;
        this.local = local;
    }

    public Evento(String nome, int ano, Local local) {
        this.nome = nome;
        this.ano = ano;
        this.local = local;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + this.ano;
        hash = 89 * hash + Objects.hashCode(this.local);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evento other = (Evento) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.local, other.local)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", nome=" + nome + ", ano=" + ano + ", local=" + local + '}';
    }
    
}
