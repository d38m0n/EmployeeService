package EmployeeService.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompany;
    private String fullName;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private AddressEntity addressEntity;

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_worker",
            joinColumns = {@JoinColumn(name = "company_id")},
            inverseJoinColumns = {@JoinColumn(name = "worker_id")})
    private List<WorkerEntity> workers = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_machine",
            joinColumns = {@JoinColumn(name = "company_id")},
            inverseJoinColumns = {@JoinColumn(name = "machine_id")})
    private List<MachineEntity> machines = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_client",
            joinColumns = {@JoinColumn(name = "company_id")},
            inverseJoinColumns = {@JoinColumn(name = "client_id")})
    private List<ClientEntity> clients = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_component",
            joinColumns = {@JoinColumn(name = "company_id")},
            inverseJoinColumns = {@JoinColumn(name = "component_id")})
    private List<ComponentEntity> components = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_car",
            joinColumns = {@JoinColumn(name = "company_id")},
            inverseJoinColumns = {@JoinColumn(name = "car_id")})
    private List<CarEntity> cars = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_jobsheet",
            joinColumns = {@JoinColumn(name = "company_id")},
            inverseJoinColumns = {@JoinColumn(name = "jobsheet_id")})
    private List<JobsheetEntity> jobsheets = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_service",
            joinColumns = {@JoinColumn(name = "company_id")},
            inverseJoinColumns = {@JoinColumn(name = "service_id")})
    private List<ServiceEntity> services = new ArrayList<>();
}
