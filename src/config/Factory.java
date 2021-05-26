/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.wadson.gstock.entities.Category;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
  

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Wadson Dutervil
 */
public class Factory {

    
    
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("G_Stock_ManaPU");
       EntityManager entityManager=entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
        Category category=new Category(0, "Ordinateur");
        entityManager.persist(category);
        entityManager.getTransaction().commit();
    }
}
