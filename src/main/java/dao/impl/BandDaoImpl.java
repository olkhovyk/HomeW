package dao.impl;

import dao.BandDao;
import entities.Band;
import org.hibernate.Session;
import util.HibernateUtil;

import java.sql.SQLException;

/**
 * Created by Илья on 17.12.2016.
 */
public class BandDaoImpl implements BandDao{
    private Session session;

    public BandDaoImpl() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public synchronized void addBand(Band band) throws SQLException, Exception {
        session.beginTransaction();
        session.save(band);
        session.getTransaction().commit();
    }
}
