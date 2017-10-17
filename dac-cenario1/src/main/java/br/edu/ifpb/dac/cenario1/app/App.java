
package br.edu.ifpb.dac.cenario1.app;

import br.edu.ifpb.dac.cenario1.dao.impl.ClienteDaoJpaImpl;
import br.edu.ifpb.dac.cenario1.dao.interfaces.ClienteDAO;
import br.edu.ifpb.dac.cenario1.domain.entidades.Cliente;
import br.edu.ifpb.dac.cenario1.domain.entidades.Conta;
import br.edu.ifpb.dac.cenario1.domain.entidades.Endereco;
import br.edu.ifpb.dac.cenario1.domain.enuns.TipoDeConta;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Edilva
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endereco endereco = new Endereco("PB", "Cajazeiras", "Centro", "Juvêncio Carneiro", "198");
        Cliente cliente = new Cliente("Maria da Silva", "111.111.111-01", "2223431", 
                LocalDate.of(1989, Month.MARCH, 10), "(83) 98111-2233", "maria@gmail.com", 
                "12345", endereco);
        
        ClienteDAO clienteDAO = new ClienteDaoJpaImpl();
        clienteDAO.salvar(cliente);
        System.out.println(clienteDAO.getCliente(1).toString());
        
        Conta conta = new Conta(11011, 1, 4321, 0, 0, "123123", TipoDeConta.POUPANCA);
        Cliente cliente1 = clienteDAO.getCliente(1);
        cliente1.setConta(conta);
        clienteDAO.atualizar(cliente1);
    }
    
}
