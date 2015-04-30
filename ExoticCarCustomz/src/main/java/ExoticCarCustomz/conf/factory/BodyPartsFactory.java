package ExoticCarCustomz.conf.factory;

import ExoticCarCustomz.domain.BodyParts;

import java.util.Map;

/**
 * Created by student on 2015/04/23.
 */
public class BodyPartsFactory {

   public static BodyParts createBodyParts(double Price, Map<String,String> values) {
        BodyParts parts = new BodyParts
                .Builder(values.get("BodyStylingModifications"))
                .Colour(values.get("Colour"))
                .Price(Price)
                .build();
        return parts;
    }
}
