
package br.edu.ifpb.dac.cenario1.domain.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Edilva
 */
public class ProdutorEntityManager {
    
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("dac-cenario1-PU");
    
    public static EntityManager criaEntityManager(){
        return factory.createEntityManager();
    }
    
    public static void finaliza(EntityManager entityManager){
        entityManager.close();
    }
        
}
