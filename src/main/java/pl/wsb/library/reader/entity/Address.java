package pl.wsb.library.reader.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "street", length = 80)
    private String street;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "postal_code", length = 10)
    private String postalCode;

    protected Address() {
    }

    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }
}