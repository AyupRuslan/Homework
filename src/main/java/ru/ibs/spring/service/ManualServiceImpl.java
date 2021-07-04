package ru.ibs.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ibs.spring.dao.ManualDAO;
import ru.ibs.spring.entity.Manual;


import java.util.List;

@Service
public class ManualServiceImpl implements ManualService{
    @Autowired
    private ManualDAO manualDAO;

    @Override
    @Transactional
    public List<Manual> getAllManual() {
        return manualDAO.getAllManual();
    }

    @Override
    @Transactional
    public void saveManual(Manual manual) {
        manualDAO.saveManual(manual);
    }

    @Override
    @Transactional
    public Manual getManual(int ID) {
        return manualDAO.getManual(ID);
    }

    @Override
    @Transactional
    public void deleteManual(int ID) {
        manualDAO.deleteManual(ID);
    }
}
