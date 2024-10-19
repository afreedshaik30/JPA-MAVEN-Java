package com.telusko.main;

import com.telusko.entity.Alien;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	    Alien a1 = new Alien();
    	    a1.setAid(502);
    	    a1.setAname("Vampire");
    	    a1.setColor("black and white");

    	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pf");
    	    EntityManager em = emf.createEntityManager();
//  1.INSERT 
//    	    em.getTransaction().begin();
//    	    em.persist(a1);
//    	    em.getTransaction().commit();

// 2. SELECT by ID   	    
            Alien a2 = em.find(Alien.class, 501);
            System.out.println(a2);
            
            Alien a3 = em.find(Alien.class, 502);
            System.out.println(a3);
    }
}
