package com.hibernate.com.map;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("Emp-Config.xml");
        System.out.println("Configuration Object Created Successfully");
        SessionFactory sf=cfg.buildSessionFactory();
        System.out.println("Session Factory Object Created Successfully");
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Emp e=new Emp();
        e.setId("101");
        e.setName("Ke Chen");
//        e.setAddress(new HashMap<Integer, Address>());
        
        Map<Integer, Address> myAddress = new HashMap<>();
        
        Address  address1 = new Address();
        address1.setAid("001");
        address1.setState("Maryland");
        address1.setCountry("USA");
        Address address2 = new Address();
        address2.setAid("002");
        address2.setState("Washington");
        address2.setCountry("USA");

        myAddress.put(178, address1);
        myAddress.put(168, address2);
        e.setAddress(myAddress);
//        s.save(e);
        s.persist(e);
        t.commit();
        System.out.println("one person has two phoneno");
        s.close();
        sf.close();
        
    }
}
