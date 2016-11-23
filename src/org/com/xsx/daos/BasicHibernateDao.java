package org.com.xsx.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Work;

public class BasicHibernateDao {

	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void DoSql(String sql) {
		getSession().doWork(new Work() {
			
			@Override
			public void execute(Connection arg0) throws SQLException {
				// TODO Auto-generated method stub
				PreparedStatement pStatement = arg0.prepareStatement(sql);
				pStatement.executeUpdate();
			}
		});
	}
}
