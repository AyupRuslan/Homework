package ru.ibs.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ibs.spring.dao.CarDAO;
import ru.ibs.spring.entity.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDAO carDAO;

    @Override
    @Transactional
    public List<Car> getAllCar() {
        return carDAO.getAllCars();
    }

    @Override
    @Transactional
    public void saveCar(Car car) {
        carDAO.saveCar(car);
    }

    @Override
    @Transactional
    public Car getCar(int ID) {
        return carDAO.getCar(ID);
    }

    @Override
    @Transactional
    public void deleteCar(int ID) {
        carDAO.deleteCar(ID);
    }
}
