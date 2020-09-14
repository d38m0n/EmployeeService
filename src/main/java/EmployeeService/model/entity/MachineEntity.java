package EmployeeService.model.entity;

import javax.persistence.*;

@Entity
public class MachineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private ServiceEntity service;
    private String brand;
    private String serialNumber;
    private String model;
    private String dateBuy;
    private String dateSell;
    private String princeBuy;
    private String princeSell;
    private String totalCounter;
    private String fullName;
    private String warranty;
    private String serviceType;

    public MachineEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idMachine) {
        this.id = idMachine;
    }

    public ServiceEntity getService() {
        return service;
    }

    public void setService(ServiceEntity service) {
        this.service = service;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(String dateBuy) {
        this.dateBuy = dateBuy;
    }

    public String getDateSell() {
        return dateSell;
    }

    public void setDateSell(String dateSell) {
        this.dateSell = dateSell;
    }

    public String getPrinceBuy() {
        return princeBuy;
    }

    public void setPrinceBuy(String princeBuy) {
        this.princeBuy = princeBuy;
    }

    public String getPrinceSell() {
        return princeSell;
    }

    public void setPrinceSell(String princeSell) {
        this.princeSell = princeSell;
    }

    public String getTotalCounter() {
        return totalCounter;
    }

    public void setTotalCounter(String totalCounter) {
        this.totalCounter = totalCounter;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
