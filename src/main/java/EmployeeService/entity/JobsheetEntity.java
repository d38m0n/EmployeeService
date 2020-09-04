package EmployeeService.entity;


import EmployeeService.typeEnum.ServicePriority;
import EmployeeService.typeEnum.ServiceType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class JobsheetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_jobsheet;
    private int privName;
    private ServiceType serviceType;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private MachineEntity machineEntity;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private ClientEntity client;
    private String dateService;
    private String descriptionService;
    private String counterCurrently;
    private String place;

    private String timeStartRoad;
    private String timeStopRoad;
    private String totalTimeRoad;
    private int distanceRoad;

    private String timeStartWork;
    private String timeStopWork;
    private String totalTimeWork;

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "jobsheet_worker",
            joinColumns = {@JoinColumn(name = "jobsheet_id")},
            inverseJoinColumns = {@JoinColumn(name = "worker_id")})
    private List<WorkerEntity> workers = new ArrayList<>();

    private ServicePriority servicePriority;
    private String signature;

}