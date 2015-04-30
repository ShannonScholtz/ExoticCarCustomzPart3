package ExoticCarCustomz.conf.factory;

import ExoticCarCustomz.domain.MechanicalParts;

import java.util.Map;

/**
 * Created by student on 2015/04/23.
 */
public class MechanicalPartsFactory {

    public static MechanicalParts createMechanicalParts(double Price,
                                                        Map<String,String> values) {
        MechanicalParts parts = new MechanicalParts
                .Builder(values.get("description"))
                .Price(Price)
                .build();
        return parts;
    }
}
