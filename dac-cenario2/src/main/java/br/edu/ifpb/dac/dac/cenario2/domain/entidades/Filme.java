
package br.edu.ifpb.dac.dac.cenario2.domain.entidades;

import br.edu.ifpb.dac.dac.cenario2.domain.enums.Genero;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Edilva
 */
@Entity
public class Filme implements Serializable{
    
    @Id
    @GeneratedValue
    private int codigo;
    @Column(nullable=false, length=80)
    private String titulo;
    private int ano;
    @Column(nullable=false, length=30)
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Column(nullable=false, length=80)
    private String diretor;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Ator> atores;
    @OneToMany(mappedBy = "filme", cascade={CascadeType.ALL})
    private List<RecebeNota> notaDoFilmeEmEventos;

    public Filme() {
    }

    public Filme(int codigo, String titulo, int ano, Genero genero, String diretor, List<Ator> atores, List<RecebeNota> notaDoFilmeEmEventos) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
        this.atores = atores;
        this.notaDoFilmeEmEventos = notaDoFilmeEmEventos;
    }

    public Filme(String titulo, int ano, Genero genero, String diretor) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
        this.atores = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
    
    public void addAtor(Ator ator){
        this.atores.add(ator);
    }

    public void removeAtor(Ator ator){
        this.atores.remove(ator);
    }
    
    public List<RecebeNota> getNotaDoFilmeEmEventos() {
        return notaDoFilmeEmEventos;
    }

    public void setNotaDoFilmeEmEventos(List<RecebeNota> notaDoFilmeEmEventos) {
        this.notaDoFilmeEmEventos = notaDoFilmeEmEventos;
    }
    
    public void addNotaDoFilmeEmEvento(RecebeNota notaDoFilmeEmEvento){
        this.notaDoFilmeEmEventos.add(notaDoFilmeEmEvento);
    }

    public void removeNotaDoFilmeEmEvento(RecebeNota notaDoFilmeEmEvento){
        this.notaDoFilmeEmEventos.remove(notaDoFilmeEmEvento);
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        hash = 41 * hash + Objects.hashCode(this.titulo);
        hash = 41 * hash + this.ano;
        hash = 41 * hash + Objects.hashCode(this.genero);
        hash = 41 * hash + Objects.hashCode(this.diretor);
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
        final Filme other = (Filme) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.diretor, other.diretor)) {
            return false;
        }
        if (this.genero != other.genero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Filme{" + "codigo=" + codigo + ", titulo=" + titulo + ", ano=" + ano + ", genero=" + genero + ", diretor=" + diretor + ", atores=" + atores + ", notaDoFilmeEmEventos=" + notaDoFilmeEmEventos + '}';
    }
    
}
