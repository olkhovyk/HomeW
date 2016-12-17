package dao.impl;

import dao.ConcertDao;
import entities.Concert;
import org.hibernate.Session;
import util.HibernateUtil;

import java.sql.SQLException;

/**
 * Created by Илья on 17.12.2016.
 */
public class ConcertDaoImpl implements ConcertDao{
    private Session session;

    public ConcertDaoImpl() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public synchronized void addConcert(Concert concert) throws SQLException, Exception {
        session.beginTransaction();
        session.save(concert);
        session.getTransaction().commit();
    }
}
