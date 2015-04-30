package ExoticCarCustomz.repository;


import ExoticCarCustomz.App;
import ExoticCarCustomz.domain.AudioEquipment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/04/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class CrudAudioEquipmentTest {


    private Long id;

    @Autowired
    AudioEquipmentRepository repository;
    @Test
    public void testCreate() throws Exception {
        List<AudioEquipment> equip = new ArrayList<AudioEquipment>();
        AudioEquipment audioEquip = new AudioEquipment.Builder("Amplifier").Price(2599.99).build();
        repository.save(audioEquip);
        id = audioEquip.getAudioEquipmentID();
        Assert.assertNotNull(audioEquip.getAudioEquipmentID());
    }

    @Test
    public void testRead() throws Exception {
        AudioEquipment  audioEquip = repository.findOne(id);
        Assert.assertEquals("Amplifier", audioEquip.getDescription());
    }

    @Test
    public void testUpdate() throws Exception {

        AudioEquipment audio = repository.findOne(id);
        AudioEquipment equip = new AudioEquipment.Builder("12\" Subwoofer")
                .AudioEquipmentID(audio.getAudioEquipmentID()).Price(1500.00).build();
        repository.save(equip);
        Assert.assertEquals("12\" Subwoofer", audio.getDescription());
        Assert.assertEquals(1500.00, audio.getPrice(), 1500.00);

    }

    @Test
    public void testDelete() throws Exception {
        AudioEquipment audioEquipment = repository.findOne(id);
        repository.delete(audioEquipment);
        AudioEquipment audioE = repository.findOne(id);
        Assert.assertNull(audioE);


    }
}
