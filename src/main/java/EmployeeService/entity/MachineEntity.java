package EmployeeService.entity;

import EmployeeService.typeE.ServiceType;
import EmployeeService.typeE.WarrantyType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MachineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMachine;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private ServiceEntity service;
    private String brand;
    private String serialNumber;
    private String model;
    private String dateBuy;
    private String dateSell;
    private String princeBuy;
    private String princeSell;
    private Long totalCounter;
    private String fullName;
    private WarrantyType warranty;
    private ServiceType serviceType;

}
