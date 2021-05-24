package com.xworkz.sewing.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.sewing.dto.SewingDTO;

public class SewingDAOImpl implements SewingDAO {

	public void save(SewingDTO sewingDTO) {
		System.out.println("Invoked Save");
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(sewingDTO);
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

	public void getSewingData() {
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			SewingDTO sewingDTO = session.get(SewingDTO.class, 2);
			System.out.println(sewingDTO);
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
