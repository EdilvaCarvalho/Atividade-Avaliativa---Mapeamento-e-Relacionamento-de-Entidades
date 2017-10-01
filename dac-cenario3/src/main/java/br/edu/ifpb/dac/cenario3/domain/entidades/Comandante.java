
package br.edu.ifpb.dac.cenario3.domain.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Edilva
 */
@Entity
public class Comandante implements Serializable{
    
    @Id
    @GeneratedValue
    private int idComandante;
    @Column(nullable=false, length=80)
    private String nome;
    @Column(nullable=false, length=80)
    private String pais;
    @OneToMany
    private List<Navio> navios;

    public Comandante() {
    }

    public Comandante(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.navios = new ArrayList<>();
    }

    public Comandante(int idComandante, String nome, String pais, List<Navio> navios) {
        this.idComandante = idComandante;
        this.nome = nome;
        this.pais = pais;
        this.navios = navios;
    }

    public int getIdComandante() {
        return idComandante;
    }

    public void setIdComandante(int idComandante) {
        this.idComandante = idComandante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Navio> getNavios() {
        return navios;
    }

    public void setNavios(List<Navio> navios) {
        this.navios = navios;
    }
    
    public void addNavio(Navio navio){
        this.navios.add(navio);
    }

    public void removeNavio(Navio navio){
        this.navios.remove(navio);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idComandante;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.pais);
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
        final Comandante other = (Comandante) obj;
        if (this.idComandante != other.idComandante) {
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
        return "Comandante{" + "idComandante=" + idComandante + ", nome=" + nome + ", pais=" + pais + ", navios=" + navios + '}';
    }
    
}
