package ru.ibs.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ibs.spring.entity.Car1;

import java.util.List;


@Repository
public class Car1DAO {
    @Autowired
    private SessionFactory sessionFactory;

    public List<Car1> getAllCars() {
        Session session=sessionFactory.getCurrentSession();
        Query<Car1> query= session.createQuery("from Car1 ",Car1.class);
        List<Car1> allCar1 = query.getResultList();

        return allCar1;
    }

    public void saveCar(Car1 car) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(car);
    }

    public Car1 getCar(int id) {
        Session session=sessionFactory.getCurrentSession();
        Car1 car=session.get(Car1.class, id);
        return car;
    }

    public void deleteCar(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query <Car1> query=session.createQuery("delete from Car1 where id=:carId");
        query.setParameter("carId", id);
        query.executeUpdate();
    }
}
