package ExoticCarCustomz.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by student on 2015/04/15.
 */

@Entity
public class SprayPainter implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long painterID;
    private String LastName;
    private String FirstName;

    private SprayPainter() {
    }

    public SprayPainter(Builder builder) {
        painterID = builder.painterID;
        LastName = builder.LastName;
        FirstName = builder.FirstName;
    }

    public Long getPainterID() {
        return painterID;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public static class Builder {

        private Long painterID;
        private String LastName;
        private String FirstName;

        public Builder(String LastName) {
            this.LastName = LastName;
        }

        public Builder FirstName(String FirstName) {
            this.FirstName = FirstName;
            return this;
        }

        public Builder painterID(Long painterID) {
            this.painterID = painterID;
            return this;
        }

        public Builder copy(SprayPainter value){
            this.painterID=value.getPainterID();
            this.LastName=value.getLastName();
            this.FirstName=value.getFirstName();
            return this;
        }

        public SprayPainter build() {
            return new SprayPainter(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SprayPainter)) return false;

        SprayPainter sprayPainter = (SprayPainter) o;

        return !(painterID != null ? !painterID.equals(sprayPainter.painterID) : sprayPainter.painterID != null);

    }

    @Override
    public int hashCode() {
        return painterID != null ? painterID.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "SprayPainter{" +
                "PainterID = " + painterID +
                ", FirstName = '" + FirstName + '\'' +
                '}';
    }


}
