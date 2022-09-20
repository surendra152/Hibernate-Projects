package com.sts.hibernet;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.sts.hibernet.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started.." );
        
        Configuration cf=new Configuration();
        cf.configure("hibernat.cfg.xml");
        SessionFactory factory=cf.buildSessionFactory();
        
        
       //creating student
        Student st=new Student();
        st.setId(100);
        st.setName("Don");
        st.setCity("Paris");
       
        System.out.println(st);
        
        
        //creating object of address
        Address ad=new Address();
        ad.setStreet("street1");
        ad.setCity("Munbai");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(123.34);
        
        //Reading img
        FileInputStream fis=new FileInputStream("src/main/java/wipro.png");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session ss=factory.openSession();
        Transaction tx= ss.beginTransaction();
        
        ss.save(st);
        ss.save(ad);
        tx.commit();
        
        ss.close();
        System.out.println("Done");
    }
}
