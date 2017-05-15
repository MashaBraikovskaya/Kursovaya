package hello.model;
import javax.persistence.*;

/**
 * Created by 1 on 13.05.2017.
 */
@Entity
@Table(name="man")
public class Man {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="n_man")
    private int n_man;
    private String name;
    private String surname;
    private String patronymic;
    private String city;
    private String year_of_birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getN_man() {
        return n_man;
    }

    public void setN_man(int n_man) {
        this.n_man = n_man;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(String year_of_birth) {
        this.year_of_birth = year_of_birth;
    }
 }


