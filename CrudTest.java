import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CrudTest {

	
	public Flight theFlight= new Flight();
	public static void main(String[] args) throws Exception {
		/*	
		CrudTest.createRecord();
		CrudTest.retrieveRecord();
		CrudTest.updateRecord();
		CrudTest.deleteRecord();
		*/
		System.out.println("Trying to read persistence.xml file...");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager();
		System.out.println("EntityManager created....");
		
		EntityTransaction et = em.getTransaction();
		System.out.println("EntityTransaction created....");
		
		System.out.println("Trying to create record.....");
		Flight theFlight= new Flight();
		//theFlight.setFlightNumber(103);
		/*theFlight.setFlightName("SpiceJet");
		theFlight.setFlightSource("Chennai");
		theFlight.setFlightDestination("Jaipur");
		theFlight.setFlightTicketCost(10000);
		theFlight.setNumberOfPassengers(90);
		theFlight.setFlightDepartureFromSource(LocalDateTime.now());
		theFlight.setFlightArrivalAtDestination(LocalDateTime.now());
		
		et.begin();
			em.persist(theFlight);
		et.commit();
		System.out.println("=================");*/
	
		Query q= em.createNativeQuery("Select *from  Flight_info", Flight.class);
		List <Flight> ft1=(List<Flight>) q.getResultList();
		
		for (Flight list: ft1)
		{
			System.out.println("Flight Number  " +list.getFlightNumber());
			System.out.println("Flight Name  " +list.getFlightName());
			System.out.println("Flight Source  " +list.getFlightSource());
			System.out.println("Flight Destination " +list.getFlightDestination());
			System.out.println("Ticket Cost " +list.getFlightTicketCost());
			System.out.println("No of Passengers " +list.getNumberOfPassengers());
			System.out.println("---*---*---*---*---*---*---*---*---*---*---*---*---*---*---");
		}
		
		et.begin();
			Flight f1 = em.find(Flight.class,46);
			f1.setFlightTicketCost(8500);
			em.merge(f1);
		et.commit();
		System.out.println("Created the record.....");
		
		et.begin();
			Flight f2 = em.find(Flight.class,59);
			em.remove(f2);
		et.commit();
			System.out.println("Deleted the record.....");
		
		et.begin();
			Flight f3 = em.find(Flight.class,51);
			f3.setFlightName("Air Asia");
			em.merge(f3);
		et.commit();
			System.out.println("Updated the record.....");
			
			Flight f4 = em.find(Flight.class,51);
			System.out.println("Flight ID : "+f4.getFlightNumber());
			System.out.println("Flight Name : "+f4.getFlightName());
			System.out.println("Flight Source : "+f4.getFlightSource());
			System.out.println("Flight Destination :"+f4.getFlightDestination());
			System.out.println("Flight Ticket Cost : "+f4.getFlightTicketCost());
			System.out.println("Flight Number of Passengers : "+f4.getNumberOfPassengers());
	
			
			
	}		
/*
	public static void createRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		  EntityManager entityManager = emf.createEntityManager();

		  entityManager.getTransaction().begin();
		  
		  Flight theFlight= new Flight();
			//theFlight.setFlightNumber(103);
			theFlight.setFlightName("SpiceJet");
			theFlight.setFlightSource("Chennai");
			theFlight.setFlightDestination("Jaipur");
			theFlight.setFlightTicketCost(10000);
			theFlight.setNumberOfPassengers(90);
			theFlight.setFlightDepartureFromSource(LocalDateTime.now());
			theFlight.setFlightArrivalAtDestination(LocalDateTime.now());
			
			entityManager.getTransaction().commit();	
	}
	
	  public static  void retrieveRecord() {
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		  EntityManager entityManager = emf.createEntityManager();

		  entityManager.getTransaction().begin();
		 
		  String fnm = String.valueOf(1);
		  Flight f=entityManager.find(Flight.class,fnm);
		  System.out.println(f.getFlightName());

		  entityManager.getTransaction().commit();
		  
		 }
	  public static  void updateRecord() { 
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		  EntityManager entityManager = emf.createEntityManager();
		  entityManager.getTransaction().begin();  
		  Long key = Long.valueOf(2);
		  Flight p = entityManager.find(Flight.class, key);
		  //System.out.println(p.getName());
		  p.setFlightName("AirAsia");

		  entityManager.getTransaction().commit();
		  
	
	  }
	  public static  void deleteRecord() { 
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		  EntityManager entityManager = emf.createEntityManager();

		  entityManager.getTransaction().begin();
		  Long fno= Long.valueOf(1);
		  Flight ft=entityManager.find(Flight.class, fno);
		  entityManager.remove(fno);

		  entityManager.getTransaction().commit();

	  }*/
}	