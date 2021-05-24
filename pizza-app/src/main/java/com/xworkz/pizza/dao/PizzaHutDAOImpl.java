package com.xworkz.pizza.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.pizza.dto.PizzaHutDTO;

public class PizzaHutDAOImpl implements PizzaHutDAO {

	public void save(PizzaHutDTO pizzaHutDTO) {
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(pizzaHutDTO);
			transaction.commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session closed");
			} else {
				System.out.println("Session not closed");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("SessionFactory Closed");

			} else {
				System.out.println("SessionFactory not closed");
			}
		}

	}

	@Override
	public void getPizzaData() {
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			PizzaHutDTO pizzaHutDTO = session.get(PizzaHutDTO.class, 1);
			System.out.println(pizzaHutDTO);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session closed");
			} else {
				System.out.println("Session not closed");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("SessionFactory Closed");

			} else {
				System.out.println("SessionFactory not closed");
			}
		}

	}

}
