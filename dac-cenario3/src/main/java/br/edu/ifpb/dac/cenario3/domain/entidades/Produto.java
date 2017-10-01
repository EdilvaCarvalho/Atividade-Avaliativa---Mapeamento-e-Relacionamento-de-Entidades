
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
public class Produto implements Serializable{
    
    @Id
    @GeneratedValue
    private int idProduto;
    @Column(nullable=false, length=80)
    private String categoria;
    @Column(nullable=false, length=80)
    private String nome;

    public Produto() {
    }

    public Produto(String categoria, String nome) {
        this.categoria = categoria;
        this.nome = nome;
    }

    public Produto(int idProduto, String categoria, String nome) {
        this.idProduto = idProduto;
        this.categoria = categoria;
        this.nome = nome;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.idProduto;
        hash = 61 * hash + Objects.hashCode(this.categoria);
        hash = 61 * hash + Objects.hashCode(this.nome);
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
        final Produto other = (Produto) obj;
        if (this.idProduto != other.idProduto) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "idProduto=" + idProduto + ", categoria=" + categoria + ", nome=" + nome + '}';
    }
    
}
