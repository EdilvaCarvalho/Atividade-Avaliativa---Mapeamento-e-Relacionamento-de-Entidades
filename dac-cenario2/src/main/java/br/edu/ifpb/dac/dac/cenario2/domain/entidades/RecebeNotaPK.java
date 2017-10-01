package br.edu.ifpb.dac.dac.cenario2.domain.entidades;

import java.io.Serializable;

/**
 *
 * @author Edilva
 */
public class RecebeNotaPK implements Serializable {

    private int filme;
    private int evento;

    public RecebeNotaPK() {
    }

    public RecebeNotaPK(int filme, int evento) {
        this.filme = filme;
        this.evento = evento;
    }

    public int getFilme() {
        return filme;
    }

    public void setFilme(int filme) {
        this.filme = filme;
    }

    public int getEvento() {
        return evento;
    }

    public void setEvento(int evento) {
        this.evento = evento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.filme;
        hash = 23 * hash + this.evento;
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
        final RecebeNotaPK other = (RecebeNotaPK) obj;
        if (this.filme != other.filme) {
            return false;
        }
        if (this.evento != other.evento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FilmeEventoPK{" + "filme=" + filme + ", evento=" + evento + '}';
    }

}
