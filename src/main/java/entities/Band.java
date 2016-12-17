package entities;

import javax.persistence.*;

/**
 * Created by Илья on 17.12.2016.
 */
@Entity
@Table(name = "band")
public class Band {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_BAND")
    @SequenceGenerator(name = "SEQUENCE_BAND", sequenceName = "SEQUENCE_BAND", allocationSize = 1, initialValue = 1)
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "numOfMembers")
    private int numOfMembers;
    @Column(name = "style")
    private String style;

    public Band(String name, String location, int numOfMembers, String style) {

        this.name = name;
        this.location = location;
        this.numOfMembers = numOfMembers;
        this.style = style;
    }

    public Band() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }

    public void setNumOfMembers(int numOfMembers) {
        this.numOfMembers = numOfMembers;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", numOfMembers=" + numOfMembers +
                ", style='" + style + '\'' +
                '}';
    }
}
