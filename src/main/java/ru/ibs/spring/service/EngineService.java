package ru.ibs.spring.service;


import ru.ibs.spring.entity.Engine;

import java.util.List;

public interface EngineService {
    public List<Engine> getAllEngine();
    public void saveEngine(Engine engine);
    public Engine getEngine(int ID);
    public void deleteEngine(int ID);
}
