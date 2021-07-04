package ru.ibs.spring.dao;

import ru.ibs.spring.entity.Engine;


import java.util.List;

public interface EngineDAO {
    public List<Engine> getAllEngine();

    public void saveEngine(Engine engine);

    public Engine getEngine(int id);

    public void deleteEngine(int id);
}
