package parsers;

import dao.ConcertDao;
import dao.impl.ConcertDaoImpl;
import entities.Concert;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Илья on 17.12.2016.
 */
public class ConcertParser implements MainParser {
    private String name;
    private String location;
    private String date;
    ConcertDao concertDao = new ConcertDaoImpl();
    volatile int i = 0;
    public synchronized void pars(NodeList nodeList){

        for (int i = 0; i < nodeList.getLength(); i++) {

            Node node = nodeList.item(i);

            if (Node.ELEMENT_NODE == node.getNodeType()) {
                Element element = (Element) node;
                name = element.getElementsByTagName("concertname").item(0).getTextContent();
                location = element.getElementsByTagName("concertlocation").item(0).getTextContent();
                date = element.getElementsByTagName("date").item(0).getTextContent();

            }
            try {
                concertDao.addConcert(new Concert( name, location, date));
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
