package com.xworkz.instagram.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.instagram.dto.InstagramDTO;

public class InstagramDAOImpl implements InstagramDAO {

	public void save(InstagramDTO instagramDTO) {
		System.out.println("Invoked Save");
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(instagramDTO);
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

	public void getInstagramData() {
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			InstagramDTO instagramDTO = session.get(InstagramDTO.class, 2);
			System.out.println(instagramDTO);
		} catch (Exception e) {

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
