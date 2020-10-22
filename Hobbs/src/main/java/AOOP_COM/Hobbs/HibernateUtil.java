



package AOOP_COM.Hobbs;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {

	
	 private static SessionFactory sessionFactory = null;
	 
	    static {
	        try{
	            loadSessionFactory();
	        }catch(Exception e){
	            System.err.println("Exception while initializing hibernate util.. ");
	            e.printStackTrace();
	        }
	    }
	 
	    public static void loadSessionFactory(){
	 
	        Configuration configuration = new Configuration();
	        
	        configuration.configure("hibe.cfg.xml");
	        configuration.addAnnotatedClass(Student.class);  //Add classes to the configuration
	      //  configuration.addAnnotatedClass(Item.class);  //**** Add classes to the configuration
	       // configuration.addAnnotatedClass(Cart.class);  //**** Add classes to the configuration
	 
	       
	        ServiceRegistry service = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	      
	        sessionFactory = configuration.buildSessionFactory(service);
}
	    
	    
	    public static Session getSessionFactory() throws HibernateException {
	    	System.out.println("test pass session");
	        
	    	Session retSession=null;
	            try {
	            	
	                retSession = sessionFactory.openSession();
	                System.out.println("test sessionFactory.openSession");
	            }catch(Throwable t){
	            System.err.println("Exception while getting session.. ");
	            t.printStackTrace();
	            System.out.println("fail");
	            }
	            if(retSession == null) {
	                System.err.println("session is discovered null");
	            }
	 
	            return retSession;
	    }
}
