package ru.ibs.spring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="enginee")
public class Engine {
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "engine")
    private List<Car> cars;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "engine")
    private List<Gear> gears;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="manual_id")
    private  Manual manual;


    public Engine() {
    }

    public Engine(String name, String remont, int price_remont) {
        this.name = name;
        this.remont = remont;
        this.price_remont = price_remont;
    }
    public void addCarsToEngine(Car car){
        if(cars==null){
            cars= new ArrayList<>();
        }
        cars.add(car);
        car.setEngine(this);
    }
    public void addGearsToEngine(Gear gear){
        if(gears==null){
            gears= new ArrayList<>();
        }
        gears.add(gear);
        gear.setEngine(this);
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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Gear> getGears() {
        return gears;
    }

    public void setGears(List<Gear> gears) {
        this.gears = gears;
    }

    public Manual getManual() {
        return manual;
    }

    public void setManual(Manual manual) {
        this.manual = manual;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remont='" + remont + '\'' +
                ", price_remont=" + price_remont +
                '}';
    }
}
