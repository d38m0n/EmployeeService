package EmployeeService.model.dto;

import EmployeeService.model.permanent.statusE.ComponentStatus;
import EmployeeService.model.permanent.typeE.ComponentType;

import java.math.BigDecimal;


public class ComponentDTO {

    private String name;
    private ComponentType componentType;
    private String brand;
    private String model;
    private BigDecimal prince;
    private MachineDTO machineEntity;
    private String dateInput;
    private String dateOutput;
    private ComponentStatus componentStatus;
    private StorageSiteDTO storageSite;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentType componentType) {
        this.componentType = componentType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrince() {
        return prince;
    }

    public void setPrince(BigDecimal prince) {
        this.prince = prince;
    }

    public MachineDTO getMachineEntity() {
        return machineEntity;
    }

    public void setMachineEntity(MachineDTO machineEntity) {
        this.machineEntity = machineEntity;
    }

    public String getDateInput() {
        return dateInput;
    }

    public void setDateInput(String dateInput) {
        this.dateInput = dateInput;
    }

    public String getDateOutput() {
        return dateOutput;
    }

    public void setDateOutput(String dateOutput) {
        this.dateOutput = dateOutput;
    }

    public ComponentStatus getComponentStatus() {
        return componentStatus;
    }

    public void setComponentStatus(ComponentStatus componentStatus) {
        this.componentStatus = componentStatus;
    }

    public StorageSiteDTO getStorageSite() {
        return storageSite;
    }

    public void setStorageSite(StorageSiteDTO storageSite) {
        this.storageSite = storageSite;
    }
}
