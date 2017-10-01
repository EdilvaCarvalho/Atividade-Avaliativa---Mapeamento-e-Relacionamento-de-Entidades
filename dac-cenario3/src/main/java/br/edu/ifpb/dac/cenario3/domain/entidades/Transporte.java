
package br.edu.ifpb.dac.cenario3.domain.entidades;

import br.edu.ifpb.dac.cenario3.domain.util.ConvertLocalDate;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Edilva
 */
@Entity
public class Transporte implements Serializable{
    
    @Id
    @GeneratedValue
    private int codTransporte;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="cod_navio")
    private Navio navio;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="cod_carga")
    private Carga carga;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Produto> produtos;
    @Column(nullable=false)
    @Convert(converter = ConvertLocalDate.class)
    private LocalDate dataTransporte;
    private double valor;

    public Transporte() {
    }
    
    public Transporte(Navio navio, Carga carga, LocalDate data, double valor) {
        this.navio = navio;
        this.carga = carga;
        this.produtos = new ArrayList<>();
        this.dataTransporte = data;
        this.valor = valor;
    }

    public Transporte(int codTransporte, Navio navio, Carga carga, List<Produto> produtos, LocalDate data, double valor) {
        this.codTransporte = codTransporte;
        this.navio = navio;
        this.carga = carga;
        this.produtos = produtos;
        this.dataTransporte = data;
        this.valor = valor;
    }

    public int getCodTransporte() {
        return codTransporte;
    }

    public void setCodTransporte(int codTransporte) {
        this.codTransporte = codTransporte;
    }

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    };

    public LocalDate getDataTransporte() {
        return dataTransporte;
    }

    public void setDataTransporte(LocalDate dataTransporte) {
        this.dataTransporte = dataTransporte;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removeProduto(Produto produto){
        this.produtos.remove(produto);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.codTransporte;
        hash = 97 * hash + Objects.hashCode(this.navio);
        hash = 97 * hash + Objects.hashCode(this.carga);
        hash = 97 * hash + Objects.hashCode(this.dataTransporte);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
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
        final Transporte other = (Transporte) obj;
        if (this.codTransporte != other.codTransporte) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.navio, other.navio)) {
            return false;
        }
        if (!Objects.equals(this.carga, other.carga)) {
            return false;
        }
        if (!Objects.equals(this.dataTransporte, other.dataTransporte)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Transporte{" + "codTransporte=" + codTransporte + ", navio=" + navio + ", carga=" + carga + ", produtos=" + produtos + ", data=" + dataTransporte + ", valor=" + valor + '}';
    }
    
}
