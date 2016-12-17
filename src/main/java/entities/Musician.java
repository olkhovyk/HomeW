package entities;

import javax.persistence.*;

/**
 * Created by Илья on 17.12.2016.
 */
@Entity
@Table(name = "musician")
public class Musician {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_MUSICIAN")
    @SequenceGenerator(name = "SEQUENCE_MUSICIAN", sequenceName = "SEQUENCE_MUSICIAN", allocationSize = 1, initialValue = 1)
    private int id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "instrument")
    private String instrument;

    public Musician(String firstName, String lastName, int age, String instrument) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.instrument = instrument;
    }

    public Musician() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Musician{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", instrument='" + instrument + '\'' +
                '}';
    }
}
