package com.hibernateproject;

import java.sql.DriverManager;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.mysql.jdbc.Connection;

public class HibernateTest {
	
//	public static void main(String[] args) {
//			
//			Configuration configuration = new Configuration();
//			
//			configuration.configure("hibernate.cfg.xml");
//			
//			SessionFactory sessionFactory = configuration.buildSessionFactory();
//			
//			Session session = sessionFactory.openSession();
//			
//			String sql = "select * from student";
//			
//			List<Student> list = session.createSQLQuery(sql).addEntity(Student.class).list();
//			
//			for(Student stu : list) {
//				
//				System.out.println(stu.getId() + " ---------- "+ stu.getName() + " ---------- " + stu.getAge());
//				
//			}
//			
//			String insertsql = "insert into student set id=?,name=?,age=?";
//			
//			int i = session.createSQLQuery(insertsql).setParameter(0, 3).setParameter(1, "abc").setParameter(2, "14").executeUpdate();
//			
//			System.out.println(i);
//			
//			session.close();
//			
//			sessionFactory.close();
//		
//	}
	
	@Test
	public void test() {
		
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "root";
		Connection connection = null;
		
		try {
			
			connection = (Connection) DriverManager.getConnection(url, username, password);
			
			System.out.println(connection.getAutoSlowLog());
			
			if(connection != null) {
				
				connection.close();
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}
