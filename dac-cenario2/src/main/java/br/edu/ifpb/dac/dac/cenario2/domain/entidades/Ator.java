
package br.edu.ifpb.dac.dac.cenario2.domain.entidades;

import br.edu.ifpb.dac.dac.cenario2.domain.enums.Sexo;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Edilva
 */
@Entity
public class Ator implements Serializable{
    
    @Id
    @GeneratedValue
    private int codigo;
    @Column(nullable=false, length=80)
    private String nome;
    @Column(nullable=false, length=15)
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @Column(nullable=false, length=30)
    private String nacionalidade;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_par_romantico")
    private Ator parRomantico;

    public Ator() {
    }

    public Ator(int codigo, String nome, Sexo sexo, String nacionalidade, Ator parRomantico) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.parRomantico = parRomantico;
    }

    public Ator(String nome, Sexo sexo, String nacionalidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Ator getParRomantico() {
        return parRomantico;
    }

    public void setParRomantico(Ator parRomantico) {
        this.parRomantico = parRomantico;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.sexo);
        hash = 23 * hash + Objects.hashCode(this.nacionalidade);
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
        final Ator other = (Ator) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidade, other.nacionalidade)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ator{" + "codigo=" + codigo + ", nome=" + nome + ", sexo=" + sexo + ", nacionalidade=" + nacionalidade + ", parRomantico=" + parRomantico + '}';
    }
    
}
