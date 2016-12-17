import dao.BandDao;
import dao.ConcertDao;
import dao.MusicianDao;
import dao.impl.BandDaoImpl;
import dao.impl.ConcertDaoImpl;
import dao.impl.MusicianDaoImpl;


/**
 * Created by Илья on 17.12.2016.
 */
public class Factory {
    private static Factory instance = null;
    private static BandDao bandDao = null;
    private static ConcertDao concertDao = null;
    private static MusicianDao musicianDao = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public BandDao getBandDao(){
        if(bandDao == null){
            bandDao = new BandDaoImpl();
        }
        return bandDao;
    }

    public ConcertDao getConcertDao(){
        if(concertDao == null){
            concertDao = new ConcertDaoImpl();
        }
        return concertDao;
    }

    public MusicianDao getMusicianDao(){
        if(musicianDao == null){
            musicianDao = new MusicianDaoImpl();
        }
        return musicianDao;
    }
}
