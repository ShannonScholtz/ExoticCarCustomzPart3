package ExoticCarCustomz.conf.factory;

import ExoticCarCustomz.domain.Customer;

import java.util.Map;

/**
 * Created by student on 2015/04/23.
 */
public class CustomerFactory {

    public static Customer createCustomer(Map<String,String> values) {
        Customer customer = new Customer
                .Builder(values.get("phoneNumber"))
                .LastName(values.get("LastName"))
                .FirstName(values.get("FirstName"))
                .Address(values.get("Address"))
                .build();
        return customer;
    }
}
