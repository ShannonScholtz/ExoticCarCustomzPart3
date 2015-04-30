package ExoticCarCustomz.domain;

import ExoticCarCustomz.conf.factory.AudioTechnicianFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/16.
 */
public class AudioTechnicianTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateAudioTechnician() throws Exception {
        Map<String, String> values = new HashMap<String, String>();

        values.put("LastName", "Scholtz");
        values.put("FirstName", "Shannon");

        AudioTechnician technician = AudioTechnicianFactory
                .createAudioTechnician(values);

        Assert.assertEquals("Shannon", technician.getFirstName());
        Assert.assertEquals("Scholtz", technician.getLastName());
    }

    @Test
    public void testUpdateAudioTechnician() throws Exception {
        Map<String,String> values = new HashMap<String,String>();

        values.put("LastName", "Scholtz");
        values.put("FirstName", "Shannon");

        AudioTechnician technician = AudioTechnicianFactory
                .createAudioTechnician(values);

        AudioTechnician newname = new AudioTechnician
                .Builder(technician.getLastName())
                .copy(technician)
                .FirstName("Leigh")
                .build();

        Assert.assertEquals("Scholtz", newname.getLastName());
        Assert.assertEquals("Leigh", newname.getFirstName());
        Assert.assertEquals("Shannon", technician.getFirstName());


    }
}
