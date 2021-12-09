package ru.den.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCar;
    private String model;
    private String carClass;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "car_color",
        joinColumns = @JoinColumn(name = "id_car"),
        inverseJoinColumns = @JoinColumn(name = "id_color"))
    private List<Color> colorList = new ArrayList<>();
    //-------------------------------------------------------

    public Car() {
    }

    public Car(String model, String carClass, List<Color> colorList) {
        this.model = model;
        this.carClass = carClass;
        this.colorList = colorList;
    }
    @Override
    public String toString(){
        return "Car {Id Car = " + idCar +
                "Model = " + model +
                "Class = " + carClass + "}";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public List<Color> getColorList() {
        return colorList;
    }

    public void setColorList(List<Color> colorList) {
        this.colorList = colorList;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }
}

