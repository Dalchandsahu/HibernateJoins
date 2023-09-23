package manyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		SessionFactory factory = con.configure("hibernate.cfg.xml").buildSessionFactory();
        
		Worker wr = new Worker();
		wr.setWid(2);
		wr.setName("Radhe");
		
		Worker wr1 = new Worker();
		wr1.setWid(3);
		wr1.setName("Krishan");
		
		Project p1 =new Project();
		p1.setPid(99);
		p1.setProjectName("Systems Solution");
		
		Project p2 =new Project();
		p2.setPid(98);
		p2.setProjectName("Web Word Solution ");
		
		
		List<Worker> list1 = new ArrayList<>();
		list1.add(wr1);
		list1.add(wr);
		
		List<Project> list2 = new ArrayList<>();
		list2.add(p1);
		list2.add(p2);	
		
		//
		wr.setProjects(list2);
		p2.setWorkers(list1);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(wr);
		s.save(wr1);
		s.save(p1);
		s.save(p2);
		
		tx.commit();
		s.close();
		factory.close();
	}
}
