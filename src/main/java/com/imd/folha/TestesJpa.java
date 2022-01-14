package com.imd.folha;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.imd.folha.model.Pessoa;

public class TestesJpa {
    public static void main(String[] args) {
        
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
     
    // Estado novo
    Pessoa pessoa = new Pessoa();
    pessoa.setNome("José Silva");
    
    entityManager.getTransaction().begin();
    
    // Estado gerenciado
    entityManager.persist(pessoa);
    
    // Estado desanexado (nenhuma operação será feita)
    entityManager.detach(pessoa);
    
    // Volta ao estado gerenciado 
    pessoa = entityManager.merge(pessoa);
    
    // Estado removido (será removido da base de dados)
    entityManager.remove(pessoa);
    
    entityManager.getTransaction().commit();
    
    entityManager.close();
    entityManagerFactory.close();

    }
}
