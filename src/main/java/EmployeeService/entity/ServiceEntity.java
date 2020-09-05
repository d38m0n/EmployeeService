package EmployeeService.entity;

import EmployeeService.statusE.ServicePriority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_service;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private ClientEntity clientEntity;

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "service_jobsheet",
            joinColumns = {@JoinColumn(name = "service_id")},
            inverseJoinColumns = {@JoinColumn(name = "jobsheet_id")})
    private List<JobsheetEntity> jobsheets = new ArrayList<>();

    private String codeService;
    private String dateInput;
    private String dateStartAction;
    private String dateFinisher;
    private String firstDateAction;
    private String timeStartAction;
    private String timeStopAction;

    private ServicePriority servicePriority;

}
