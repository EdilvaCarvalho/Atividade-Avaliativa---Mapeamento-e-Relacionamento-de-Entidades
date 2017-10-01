
package br.edu.ifpb.dac.cenario1.dao.impl;

import br.edu.ifpb.dac.cenario1.dao.interfaces.ClienteDAO;
import br.edu.ifpb.dac.cenario1.domain.entidades.Cliente;
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
public class ClienteDaoJpaImpl implements ClienteDAO{
    
    private EntityManager em;

    @Override
    public void salvar(Cliente cliente) {
        em = ProdutorEntityManager.criaEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cliente);
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
            Cliente cliente = em.find(Cliente.class, codigo);
            em.remove(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            ProdutorEntityManager.finaliza(em);
        }
    }

    @Override
    public void atualizar(Cliente cliente) {
        em = ProdutorEntityManager.criaEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            ProdutorEntityManager.finaliza(em);
        }
    }

    @Override
    public Cliente getCliente(int codigo) {
        Cliente cliente = null;
        em = ProdutorEntityManager.criaEntityManager();
        try {
            cliente = em.find(Cliente.class, codigo);
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            ProdutorEntityManager.finaliza(em);
        }
        return cliente;
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> clientes = null;
        em = ProdutorEntityManager.criaEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM Cliente c");
            clientes = query.getResultList();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            ProdutorEntityManager.finaliza(em);
        }
        return clientes;
    }

    @Override
    public Cliente autenticar(String email, String senha) {
        Cliente cliente = null;
        em = ProdutorEntityManager.criaEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM Cliente c WHERE c.email = :email AND c.senha = :senha");
            query.setParameter("email", email);
            query.setParameter("senha", senha);
            cliente = (Cliente) query.getSingleResult();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            ProdutorEntityManager.finaliza(em);
        }
        return cliente;
    }
    
}
