
package br.edu.ifpb.dac.dac.cenario2.domain.entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Edilva
 */
@Entity
@IdClass(RecebeNotaPK.class)
public class RecebeNota implements Serializable{
    
    @Id
    @ManyToOne
    @JoinColumn(name = "cod_filme")
    private Filme filme;
    @Id
    @OneToOne
    @JoinColumn(name = "cod_evento")
    private Evento evento;
    private float nota;

    public RecebeNota() {
    }

    public RecebeNota(Filme filme, Evento evento, float nota) {
        this.filme = filme;
        this.evento = evento;
        this.nota = nota;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.filme);
        hash = 97 * hash + Objects.hashCode(this.evento);
        hash = 97 * hash + Float.floatToIntBits(this.nota);
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
        final RecebeNota other = (RecebeNota) obj;
        if (Float.floatToIntBits(this.nota) != Float.floatToIntBits(other.nota)) {
            return false;
        }
        if (!Objects.equals(this.filme, other.filme)) {
            return false;
        }
        if (!Objects.equals(this.evento, other.evento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RecebeNota{" + "filme=" + filme + ", evento=" + evento + ", nota=" + nota + '}';
    }
    
}
