package parsers;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Илья on 17.12.2016.
 */
public class ParserFile {
    MusicianParser musicianParser = new MusicianParser();
    BandParser bandParser = new BandParser();
    ConcertParser concertParser = new ConcertParser();

    public void startParse(String file){
        try{
            final File xmlFile = new File(file);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(xmlFile);

            doc.getDocumentElement().normalize();

            NodeList nodeListMusician = doc.getElementsByTagName("musician");
            musicianParser.pars(nodeListMusician);

            NodeList nodeListBand = doc.getElementsByTagName("band");
            bandParser.pars(nodeListBand);

            NodeList nodeListConcert = doc.getElementsByTagName("concert");
            concertParser.pars(nodeListConcert);

        }
        catch (ParserConfigurationException | SAXException
                | IOException ex) {
            ex.printStackTrace();
        }
    }

}
