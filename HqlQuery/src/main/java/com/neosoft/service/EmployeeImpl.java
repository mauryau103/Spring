package com.neosoft.service;



import java.util.List;
import java.util.function.Consumer;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.neosoft.model.Employee;

public class EmployeeImpl{ 
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		//SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		

		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		//------------to add----------
		Employee e=new Employee("Mayur",30000d,"developer");
		session.save(e);
		
		
		//--------to fetch data by using get and load
		//load is faster than get
		//if you are not sure if enry is not exist then you should use get
		// if you are sure then go with load
	//Employee eget=session.get(Employee.class,4);
//		
//		Employee eload=session.load(Employee.class, 3);
//		System.out.println(eload);

		//System.out.println(eget);
		//Employee eget1=session.get(Employee.class,4);
		//System.out.println(eget1);
		
		///----------to update
		
//		Employee e1=session.get(Employee.class,1);
//		e1.setDesignation("Software developer");
//		session.update(e1);
		
		
		
		///hql queries
		
//		Query q=session.createQuery("from Employee");
//		List<Employee>l=q.list();
//		Consumer<Employee>c=(e)->{System.out.println(e.getEmployeeId()+" "+
//		e.getEmployeeName()+" "+e.getDesignation()+" "+e.getSalary());};
//		for(Employee e:l) {
//		c.accept(e);
//		}
		
		///get employee by name
	
//		Query  q=session.createQuery("SELECT employeeName FROM Employee");
//		List<String>l=q.list();
//		for(String e:l) {
//		
//			System.out.println(e);
//		}
		
		
		//prepared statement
		
//		String name="Lokesh";
//		Query q=session.createQuery("FROM Employee e  Where e.employeeName=:name");
//		q.setParameter("name", name);
//		List<Employee>e=q.list();
//		for(Employee e1:e) {
//			System.out.println(e1);
//		}
		
		///For Normal Sql Query
		
//		SQLQuery q=session.createSQLQuery("select * from employee");
//		q.addEntity(Employee.class);
//		List<Employee>l=q.list();
//		for(Employee e:l) {
//			System.out.println(e);
//		}
		
		
		/// ------------update sql query
//		String name="Lokesh Chaudhari";
//		int id=1;
//		SQLQuery q=session.createSQLQuery("update employee set  employee_name=:name where employee_id=:id");
//		q.setParameter("name", name);
//		q.setParameter("id", id);
//		q.addEntity(Employee.class);
//		q.executeUpdate();
		
		
		
		////--------update hql query
		
//		Query q=session.createQuery("UPDATE Employee set salary=:salary WHERE employeeName=:name ");
//		String name="Lokesh";
//		double salary=50000d;
//		q.setParameter("salary", salary);
//		q.setParameter("name", name);
//		int result=q.executeUpdate();
		
		
		////---------criteria
//		
//		Criteria c=session.createCriteria(Employee.class);
//		c.add(Restrictions.gt("salary", 10000d));
//	
//		
//		List <Employee>e=c.list();
//		for(Employee e1:e) {
//			System.out.println(e1);
//			
//		}
		
		
		///-----------projections --> particular column fetching 
//		Criteria c=session.createCriteria(Employee.class);
//		c.setProjection(Projections.property("employeeName"));
//		List<String>l=c.list();
//		for(String n:l) {
//			System.out.println(n);
//		}
//		
		Criteria c=session.createCriteria(Employee.class);
//		Projection pr = Projections.property("salary");
//		Projection pr = Projections.sum("salary");
		Projection pr = Projections.avg("salary");
		c.setProjection(pr);
		List<Double>l=c.list();
		for(double n:l) {
			System.out.println(n);
		}
		
//		TypedQuery q=session.getNamedQuery("byName");
//		q.setParameter("name", "Mayur");
//		List<Employee>list=q.getResultList();
//		Consumer<Employee>c1=(e)->
//		System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getDesignation()+" "+e.getSalary());
//		for(Employee e:list) {
//			c1.accept(e);
//		}
//		
		tx.commit();
		session.close();
		sf.close();
		
		
		
	}
}
