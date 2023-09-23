package TwopToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {
	
     public static void main(String[] args) {
	 
    	 Configuration con = new  Configuration();
    	 SessionFactory factory = con.configure("hibernate.cfg.xml").buildSessionFactory();
    	 
    	 Shops s = new Shops();
    	 s.setShop_id(99);
    	 s.setShop_name("Steels");
    	 s.setShop_city("Raipur");
    	 
    	 Shops s1 = new Shops();
    	 s1.setShop_id(88);
    	 s1.setShop_name("Plastic Pipe");
    	 s1.setShop_city("Pune");
    	 
    	 Shops s2 = new Shops();
    	 s2.setShop_id(77);
    	 s2.setShop_name("food");
    	 s2.setShop_city("Mungeli");
    	 
    	 List<Shops> list =new ArrayList<>();
    	 list.add(s);
    	 list.add(s1);
    	 list.add(s2);
    	 
    	 TypeOfShop ts = new TypeOfShop();
    	 ts.setShop_id(12);
    	 ts.setShop_type("General");
    	 
    	 Session se = factory.openSession();
    	 Transaction tx = se.beginTransaction();
    	 
    	 se.save(s);
    	 se.save(s1);
    	 se.save(s2);
    	 se.save(ts);

    	 
    	 tx.commit();
    	 se.close();
    	 factory.close();
    	 
    	 System.out.println("Program successfully");
}
}
