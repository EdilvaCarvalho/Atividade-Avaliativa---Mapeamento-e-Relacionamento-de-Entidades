package br.edu.ifpb.dac.cenario3.domain.entidades;

import br.edu.ifpb.dac.cenario3.domain.entidades.Navio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-17T14:05:14")
@StaticMetamodel(Comandante.class)
public class Comandante_ { 

    public static volatile SingularAttribute<Comandante, Integer> idComandante;
    public static volatile ListAttribute<Comandante, Navio> navios;
    public static volatile SingularAttribute<Comandante, String> nome;
    public static volatile SingularAttribute<Comandante, String> pais;

}