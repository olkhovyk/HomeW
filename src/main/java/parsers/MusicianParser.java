package parsers;

import dao.MusicianDao;
import dao.impl.MusicianDaoImpl;
import entities.Musician;
import org.hibernate.sql.ordering.antlr.Factory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Илья on 17.12.2016.
 */
public class MusicianParser implements MainParser {
    private String firstname;
    private String lastname;
    private int age;
    private String instrument;
    MusicianDao musicianDao = new MusicianDaoImpl();
    volatile int i = 0;
    public synchronized void pars(NodeList nodeList){

        for (int i = 0; i < nodeList.getLength(); i++) {

            Node node = nodeList.item(i);

            if (Node.ELEMENT_NODE == node.getNodeType()) {
                Element element = (Element) node;
                firstname = element.getElementsByTagName("firstname").item(0).getTextContent();
                lastname = element.getElementsByTagName("lastname").item(0).getTextContent();
                age = Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent());
                instrument = element.getElementsByTagName("instrument").item(0).getTextContent();

            }
            try {

                musicianDao.addMusician(new Musician(firstname, lastname, age, instrument));
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
