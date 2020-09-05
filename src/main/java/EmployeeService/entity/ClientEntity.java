package EmployeeService.entity;

import EmployeeService.statusE.ClientStatus;

import javax.persistence.*;


@Entity
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client;
    private String fullName;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private AddressEntity address;
    private int nip;
    private int phoneNumber;
    private String dateJoin;
    private ClientStatus clientStatus;

}
