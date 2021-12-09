import org.junit.Assert;
import org.junit.Test;
import ru.den.DAO.CarDAO;
import ru.den.model.Car;
import ru.den.model.Color;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HibernateManyToManyTest {
    CarDAO carDAO = new CarDAO();


    Car car1;
    int carId;
    Car car2;
    @Test
    public void saveCarDAOTest(){
        Color color1 = new Color("Gold");
        Color color2 = new Color("Silver");
        Color color3 = new Color("Black");
        List<Color> colorList = new ArrayList<>();
        colorList.add(color1);
        colorList.add(color2);
        colorList.add(color3);

        car1 = new Car("Mercedes","Sport", colorList);
        carDAO.saveCar(car1);
        carId = car1.getIdCar();
        car2 = carDAO.getCar(carId);

        Assert.assertEquals(car1, car2);
    }

    @Test(expected = Exception.class)
    public void deleteCarDAOTest(){
        carDAO.deleteCar(car2);
        carDAO.getCar(carId);

    }
}
