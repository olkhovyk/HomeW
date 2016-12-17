package dao.impl;

import dao.MusicianDao;
import entities.Musician;
import org.hibernate.Session;
import util.HibernateUtil;

import java.sql.SQLException;

/**
 * Created by Илья on 17.12.2016.
 */
public class MusicianDaoImpl implements MusicianDao {
    private Session session;

    public MusicianDaoImpl() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public synchronized void addMusician(Musician musician) throws SQLException, Exception {
        session.beginTransaction();
        session.save(musician);
        session.getTransaction().commit();
    }
}
