package ru.den.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.den.model.Car;
import ru.den.model.Color;
import ru.den.util.HibernateUtil;

import java.util.List;
import java.util.Set;

public class CarDAO {
    private static Session session = HibernateUtil.getSessionFactory().openSession();

    public void saveCar(Car car){
        session.beginTransaction();
        session.save(car);
        session.getTransaction().commit();
    }
    public void saveColor(Color color){
        session.beginTransaction();
        session.save(color);
        session.getTransaction().commit();
    }
    public Car getCar(int idCar){
        return session.get(Car.class, idCar);
    }
    public Color getColor(int idColor){
        return session.get(Color.class, idColor);
    }
    public void editCar(Car car){
        session.beginTransaction();
        session.saveOrUpdate(car);
        session.getTransaction().commit();
    }
    public void editColor(Color color){
        session.beginTransaction();
        session.saveOrUpdate(color);
        session.getTransaction().commit();
    }
    public void deleteCar(Car car){
        session.beginTransaction();
        session.delete(car);
        session.getTransaction().commit();
    }
    public void deleteColor(Color color){
        session.beginTransaction();
        session.delete(color);
        session.getTransaction().commit();
    }
    public List<Color> getAllColor(){
        List<Color> colors = session.createQuery("from color").list();
        return colors;
    }
}
