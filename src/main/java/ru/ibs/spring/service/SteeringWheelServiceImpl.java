package ru.ibs.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ibs.spring.dao.EngineDAO;
import ru.ibs.spring.dao.SteeringWheelDAO;
import ru.ibs.spring.entity.SteeringWheel;

import java.util.List;

@Service
public class SteeringWheelServiceImpl implements SteeringWheelService{
    @Autowired
    private SteeringWheelDAO steeringWheelDAO;

    @Override
    @Transactional
    public List<SteeringWheel> getAllSteeringWheel() {
        return steeringWheelDAO.getAllSWheel();
    }

    @Override
    @Transactional
    public void saveSteeringWheel(SteeringWheel sw) {
        steeringWheelDAO.saveSteeringWheel(sw);
    }

    @Override
    @Transactional
    public SteeringWheel getSteeringWheel(int ID) {
        return steeringWheelDAO.getSteeringWheel(ID);
    }

    @Override
    @Transactional
    public void deleteSteeringWheel(int ID) {
        steeringWheelDAO.deleteSteeringWheel(ID);
    }
}
