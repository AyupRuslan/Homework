package ru.ibs.spring.entity;

import javax.persistence.*;

@Entity
@Table(name="car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="manufactureName")
    private String manufactureName;
    @Column(name="modelName")
    private String modelName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="steeringwheel_id")
    private SteeringWheel steeringWheel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="engine_id")
    private Engine engine;

    public Car() {
    }

    public Car(String manufactureName, String modelName) {
        this.manufactureName = manufactureName;
        this.modelName = modelName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }



    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", manufactureName='" + manufactureName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", steeringWheel=" + steeringWheel +
                ", engine=" + engine +
                '}';
    }
}
