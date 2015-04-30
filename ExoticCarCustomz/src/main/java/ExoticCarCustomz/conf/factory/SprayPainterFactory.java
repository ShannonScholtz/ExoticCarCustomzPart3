package ExoticCarCustomz.conf.factory;

import ExoticCarCustomz.domain.SprayPainter;

import java.util.Map;

/**
 * Created by student on 2015/04/23.
 */
public class SprayPainterFactory {

    public static SprayPainter createSprayPainter(Map<String,String> values) {
        SprayPainter painter = new SprayPainter
                .Builder(values.get("LastName"))
                .FirstName(values.get("FirstName"))
                .build();
        return painter;
    }
}
