package br.edu.ifpb.dac.cenario1.domain.entidades;

import br.edu.ifpb.dac.cenario1.domain.entidades.Cliente;
import br.edu.ifpb.dac.cenario1.domain.enuns.TipoDeConta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-20T07:31:25")
@StaticMetamodel(Conta.class)
public class Conta_ { 

    public static volatile SingularAttribute<Conta, String> senha;
    public static volatile SingularAttribute<Conta, Cliente> cliente;
    public static volatile SingularAttribute<Conta, Integer> codigo;
    public static volatile SingularAttribute<Conta, TipoDeConta> tipoDeConta;
    public static volatile SingularAttribute<Conta, Integer> digitoAgencia;
    public static volatile SingularAttribute<Conta, Long> numeroConta;
    public static volatile SingularAttribute<Conta, Integer> digitoConta;
    public static volatile SingularAttribute<Conta, Double> saldo;
    public static volatile SingularAttribute<Conta, Long> numeroAgencia;

}