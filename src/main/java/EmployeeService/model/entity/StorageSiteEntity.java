package EmployeeService.model.entity;

import javax.persistence.*;

@Entity
public class StorageSiteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private AddressEntity address;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private ClientEntity client;

    public Long getId() {
        return id;
    }

    public void setId(Long idStorageSite) {
        this.id = idStorageSite;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }
}
