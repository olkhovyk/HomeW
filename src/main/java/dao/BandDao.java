package dao;

import entities.Band;

import java.sql.SQLException;

/**
 * Created by Илья on 17.12.2016.
 */
public interface BandDao {
    void addBand(Band band) throws SQLException, Exception;
}
