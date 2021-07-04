package ru.ibs.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ibs.spring.dao.Car1DAO;
import ru.ibs.spring.dao.CarDAO;
import ru.ibs.spring.entity.Car;
import ru.ibs.spring.entity.Car1;

import java.util.List;

@Service
public class Car1Service {
    @Autowired
    private Car1DAO car1DAO;


    @Transactional
    public List<Car1> getAllCar() {
        return car1DAO.getAllCars();
    }


    @Transactional
    public void saveCar(Car1 car) {
        car1DAO.saveCar(car);
    }


    @Transactional
    public Car1 getCar(int ID) {
        return car1DAO.getCar(ID);
    }


    @Transactional
    public void deleteCar(int ID) {
        car1DAO.deleteCar(ID);
    }

}
