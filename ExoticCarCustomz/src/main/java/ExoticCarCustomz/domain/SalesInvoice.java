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
public class SalesInvoice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long invoiceID;
    private String date;
    private long CarID;
    private long customerID;
    private long salespersonID;
    private double totalPrice;

    private SalesInvoice() {
    }

    public SalesInvoice(Builder builder) {
        invoiceID = builder.invoiceID;
        date = builder.date;
        CarID = builder.CarID;
        customerID = builder.customerID;
        salespersonID = builder.salespersonID;
        totalPrice = builder.totalPrice;

    }

    public Long getInvoiceID() {
        return invoiceID;
    }

    public String getDate() {
        return date;
    }

    public long getCarID(){
        return CarID;
    }

    public long getCustomerID()
    {
        return customerID;
    }

    public long getSalespersonID() {
        return salespersonID;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public static class Builder {

        private Long invoiceID;
        private String date;
        private long CarID;
        private long customerID;
        private long salespersonID;
        private double totalPrice;

        public Builder(long salespersonID) {
            this.salespersonID = salespersonID;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder CarID(long CarID) {
            this.CarID = CarID;
            return this;
        }


        public Builder customerID(long customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder totalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }


        public Builder invoiceID(Long invoiceID) {
            this.invoiceID = invoiceID;
            return this;
        }

        public Builder copy(SalesInvoice value){
            this.invoiceID=value.getInvoiceID();
            this.date=value.getDate();
            this.CarID=value.getCarID();
            this.customerID=value.getCustomerID();
            this.salespersonID=value.getSalespersonID();
            this.totalPrice=value.getTotalPrice();
            return this;
        }

        public SalesInvoice build() {
            return new SalesInvoice(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalesInvoice)) return false;

        SalesInvoice salesInvoice = (SalesInvoice) o;

        return !(invoiceID != null ? !invoiceID.equals(salesInvoice.invoiceID) : salesInvoice.invoiceID != null);

    }

    @Override
    public int hashCode() {
        return invoiceID != null ? invoiceID.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "SalesInvoice{" +
                "InvoiceID = " + invoiceID +
                ", TotalPrice = '" + totalPrice + '\'' +
                '}';
    }

}
