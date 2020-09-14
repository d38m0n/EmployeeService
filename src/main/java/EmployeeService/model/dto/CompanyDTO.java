package EmployeeService.model.dto;

import java.util.ArrayList;
import java.util.List;

public class CompanyDTO {
    private Long idCompany;
    private String fullName;
    private AddressDTO addressEntity;
    private List<WorkerDTO> workers = new ArrayList<>();
    private List<MachineDTO> machines = new ArrayList<>();
    private List<ClientDTO> clients = new ArrayList<>();
    private List<ComponentDTO> components = new ArrayList<>();
    private List<CarDTO> cars = new ArrayList<>();
    private List<JobsheetDTO> jobsheets = new ArrayList<>();
    private List<ServiceDTO> services = new ArrayList<>();
    private List<StorageSiteDTO> storageSites = new ArrayList<>();

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public AddressDTO getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressDTO addressEntity) {
        this.addressEntity = addressEntity;
    }

    public List<WorkerDTO> getWorkers() {
        return workers;
    }

    public void setWorkers(List<WorkerDTO> workers) {
        this.workers = workers;
    }

    public List<MachineDTO> getMachines() {
        return machines;
    }

    public void setMachines(List<MachineDTO> machines) {
        this.machines = machines;
    }

    public List<ClientDTO> getClients() {
        return clients;
    }

    public void setClients(List<ClientDTO> clients) {
        this.clients = clients;
    }

    public List<ComponentDTO> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentDTO> components) {
        this.components = components;
    }

    public List<CarDTO> getCars() {
        return cars;
    }

    public void setCars(List<CarDTO> cars) {
        this.cars = cars;
    }

    public List<JobsheetDTO> getJobsheets() {
        return jobsheets;
    }

    public void setJobsheets(List<JobsheetDTO> jobsheets) {
        this.jobsheets = jobsheets;
    }

    public List<ServiceDTO> getServices() {
        return services;
    }

    public void setServices(List<ServiceDTO> services) {
        this.services = services;
    }

    public List<StorageSiteDTO> getStorageSites() {
        return storageSites;
    }

    public void setStorageSites(List<StorageSiteDTO> storageSites) {
        this.storageSites = storageSites;
    }
}
