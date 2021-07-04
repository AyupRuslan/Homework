package ru.ibs.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ibs.spring.dao.CarDAO;
import ru.ibs.spring.dao.EngineDAO;
import ru.ibs.spring.entity.Engine;

import java.util.List;

@Service
public class EngineServiceImpl implements EngineService{
    @Autowired
    private EngineDAO engineDAO;

    @Override
    @Transactional
    public List<Engine> getAllEngine() {
        return engineDAO.getAllEngine();
    }

    @Override
    @Transactional
    public void saveEngine(Engine engine) {
        engineDAO.saveEngine(engine);
    }

    @Override
    @Transactional
    public Engine getEngine(int ID) {
        return engineDAO.getEngine(ID);
    }

    @Override
    @Transactional
    public void deleteEngine(int ID) {
        engineDAO.deleteEngine(ID);
    }
}
