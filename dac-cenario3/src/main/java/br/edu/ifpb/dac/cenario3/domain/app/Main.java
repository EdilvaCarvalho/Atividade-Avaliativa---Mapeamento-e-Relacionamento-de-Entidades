package br.edu.ifpb.dac.cenario3.domain.app;

import br.edu.ifpb.dac.cenario3.domain.entidades.Carga;
import br.edu.ifpb.dac.cenario3.domain.entidades.Comandante;
import br.edu.ifpb.dac.cenario3.domain.entidades.Navio;
import br.edu.ifpb.dac.cenario3.domain.entidades.Produto;
import br.edu.ifpb.dac.cenario3.domain.entidades.Transporte;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Edilva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Comandante comandante = new Comandante("Capitão Jack Sparrow", "Caribe");
        
        Navio navio = new Navio(1, "Pérola Negra", 100000, "Caribe");
        comandante.addNavio(navio);
        
        Produto produto1 = new Produto("Alimentício", "Chocolate");
        Produto produto2 = new Produto("Informática", "Computador");
        Produto produto3 = new Produto("Eletrodoméstico", "Geladeira");
        
        Carga carga = new Carga(1, "Cajazeiras", "João Pessoa");
        
        Transporte transporte = new Transporte(navio, carga, LocalDate.of(2017, Month.OCTOBER, 23), 2500);
        transporte.addProduto(produto1);
        transporte.addProduto(produto2);
        transporte.addProduto(produto3);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dac-cenario3-PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(transporte);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}
