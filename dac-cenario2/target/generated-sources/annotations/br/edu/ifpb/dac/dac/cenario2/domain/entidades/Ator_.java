package br.edu.ifpb.dac.dac.cenario2.domain.entidades;

import br.edu.ifpb.dac.dac.cenario2.domain.entidades.Ator;
import br.edu.ifpb.dac.dac.cenario2.domain.enums.Sexo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-16T14:07:31")
@StaticMetamodel(Ator.class)
public class Ator_ { 

    public static volatile SingularAttribute<Ator, Long> codigo;
    public static volatile SingularAttribute<Ator, Ator> parRomantico;
    public static volatile SingularAttribute<Ator, String> nome;
    public static volatile SingularAttribute<Ator, Sexo> sexo;
    public static volatile SingularAttribute<Ator, String> nacionalidade;

}