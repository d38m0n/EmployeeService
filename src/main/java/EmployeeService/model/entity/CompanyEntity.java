package EmployeeService.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private AddressEntity addressEntity;

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_worker",
            joinColumns = {@JoinColumn(name = "id_company")},
            inverseJoinColumns = {@JoinColumn(name = "id_worker")})
    private List<WorkerEntity> workers = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_machine",
            joinColumns = {@JoinColumn(name = "id_company")},
            inverseJoinColumns = {@JoinColumn(name = "machine_id")})
    private List<MachineEntity> machines = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_client",
            joinColumns = {@JoinColumn(name = "id_company")},
            inverseJoinColumns = {@JoinColumn(name = "client_id")})
    private List<ClientEntity> clients = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_component",
            joinColumns = {@JoinColumn(name = "id_company")},
            inverseJoinColumns = {@JoinColumn(name = "component_id")})
    private List<ComponentEntity> components = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_car",
            joinColumns = {@JoinColumn(name = "id_company")},
            inverseJoinColumns = {@JoinColumn(name = "car_id")})
    private List<CarEntity> cars = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_jobsheet",
            joinColumns = {@JoinColumn(name = "id_company")},
            inverseJoinColumns = {@JoinColumn(name = "jobsheet_id")})
    private List<JobsheetEntity> jobsheets = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_service",
            joinColumns = {@JoinColumn(name = "id_company")},
            inverseJoinColumns = {@JoinColumn(name = "service_id")})
    private List<ServiceEntity> services = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "company_storagesite",
            joinColumns = {@JoinColumn(name = "id_company")},
            inverseJoinColumns = {@JoinColumn(name = "storage_site_id")})
    private List<StorageSiteEntity> storageSites = new ArrayList<>();

    public CompanyEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idCompany) {
        this.id = idCompany;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    public List<WorkerEntity> getWorkers() {
        return workers;
    }

    public void setWorkers(List<WorkerEntity> workers) {
        this.workers = workers;
    }

    public List<MachineEntity> getMachines() {
        return machines;
    }

    public void setMachines(List<MachineEntity> machines) {
        this.machines = machines;
    }

    public List<ClientEntity> getClients() {
        return clients;
    }

    public void setClients(List<ClientEntity> clients) {
        this.clients = clients;
    }

    public List<ComponentEntity> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentEntity> components) {
        this.components = components;
    }

    public List<CarEntity> getCars() {
        return cars;
    }

    public void setCars(List<CarEntity> cars) {
        this.cars = cars;
    }

    public List<JobsheetEntity> getJobsheets() {
        return jobsheets;
    }

    public void setJobsheets(List<JobsheetEntity> jobsheets) {
        this.jobsheets = jobsheets;
    }

    public List<ServiceEntity> getServices() {
        return services;
    }

    public void setServices(List<ServiceEntity> services) {
        this.services = services;
    }

    public List<StorageSiteEntity> getStorageSites() {
        return storageSites;
    }

    public void setStorageSites(List<StorageSiteEntity> storageSites) {
        this.storageSites = storageSites;
    }
}
