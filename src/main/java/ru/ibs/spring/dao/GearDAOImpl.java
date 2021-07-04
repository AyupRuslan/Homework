package ru.ibs.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ibs.spring.entity.Engine;
import ru.ibs.spring.entity.Gear;

import java.util.List;

@Repository
public class GearDAOImpl implements GearDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Gear> getAllGear() {
        Session session=sessionFactory.getCurrentSession();
        Query<Gear> query= session.createQuery("from Gear ",Gear.class);
        List<Gear> allGear = query.getResultList();

        return allGear;
    }

    @Override
    public void saveGear(Gear gear) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(gear);
    }

    @Override
    public Gear getGear(int id) {
        Session session=sessionFactory.getCurrentSession();
        Gear gear=session.get(Gear.class, id);
        return gear;
    }

    @Override
    public void deleteGear(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query <Gear> query=session.createQuery("delete from Gear where id=:gearId");
        query.setParameter("gearId", id);
        query.executeUpdate();    }
}
