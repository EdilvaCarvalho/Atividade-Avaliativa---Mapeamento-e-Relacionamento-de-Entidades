
package br.edu.ifpb.dac.cenario1.dao.impl;

import br.edu.ifpb.dac.cenario1.dao.interfaces.ContaDAO;
import br.edu.ifpb.dac.cenario1.domain.entidades.Conta;
import br.edu.ifpb.dac.cenario1.domain.util.ProdutorEntityManager;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Edilva
 */
public class ContaDaoJpaImpl implements ContaDAO{
    
    private EntityManager em;

    @Override
    public void salvar(Conta conta) {
        em = ProdutorEntityManager.criaEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(conta);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            ProdutorEntityManager.finaliza(em);
        }
    }

    @Override
    public void remover(int codigo) {
        em = ProdutorEntityManager.criaEntityManager();
        try {
            em.getTransaction().begin();
            Conta conta = em.find(Conta.class, codigo);
            em.remove(conta);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            ProdutorEntityManager.finaliza(em);
        }
    }

    @Override
    public void atualizar(Conta conta) {
        em = ProdutorEntityManager.criaEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(conta);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            ProdutorEntityManager.finaliza(em);
        }
    }

    @Override
    public Conta getConta(int codigo) {
        Conta conta = null;
        em = ProdutorEntityManager.criaEntityManager();
        try {
            conta = em.find(Conta.class, codigo);
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            ProdutorEntityManager.finaliza(em);
        }
        return conta;
    }

    @Override
    public List<Conta> listar() {
        List<Conta> contas = null;
        em = ProdutorEntityManager.criaEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM Conta c");
            contas = query.getResultList();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            ProdutorEntityManager.finaliza(em);
        }
        return contas;
    }

    @Override
    public void alterarSenha(Conta conta, String novaSenha) {
        em = ProdutorEntityManager.criaEntityManager();
        try {
            em.getTransaction().begin();
            conta.setSenha(novaSenha);
            em.merge(conta);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            ProdutorEntityManager.finaliza(em);
        }
    }
    
}
