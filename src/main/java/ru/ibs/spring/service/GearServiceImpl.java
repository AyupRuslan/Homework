package ru.ibs.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ibs.spring.dao.GearDAO;
import ru.ibs.spring.entity.Gear;

import java.util.List;

@Service
public class GearServiceImpl implements GearService{

    @Autowired
    private GearDAO gearDAO;

    @Override
    @Transactional
    public List<Gear> getAllGear() {
        return gearDAO.getAllGear();
    }

    @Override
    @Transactional
    public void saveGear(Gear gear) {
        gearDAO.saveGear(gear);
    }

    @Override
    @Transactional
    public Gear getGear(int ID) {
        return gearDAO.getGear(ID);
    }

    @Override
    @Transactional
    public void deleteGear(int ID) {
        gearDAO.deleteGear(ID);
    }
}
