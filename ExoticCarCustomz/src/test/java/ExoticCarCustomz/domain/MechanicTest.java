package ExoticCarCustomz.domain;

import ExoticCarCustomz.conf.factory.MechanicFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/16.
 */
public class MechanicTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCreateMechanic() throws Exception {
        Map<String, String> values = new HashMap<String, String>();

        values.put("LastName", "Simons");
        values.put("FirstName", "Patrick");

        Mechanic technician = MechanicFactory
                .createMechanic(values);

        Assert.assertEquals("Patrick", technician.getFirstName());
        Assert.assertEquals("Simons", technician.getLastName());
    }

    @Test
    public void testUpdateMechanic() throws Exception {
        Map<String,String> values = new HashMap<String,String>();

        values.put("LastName", "Simons");
        values.put("FirstName", "Patrick");

        Mechanic mechanic = MechanicFactory
                .createMechanic(values);

        Mechanic newname = new Mechanic
                .Builder(mechanic.getLastName())
                .copy(mechanic)
                .FirstName("Edmund")
                .build();

        Assert.assertEquals("Simons", newname.getLastName());
        Assert.assertEquals("Edmund", newname.getFirstName());
        Assert.assertEquals("Patrick", mechanic.getFirstName());


    }
}
