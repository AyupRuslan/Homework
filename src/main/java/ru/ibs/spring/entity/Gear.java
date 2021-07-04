package ru.ibs.spring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="gear")
public class Gear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="remont")
    private String remont;

    @Column(name="price_remont")
    private int price_remont;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="engine_id")
    private Engine engine;

    public Gear() {
    }

    public Gear(String name, String remont, int price_remont) {
        this.name = name;
        this.remont = remont;
        this.price_remont = price_remont;
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

    public int getPrice_remont() {
        return price_remont;
    }

    public void setPrice_remont(int price_remont) {
        this.price_remont = price_remont;
    }

    public Engine getEngine() {
        return engine;
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Gear{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remont='" + remont + '\'' +
                ", price_remont=" + price_remont +
                '}';
    }
}
