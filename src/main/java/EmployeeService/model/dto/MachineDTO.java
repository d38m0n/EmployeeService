package EmployeeService.model.dto;

import EmployeeService.model.permanent.typeE.ServiceType;
import EmployeeService.model.permanent.typeE.WarrantyType;

public class MachineDTO {

    private ServiceDTO service;
    private String brand;
    private String serialNumber;
    private String model;
    private String dateBuy;
    private String dateSell;
    private String princeBuy;
    private String princeSell;
    private Long totalCounter;
    private String fullName;
    private EmployeeService.model.permanent.typeE.WarrantyType warranty;
    private EmployeeService.model.permanent.typeE.ServiceType serviceType;

    public ServiceDTO getService() {
        return service;
    }

    public void setService(ServiceDTO service) {
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

    public Long getTotalCounter() {
        return totalCounter;
    }

    public void setTotalCounter(Long totalCounter) {
        this.totalCounter = totalCounter;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public WarrantyType getWarranty() {
        return warranty;
    }

    public void setWarranty(WarrantyType warranty) {
        this.warranty = warranty;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
