package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("apple");
		
	EntityManager em = factory.createEntityManager();
	
	em.getTransaction().begin();

	
//	em.persist(emp);  //insert
	
//	em.merge(emp);  //update
	
//	System.out.println(em.find(Employee.class, 100));   //select
	
	Employee emp = em.find(Employee.class, 100);
	
	em.remove(emp);
	
	
	em.getTransaction().commit();
	
	em.close();
	
	}

}
