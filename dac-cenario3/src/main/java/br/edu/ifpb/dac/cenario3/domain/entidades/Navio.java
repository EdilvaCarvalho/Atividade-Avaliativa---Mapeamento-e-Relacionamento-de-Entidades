
package br.edu.ifpb.dac.cenario3.domain.entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Edilva
 */
@Entity
public class Navio implements Serializable{
    
    @Id
    @GeneratedValue
    private int codNavio;
    @Column(nullable=false, length=80)
    private String nome;
    @Column(nullable=false)
    private double capacidade;
    @Column(nullable=false, length=80)
    private String pais;

    public Navio() {
    }

    public Navio(int codNavio, String nome, double capacidade, String pais) {
        this.codNavio = codNavio;
        this.nome = nome;
        this.capacidade = capacidade;
        this.pais = pais;
    }

    public Navio(String nome, double capacidade, String pais) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.pais = pais;
    }

    public int getCodNavio() {
        return codNavio;
    }

    public void setCodNavio(int codNavio) {
        this.codNavio = codNavio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.codNavio;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.capacidade) ^ (Double.doubleToLongBits(this.capacidade) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.pais);
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
        final Navio other = (Navio) obj;
        if (this.codNavio != other.codNavio) {
            return false;
        }
        if (Double.doubleToLongBits(this.capacidade) != Double.doubleToLongBits(other.capacidade)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Navio{" + "codNavio=" + codNavio + ", nome=" + nome + ", capacidade=" + capacidade + ", pais=" + pais + '}';
    }
    
}
