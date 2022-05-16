package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp
{
	public static void main(String[] args)
	{
		Laptop lob=new Laptop();
		lob.setLid(1);
		lob.setLname("samsung");
		lob.setLprice(45000);  // stage is called Transient state
		
		Student sob=new Student();
		sob.setSid(1);
		sob.setSname("Kiran");
	
		
		Configuration conn=new Configuration().configure().addAnnotatedClass(Laptop.class);
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
	//SessionFactory sf= con.buildSessionFactory();  //deprecated
		SessionFactory sf=conn.buildSessionFactory(reg);  //not deprecated
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(lob);
		session.save(sob);
		tx.commit();
	}
		
	
			
	

}
