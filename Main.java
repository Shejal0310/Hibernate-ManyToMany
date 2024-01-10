package Hibernate;

import java.util.ArrayList;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Main 
{
	public static void main(String[] args)
	{
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory = c.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Item a1 = new Item();
		a1.setName("TV");
		a1.setPrice(67980);
		
		Item a2 = new Item();
		a2.setName("AC");
		a2.setPrice(5600);
		
		Item a3 = new Item();
		a3.setName("Washing_Machine");
		a3.setPrice(54769);
		
		Item a4 = new Item();
		a4.setName("Fridge");
		a4.setPrice(97605);
		
		Item a5 = new Item();
		a5.setName("Laptop");
		a5.setPrice(78450);
		
		Customer c1 = new Customer();
		c1.setCustname("Chunni");
		c1.setAddr("Nashik");
		
		Customer c2 = new Customer();
		c2.setCustname("Mau");
		c2.setAddr("Pune");
		
		ArrayList<Item> l1 = new ArrayList<Item>();
		l1.add(a1);
		l1.add(a4);
		l1.add(a2);
		l1.add(a3);
		c1.setItm(l1);
		
		ArrayList<Item> l2 = new ArrayList<Item>();
		l2.add(a1);
		l2.add(a5);
		l2.add(a4);
		l2.add(a3);
		c2.setItm(l2);
		
		session.persist(c1);
		session.persist(c2);
		t.commit();
		session.close();
	}
}