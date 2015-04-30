package ExoticCarCustomz.conf.factory;



import ExoticCarCustomz.domain.Car;

import java.util.Map;

/**
 * Created by student on 2015/04/23.
 */
public class CarFactory {

    public static Car createCar(Map<String,String> values) {
        Car cars = new Car
                .Builder(values.get("serialNumber"))
                .make(values.get("make"))
                .model(values.get("model"))
                .colour(values.get("colour"))
                .year(values.get("year"))
                .build();
        return cars;
    }
}
