package ru.ibs.spring.service;


import ru.ibs.spring.entity.Manual;

import java.util.List;

public interface ManualService {
    public List<Manual> getAllManual();
    public void saveManual(Manual manual);
    public Manual getManual(int ID);
    public void deleteManual(int ID);
}
