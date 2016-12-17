package entities;

import javax.persistence.*;

/**
 * Created by Илья on 17.12.2016.
 */
@Entity
@Table(name = "concert")
public class Concert {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_CONCERT")
    @SequenceGenerator(name = "SEQUENCE_CONCERT", sequenceName = "SEQUENCE_CONCERT", allocationSize = 1, initialValue = 1)
    private int id;
    @Column(name = "nameOfConcert")
    private String nameOfConcert;
    @Column(name = "concertLocation")
    private String concertLocation;
    @Column(name = "concertDate")
    private String date;

    public Concert(String nameOfConcert, String concertLocation, String date) {
        this.nameOfConcert = nameOfConcert;
        this.concertLocation = concertLocation;
        this.date = date;
    }

    public Concert() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfConcert() {
        return nameOfConcert;
    }

    public void setNameOfConcert(String nameOfConcert) {
        this.nameOfConcert = nameOfConcert;
    }

    public String getConcertLocation() {
        return concertLocation;
    }

    public void setConcertLocation(String concertLocation) {
        this.concertLocation = concertLocation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "nameOfConcert='" + nameOfConcert + '\'' +
                ", concertLocation='" + concertLocation + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
