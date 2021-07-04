package ru.ibs.spring.dao;


import ru.ibs.spring.entity.SteeringWheel;

import java.util.List;

public interface SteeringWheelDAO {

    public List<SteeringWheel> getAllSWheel();

    public void saveSteeringWheel(SteeringWheel steeringWheel);

    public SteeringWheel getSteeringWheel(int id);

    public void deleteSteeringWheel(int id);
}
