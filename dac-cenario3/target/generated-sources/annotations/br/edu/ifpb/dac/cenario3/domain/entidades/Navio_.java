package br.edu.ifpb.dac.cenario3.domain.entidades;

import br.edu.ifpb.dac.cenario3.domain.entidades.Comandante;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-16T20:32:09")
@StaticMetamodel(Navio.class)
public class Navio_ { 

    public static volatile SingularAttribute<Navio, Integer> codNavio;
    public static volatile SingularAttribute<Navio, Comandante> comandante;
    public static volatile SingularAttribute<Navio, Double> capacidade;
    public static volatile SingularAttribute<Navio, String> nome;
    public static volatile SingularAttribute<Navio, String> pais;

}