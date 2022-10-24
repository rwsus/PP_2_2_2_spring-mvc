package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceImpl implements Service {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Audi", "black"));
        cars.add(new Car(2, "VAZ", "yellow"));
        cars.add(new Car(3, "Toyota", "red"));
        cars.add(new Car(4, "BMW", "blue"));
        cars.add(new Car(5, "Volga", "grey"));
    }

    @Override
    public List<Car> numberOfCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
