package parsers;

import dao.impl.BandDaoImpl;
import entities.Band;
import org.hibernate.sql.ordering.antlr.Factory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Илья on 17.12.2016.
 */
public class BandParser implements MainParser {
    private String name;
    private String location;
    private int members;
    private String style;

    BandDaoImpl session = new BandDaoImpl();
    volatile int i = 0;
    public synchronized void pars(NodeList nodeList){

        for (int i = 0; i < nodeList.getLength(); i++) {

            Node node = nodeList.item(i);

            if (Node.ELEMENT_NODE == node.getNodeType()) {
                Element element = (Element) node;
                name = element.getElementsByTagName("name").item(0).getTextContent();
                location = element.getElementsByTagName("location").item(0).getTextContent();
                style = element.getElementsByTagName("style").item(0).getTextContent();
                members = Integer.parseInt(element.getElementsByTagName("numofmembers").item(0).getTextContent());
            }

            try {
                session.addBand(new Band(name, location, members, style));
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
