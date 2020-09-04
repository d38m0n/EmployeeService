package EmployeeService.entity;

import EmployeeService.typeEnum.WorkPosition;
import EmployeeService.typeEnum.WorkerRole;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class WorkerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idWorker;
    private String login;
    private String email;
    private String pwd;
    private String name;
    private String surname;
    private String pesel;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private AddressEntity addressEntity;
    private WorkPosition position;
    private WorkerRole role;
    private BigDecimal salary;
    private String join;
    private String codeService;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private CompanyEntity company;




}
