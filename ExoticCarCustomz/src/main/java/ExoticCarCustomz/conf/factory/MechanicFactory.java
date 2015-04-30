package ExoticCarCustomz.conf.factory;

import ExoticCarCustomz.domain.Mechanic;

import java.util.Map;

/**
 * Created by student on 2015/04/23.
 */
public class MechanicFactory {

    public static Mechanic createMechanic(Map<String,String> values) {
        Mechanic mechanic = new Mechanic
                .Builder(values.get("LastName"))
                .FirstName(values.get("FirstName"))
                .build();
        return mechanic;
    }
}
