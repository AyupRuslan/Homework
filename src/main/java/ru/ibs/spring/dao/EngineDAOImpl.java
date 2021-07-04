package ru.ibs.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ibs.spring.entity.Engine;

import java.util.List;

@Repository
public class EngineDAOImpl implements EngineDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Engine> getAllEngine() {
        Session session=sessionFactory.getCurrentSession();
        Query<Engine> query= session.createQuery("from Engine ",Engine.class);
        List<Engine> allEngine = query.getResultList();

        return allEngine;
    }

    @Override
    public void saveEngine(Engine engine) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(engine);

    }

    @Override
    public Engine getEngine(int id) {
        Session session=sessionFactory.getCurrentSession();
        Engine engine=session.get(Engine.class, id);
        return engine;
    }

    @Override
    public void deleteEngine(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query <Engine> query=session.createQuery("delete from Engine where id=:engineId");
        query.setParameter("engineId", id);
        query.executeUpdate();
    }
}
