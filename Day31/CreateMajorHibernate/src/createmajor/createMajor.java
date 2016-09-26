package createmajor;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ssa.Major;


public class createMajor {
	
	public static void main(String[] args) {
		selectMajor();
		insertMajor();
		selectMajor();
		updateMajor();
		selectMajor();
		deleteMajor();
		selectMajor();
	}
	
	// Create-Insert Method
	public static void insertMajor() {
	SessionFactory factory =new  Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Major.class)
			.buildSessionFactory();
	
	Session session=factory.getCurrentSession();
	try{
		
		Major maj1 = new Major(8, "Hacking", 1600);
		Major maj2 = new Major(9, "Cyber Security", 1400);
		Major maj3 = new Major(10, "Data Mining", 1350);
		Major maj4 = new Major(11, "Digital Computation", 1200);
		Major maj5 = new Major(12, "Software Development", 1500);
		
		// begin transaction
		session.beginTransaction();

		session.save(maj1);
		session.save(maj2);
		session.save(maj3);
		session.save(maj4);
		session.save(maj5);

		System.out.println();
		System.out.println("Records have been inserted");
		session.getTransaction().commit();

	}catch(Exception ex){ex.printStackTrace();}
	finally{
		factory.close();
		}
	}
	
	
	
	// Update Method
	public static void updateMajor() {
	SessionFactory factory =new  Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Major.class)
			.buildSessionFactory();
	
	Session session=factory.getCurrentSession();
	try{
		
//		int majorId = 9;
//		// begin transaction
//		session.beginTransaction();
//		
//		Major major =session.get(Major.class, majorId);
//		major.setMajorDescription("Hibernate");
//
//		//System.out.println("New Record" + major);
//		session.getTransaction().commit();
		
//		//New Code for Updating Data

		session.beginTransaction();
		session.createQuery("update Major set score = 1100 where id < 4 ").executeUpdate();
		System.out.println();
		System.out.println("Records have been updated");
		session.getTransaction().commit();

	}catch(Exception ex){ex.printStackTrace();}
	finally{
		factory.close();
		}
	}
	
	
	
	// Delete Method
	public static void deleteMajor() {
	SessionFactory factory =new  Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Major.class)
			.buildSessionFactory();
	
	Session session=factory.getCurrentSession();	
	try{
		
//		int id = 12;
//		// begin transaction
		session.beginTransaction();
//		
//		Major major=session.get(Major.class, id);
//		session.delete(major);
		//alternate way to delete data
		session.createQuery("delete Major where id > 7").executeUpdate();
		System.out.println();
		System.out.println("Records have been deleted");
		
		//System.out.println("New Record" + major);
		session.getTransaction().commit();
	
	}catch(Exception ex){ex.printStackTrace();}
	finally{
		factory.close();
		}
	}
	
	
	
	// Select-Fetch Method
	public static void selectMajor() {
	SessionFactory factory =new  Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Major.class)
			.buildSessionFactory();
	
	Session session=factory.getCurrentSession();	
	try{
		
		// begin transaction
		session.beginTransaction();
		
		List<Major> majors = session.createQuery("from Major").list();
		
		//display student
		System.out.println();
		System.out.println("Below are details for each major currently available");
		System.out.println();
		System.out.println("ID    Description                Score");
		System.out.println("======================================");
		display(majors);
//		int id = majors.get("id");
//		String description = majors.;
//		int score = getScore("score");
//		String msg= String.format("%3d %-15s %-4d", majors.id, majors.description, majors.score);
//		System.out.println(msg);
		
		//alternate way to select data
		
		//students=session.createQuery("from Major m where m.descripion="Hacking"
		//System.out.println("Single Record");

		session.getTransaction().commit();
	
	}catch(Exception ex){ex.printStackTrace();}
	finally{
		factory.close();
	}
}	
	

	
	public static void display(List<Major> majors) {
		for(Major major: majors){
			//System.out.println(major.toString());
		String msg= String.format("%-5d %-20s %10d", major.getId(), major.getDescription(), major.getScore());
		System.out.println(msg);
		}
	}
	
	
}
