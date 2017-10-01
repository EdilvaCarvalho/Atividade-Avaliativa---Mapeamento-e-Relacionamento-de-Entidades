
package br.edu.ifpb.dac.cenario1.dao.interfaces;

import br.edu.ifpb.dac.cenario1.domain.entidades.Cliente;
import java.util.List;

/**
 *
 * @author Edilva
 */
public interface ClienteDAO {
    
    void salvar(Cliente cliente);
    void remover(int codigo);
    void atualizar(Cliente cliente);
    Cliente getCliente(int codigo);
    List<Cliente> listar();
    Cliente autenticar(String email, String senha);
}
