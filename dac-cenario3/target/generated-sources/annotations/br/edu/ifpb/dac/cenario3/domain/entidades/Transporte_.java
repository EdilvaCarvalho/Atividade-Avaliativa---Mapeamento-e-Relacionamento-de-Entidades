package br.edu.ifpb.dac.cenario3.domain.entidades;

import br.edu.ifpb.dac.cenario3.domain.entidades.Carga;
import br.edu.ifpb.dac.cenario3.domain.entidades.Navio;
import br.edu.ifpb.dac.cenario3.domain.entidades.Produto;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-17T14:05:14")
@StaticMetamodel(Transporte.class)
public class Transporte_ { 

    public static volatile SingularAttribute<Transporte, Integer> codTransporte;
    public static volatile SingularAttribute<Transporte, Navio> navio;
    public static volatile ListAttribute<Transporte, Produto> produtos;
    public static volatile SingularAttribute<Transporte, Double> valor;
    public static volatile SingularAttribute<Transporte, LocalDate> dataTransporte;
    public static volatile SingularAttribute<Transporte, Carga> carga;

}