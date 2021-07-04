package ru.ibs.spring.entity;

import javax.persistence.*;

@Entity
@Table(name="car1")
public class Car1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="remont")
    private String remont;

    public Car1() {
    }

    public Car1(String name, String remont) {
        this.name = name;
        this.remont = remont;
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

    public String getRemont() {
        return remont;
    }

    public void setRemont(String remont) {
        this.remont = remont;
    }
}
