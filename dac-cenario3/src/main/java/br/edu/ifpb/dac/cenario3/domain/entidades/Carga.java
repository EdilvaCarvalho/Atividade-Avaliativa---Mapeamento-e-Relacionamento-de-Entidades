
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
public class Carga implements Serializable{
    
    @Id
    @GeneratedValue
    private int codCarga;
    @Column(nullable=false, length=80)
    private String origem;
    @Column(nullable=false, length=80)
    private String destino;

    public Carga() {
    }
    
    public Carga(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }
    
    public Carga(int codCarga, String origem, String destino) {
        this.codCarga = codCarga;
        this.origem = origem;
        this.destino = destino;
    }

    public int getCodCarga() {
        return codCarga;
    }

    public void setCodCarga(int codCarga) {
        this.codCarga = codCarga;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.codCarga;
        hash = 11 * hash + Objects.hashCode(this.origem);
        hash = 11 * hash + Objects.hashCode(this.destino);
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
        final Carga other = (Carga) obj;
        if (this.codCarga != other.codCarga) {
            return false;
        }
        if (!Objects.equals(this.origem, other.origem)) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carga{" + "codCarga=" + codCarga + ", origem=" + origem + ", destino=" + destino + '}';
    }

}
