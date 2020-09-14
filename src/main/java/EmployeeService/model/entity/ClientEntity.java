package EmployeeService.model.entity;

import EmployeeService.model.permanent.statusE.ClientStatus;

import javax.persistence.*;


@Entity
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private AddressEntity address;
    private int nip;
    private int phoneNumber;
    private String dateJoin;
    private String clientStatus;

    public ClientEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id_client) {
        this.id = id_client;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(String dateJoin) {
        this.dateJoin = dateJoin;
    }

    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }
}
