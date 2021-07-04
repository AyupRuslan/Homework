package ru.ibs.spring.dao;

import ru.ibs.spring.entity.Gear;


import java.util.List;

public interface GearDAO {
    public List<Gear> getAllGear();

    public void saveGear(Gear gear);

    public Gear getGear(int id);

    public void deleteGear(int id);
}
