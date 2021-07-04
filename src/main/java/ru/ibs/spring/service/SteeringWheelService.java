package ru.ibs.spring.service;

import ru.ibs.spring.entity.Car;
import ru.ibs.spring.entity.SteeringWheel;

import java.util.List;

public interface SteeringWheelService {
    public List<SteeringWheel> getAllSteeringWheel();
    public void saveSteeringWheel(SteeringWheel sw);
    public SteeringWheel getSteeringWheel(int ID);
    public void deleteSteeringWheel(int ID);
}
