package EmployeeService.entity;

import javax.persistence.*;

@Entity
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCar;
    private String street;
    private String country;
    private String city;
    private String number;
    private String phone;
    private String nip;
    private String postCode;
    private String post;
}
