package ExoticCarCustomz.domain;

import ExoticCarCustomz.conf.factory.SprayPainterFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/16.
 */
public class SprayPainterTest {

    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void testCreateSprayPainter() throws Exception {
        Map<String, String> values = new HashMap<String, String>();

        values.put("LastName", "Tseleng");
        values.put("FirstName", "Rudy");

        SprayPainter painter = SprayPainterFactory
                .createSprayPainter(values);

        Assert.assertEquals("Rudy", painter.getFirstName());
        Assert.assertEquals("Tseleng", painter.getLastName());
    }

    @Test
    public void testUpdateSprayPainter() throws Exception {
        Map<String,String> values = new HashMap<String,String>();

        values.put("LastName", "Tseleng");
        values.put("FirstName", "Rudy");

        SprayPainter painter = SprayPainterFactory
                .createSprayPainter(values);


        SprayPainter newname = new SprayPainter
                .Builder(painter.getLastName())
                .copy(painter)
                .FirstName("Molemo")
                .build();

        Assert.assertEquals("Tseleng", newname.getLastName());
        Assert.assertEquals("Molemo", newname.getFirstName());
        Assert.assertEquals("Rudy", painter.getFirstName());


    }
}
