package pl.wsb.library.reader.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reader")
public class Reader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 80)
    private String fullName;

    @Column(name = "email", nullable = false, unique = true, length = 120)
    private String email;

    @Column(name = "registered_on", nullable = false)
    private LocalDate registeredOn;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Embedded
    private Address address;

    protected Reader() {
    }

    public Reader(String fullName, String email, LocalDate registeredOn,
                  Boolean active, Address address) {
        this.fullName = fullName;
        this.email = email;
        this.registeredOn = registeredOn;
        this.active = active;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getRegisteredOn() {
        return registeredOn;
    }

    public Boolean getActive() {
        return active;
    }

    public Address getAddress() {
        return address;
    }
}