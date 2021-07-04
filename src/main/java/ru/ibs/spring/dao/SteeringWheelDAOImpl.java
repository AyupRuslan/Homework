package ru.ibs.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ibs.spring.entity.Gear;
import ru.ibs.spring.entity.SteeringWheel;

import java.util.List;

@Repository
public class SteeringWheelDAOImpl implements  SteeringWheelDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<SteeringWheel> getAllSWheel() {
        Session session=sessionFactory.getCurrentSession();
        Query<SteeringWheel> query= session.createQuery("from SteeringWheel ",SteeringWheel.class);
        List<SteeringWheel> allSteeringWheel = query.getResultList();

        return allSteeringWheel;
    }

    @Override
    public void saveSteeringWheel(SteeringWheel steeringWheel) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(steeringWheel);
    }

    @Override
    public SteeringWheel getSteeringWheel(int id) {
        Session session=sessionFactory.getCurrentSession();
        SteeringWheel steeringWheel=session.get(SteeringWheel.class, id);
        return steeringWheel;
    }

    @Override
    public void deleteSteeringWheel(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query <SteeringWheel> query=session.createQuery("delete from SteeringWheel where id=:steeringwheelId");
        query.setParameter("steeringwheelId", id);
        query.executeUpdate();
    }
}
