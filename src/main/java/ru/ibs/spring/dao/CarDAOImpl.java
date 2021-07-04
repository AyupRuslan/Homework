package ru.ibs.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ibs.spring.entity.Car;

import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Car> getAllCars() {
        Session session=sessionFactory.getCurrentSession();
        Query<Car> query= session.createQuery("from Car ",Car.class);
        List<Car> allCar = query.getResultList();

        return allCar;
    }
    @Override
    public void saveCar(Car car) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(car);
    }
    @Override
    public Car getCar(int id) {
        Session session=sessionFactory.getCurrentSession();
        Car car=session.get(Car.class, id);
        return car;
    }
    @Override
    public void deleteCar(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query <Car> query=session.createQuery("delete from Car where id=:carId");
        query.setParameter("carId", id);
        query.executeUpdate();
    }
}
