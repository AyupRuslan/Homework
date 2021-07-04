package ru.ibs.spring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="steeringwheel")
public class SteeringWheel {
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "steeringWheel")
    private List<Car> cars;

    public SteeringWheel() {
    }

    public SteeringWheel(String name, String remont, int price_remont) {
        this.name = name;
        this.remont = remont;
        this.price_remont = price_remont;
    }

    public void addCarsToSteering(Car car){
        if(cars==null){
            cars= new ArrayList<>();
        }
        cars.add(car);
        car.setSteeringWheel(this);
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

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remont='" + remont + '\'' +
                ", price_remont=" + price_remont +
                '}';
    }
}
