package com.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class one_To_one_Main {

    public static void main(String[] args) {

        Configuration con = new Configuration();
        SessionFactory factory = con.configure("hibernate.cfg.xml").buildSessionFactory();

        Students st = new Students();
        st.setsId(121);
        st.setName("kamlesh");
        st.setCity("indor");

        Subject sub = new Subject();
        sub.setSub_id(11);
        sub.setSub_name("English");
        st.setSubject(sub);

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        s.save(st);
        s.save(sub);

        tx.commit();
        s.close();
        factory.close();

        System.out.println("Insert data successfully");
    }
}
