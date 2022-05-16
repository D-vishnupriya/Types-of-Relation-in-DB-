package OneToOneRelation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		Configuration con= new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Address.class);
		 ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		 SessionFactory factory= con.buildSessionFactory(reg);
		 Session session= factory.openSession();
		 Transaction t= session.beginTransaction();

		 //create an object for address and student
		
		 Address sadd=new Address();
		 sadd.setCountry("India");
		 sadd.setPincode(560043);
		 sadd.setStreet("AbJ Street");
		 sadd.setState("Karnataka");
		  
		 session.save(sadd);
		 
		 Student sob=new Student();
		 sob.setSname("Poovi");
		 sob.setScourse("AWS");
		 sob.setSid(1);


		 session.save(sob);
		 t.commit();
		 session.close();
		 		
		 
	}

}

