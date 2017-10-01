package br.edu.ifpb.dac.dac.cenario2.domain.entidades;

import br.edu.ifpb.dac.dac.cenario2.domain.entidades.Evento;
import br.edu.ifpb.dac.dac.cenario2.domain.entidades.Filme;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-16T14:07:31")
@StaticMetamodel(NotaDoFilmeEmEvento.class)
public class NotaDoFilmeEmEvento_ { 

    public static volatile SingularAttribute<FilmeEvento, Evento> evento;
    public static volatile SingularAttribute<FilmeEvento, Float> nota;
    public static volatile SingularAttribute<FilmeEvento, Filme> filme;

}