package AOOP_COM.Hobbs;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class hobbsmain {

	public static void main(String[] args) {
		
		Student item1 = new Student( 10, "ready","ready","ready");
		Student item2 = new Student( 20, "ady","eady","rdy");
		Student item3 = new Student( 40, "y","dy","ady");
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		
		
		try{
		//Get Session
		
			System.out.println("test pass");
		sessionFactory = (SessionFactory) HibernateUtil.getSessionFactory();
		System.out.println("test pass 2");
		session = sessionFactory.getCurrentSession();
		System.out.println("test pass 3");
		System.out.println("Session created");
		System.out.println("test pass 4");
		//start transaction
		tx = session.beginTransaction();

		//Save the Model objects
		
		session.save(item1);
		;

		//Commit transaction
		tx.commit();
		
		}catch(Exception e){
			System.out.println("Exception occured. "+e.getMessage());
			e.printStackTrace();
		}finally{
			if(!sessionFactory.isClosed()){
				System.out.println("Closing SessionFactory");
				sessionFactory.close();
			}
		}

	}

	}


