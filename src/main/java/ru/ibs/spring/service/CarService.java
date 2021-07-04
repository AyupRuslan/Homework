package ru.ibs.spring.service;

import ru.ibs.spring.entity.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllCar();
    public void saveCar(Car car);
    public Car getCar(int ID);
    public void deleteCar(int ID);
}
