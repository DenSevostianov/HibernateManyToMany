package ru.den;

import org.hibernate.Session;
import ru.den.DAO.CarDAO;
import ru.den.model.Car;
import ru.den.model.Color;
import ru.den.util.HibernateUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CarDAO carDAO = new CarDAO();

        //Color color1 = new Color("Red");
        //Color color2 = new Color("Silver");
        //Color color3 = new Color("White");
        //carDAO.saveColor(color1);
        //carDAO.saveColor(color2);
        //carDAO.saveColor(color3);

        //Set<Color> colorList = new HashSet<>();

        /*List<Color> colorList = carDAO.getAllColor();
        Set<Color> colorSet = new HashSet();
        for (Color color:colorList) {
            colorSet.add(color);
            System.out.println(color.toString());
        }*/
        //colorList.add(color1);
        //colorList.add(color2);
        //colorList.add(color3);

        //Car car1 = new Car("Mercedes","CrossOver", colorSet);
        //carDAO.saveCar(car1);
        //int[] idCars ={26};
        //int[] colors = {1, 5, 6, 7};

        Car car = carDAO.getCar(58);

            ArrayList<Color> colors = (ArrayList<Color>) car.getColorList();
            colors.forEach(x -> System.out.println(x.toString()));


        /*for(int id:colors){
            Color color = carDAO.getColor(id);
            carDAO.deleteColor(color);
        }*/
        /*for(int id:idCars){
            Car car2 = carDAO.getCar(id);
            carDAO.deleteCar(car2);}*/
    }
}
