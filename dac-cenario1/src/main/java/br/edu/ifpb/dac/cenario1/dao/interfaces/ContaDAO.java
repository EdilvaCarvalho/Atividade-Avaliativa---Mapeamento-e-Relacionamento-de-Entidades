
package br.edu.ifpb.dac.cenario1.dao.interfaces;

import br.edu.ifpb.dac.cenario1.domain.entidades.Conta;
import java.util.List;

/**
 *
 * @author Edilva
 */
public interface ContaDAO {
    
    void salvar(Conta conta);
    void remover(int codigo);
    void atualizar(Conta conta);
    Conta getConta(int codigo);
    List<Conta> listar();
    void alterarSenha(Conta conta, String novaSenha);
}
