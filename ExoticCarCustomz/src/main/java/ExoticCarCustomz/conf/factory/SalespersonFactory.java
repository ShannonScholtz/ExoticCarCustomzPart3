package ExoticCarCustomz.conf.factory;

import ExoticCarCustomz.domain.Salesperson;

import java.util.Map;

/**
 * Created by student on 2015/04/23.
 */
public class SalespersonFactory {

    public static Salesperson createSalesperson(Map<String,String> values) {
        Salesperson sales = new Salesperson
                .Builder(values.get("LastName"))
                .FirstName(values.get("FirstName"))
                .build();
        return sales;
    }
}

