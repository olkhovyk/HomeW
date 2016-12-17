package dao;

import entities.Concert;

import java.sql.SQLException;

/**
 * Created by Илья on 17.12.2016.
 */
public interface ConcertDao{
        void addConcert(Concert concert) throws SQLException, Exception;
}
