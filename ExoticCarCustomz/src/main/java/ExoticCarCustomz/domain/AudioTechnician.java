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
public class AudioTechnician implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long technicianID;
    private String LastName;
    private String FirstName;

    private AudioTechnician() {
    }

    public AudioTechnician(Builder builder) {
        technicianID = builder.technicianID;
        LastName = builder.LastName;
        FirstName = builder.FirstName;
    }

    public Long getTechnicianID() {
        return technicianID;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public static class Builder {

        private Long technicianID;
        private String LastName;
        private String FirstName;

        public Builder(String LastName) {
            this.LastName = LastName;
        }

        public Builder FirstName(String FirstName) {
            this.FirstName = FirstName;
            return this;
        }

        public Builder technicianID(Long technicianID) {
            this.technicianID = technicianID;
            return this;
        }

        public Builder copy(AudioTechnician value){
            this.technicianID=value.getTechnicianID();
            this.LastName=value.getLastName();
            this.FirstName=value.getFirstName();
            return this;
        }


        public AudioTechnician build() {
            return new AudioTechnician(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Salesperson)) return false;

        AudioTechnician audioTechnician = (AudioTechnician) o;

        return !(technicianID != null ? !technicianID.equals(audioTechnician.technicianID) : audioTechnician.technicianID != null);

    }

    @Override
    public int hashCode() {
        return technicianID != null ? technicianID.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "AudioTechnician{" +
                "TechnicianID = " + technicianID +
                ", FirstName = '" + FirstName + '\'' +
                '}';
    }
}
