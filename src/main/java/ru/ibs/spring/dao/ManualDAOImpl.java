package ru.ibs.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ibs.spring.entity.Manual;

import java.util.List;

@Repository
public class ManualDAOImpl implements ManualDAO{

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Manual> getAllManual() {
        Session session=sessionFactory.getCurrentSession();
        Query<Manual> query= session.createQuery("from Manual ",Manual.class);
        List<Manual> allManual = query.getResultList();

        return allManual;
    }

    @Override
    public void saveManual(Manual manual) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(manual);

    }

    @Override
    public Manual getManual(int id) {
        Session session=sessionFactory.getCurrentSession();
        Manual manual=session.get(Manual.class, id);
        return manual;
    }

    @Override
    public void deleteManual(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query <Manual> query=session.createQuery("delete from Manual where id=:manualId");
        query.setParameter("manualId", id);
        query.executeUpdate();
    }
}
