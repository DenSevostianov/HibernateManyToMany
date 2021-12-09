package ru.den.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "color")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "colorcar", unique = true)
    private String colorCar;

    @ManyToMany(mappedBy = "colorList")
    private List<Car> cars = new ArrayList<>();
    //-------------------------------------------------

    public Color() {
    }

    public Color(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    @Override
    public String toString() {
        return "Color{" +
                "id=" + id +
                ", colorCar='" + colorCar + '\'' +
                '}';
    }
}
