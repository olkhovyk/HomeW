package dao;

import entities.Musician;

import java.sql.SQLException;

/**
 * Created by Илья on 17.12.2016.
 */
public interface MusicianDao {
    void addMusician(Musician musician) throws SQLException, Exception;
}
