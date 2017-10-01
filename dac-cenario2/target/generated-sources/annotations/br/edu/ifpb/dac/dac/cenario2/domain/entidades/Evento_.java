package br.edu.ifpb.dac.dac.cenario2.domain.entidades;

import br.edu.ifpb.dac.dac.cenario2.domain.entidades.Local;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-16T14:07:31")
@StaticMetamodel(Evento.class)
public class Evento_ { 

    public static volatile SingularAttribute<Evento, Long> codigo;
    public static volatile SingularAttribute<Evento, Integer> ano;
    public static volatile SingularAttribute<Evento, String> nome;
    public static volatile SingularAttribute<Evento, Local> local;

}