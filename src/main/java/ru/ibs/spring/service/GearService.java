package ru.ibs.spring.service;


import ru.ibs.spring.entity.Gear;

import java.util.List;

public interface GearService {
    public List<Gear> getAllGear();
    public void saveGear(Gear gear);
    public Gear getGear(int ID);
    public void deleteGear(int ID);
}
