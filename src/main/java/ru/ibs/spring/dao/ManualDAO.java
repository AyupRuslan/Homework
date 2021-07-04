package ru.ibs.spring.dao;

import ru.ibs.spring.entity.Manual;

import java.util.List;

public interface ManualDAO {
    public List<Manual> getAllManual();

    public void saveManual(Manual manual);

    public Manual getManual(int id);

    public void deleteManual(int id);
}
