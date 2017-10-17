package br.edu.ifpb.dac.dac.cenario2.domain.entidades;

import br.edu.ifpb.dac.dac.cenario2.domain.entidades.Ator;
import br.edu.ifpb.dac.dac.cenario2.domain.entidades.RecebeNota;
import br.edu.ifpb.dac.dac.cenario2.domain.enums.Genero;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-17T13:36:02")
@StaticMetamodel(Filme.class)
public class Filme_ { 

    public static volatile SingularAttribute<Filme, Integer> codigo;
    public static volatile SingularAttribute<Filme, Integer> ano;
    public static volatile SingularAttribute<Filme, Genero> genero;
    public static volatile ListAttribute<Filme, Ator> atores;
    public static volatile SingularAttribute<Filme, String> titulo;
    public static volatile SingularAttribute<Filme, String> diretor;
    public static volatile ListAttribute<Filme, RecebeNota> notaDoFilmeEmEventos;

}