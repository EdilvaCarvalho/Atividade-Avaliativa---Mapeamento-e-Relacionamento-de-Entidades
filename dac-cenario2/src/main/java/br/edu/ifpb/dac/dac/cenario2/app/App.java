
package br.edu.ifpb.dac.dac.cenario2.app;

import br.edu.ifpb.dac.dac.cenario2.domain.entidades.Ator;
import br.edu.ifpb.dac.dac.cenario2.domain.entidades.Evento;
import br.edu.ifpb.dac.dac.cenario2.domain.entidades.Filme;
import br.edu.ifpb.dac.dac.cenario2.domain.entidades.Local;
import br.edu.ifpb.dac.dac.cenario2.domain.entidades.RecebeNota;
import br.edu.ifpb.dac.dac.cenario2.domain.enums.Genero;
import br.edu.ifpb.dac.dac.cenario2.domain.enums.Sexo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Edilva
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ator ator1 = new Ator("Susana Vieira", Sexo.FEMININO, "Brasileira");
        ator1.setCodigo(1);
        
        Ator ator2 = new Ator(2, "Tony Ramos", Sexo.MASCULINO, "Brasileiro", ator1);
        ator1.setParRomantico(ator2);
        
        Local local = new Local("RJ", "Rio de Janeiro", "Bairro Fulano", "Rua Coisinha", "800", "Teatro Alguma Coisa");
        
        Evento evento = new Evento(1, "Festival de Cinema", 2017, local);
        
        Filme filme = new Filme("Inventei agora esse filme", 2016, Genero.COMEDIA_DRAMATICA, "José de Alguma Coisa");
        filme.setCodigo(1);
        filme.addAtor(ator1);
        filme.addAtor(ator2);
        
        RecebeNota recebeNota = new RecebeNota(filme, evento, 5);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dac-cenario2-PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(recebeNota);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
                
    }
    
}
