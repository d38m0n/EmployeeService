package EmployeeService.model.entity;

import EmployeeService.model.permanent.statusE.ComponentStatus;
import EmployeeService.model.permanent.typeE.ComponentType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class ComponentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String componentType;
    private String brand;
    private String model;
    private String prince;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private MachineEntity machineEntity;
    private String dateInput;
    private String dateOutput;
    private String componentStatus;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private StorageSiteEntity storageSite;

    public ComponentEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id_product) {
        this.id = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
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

    public String getPrince() {
        return prince;
    }

    public void setPrince(String prince) {
        this.prince = prince;
    }

    public MachineEntity getMachineEntity() {
        return machineEntity;
    }

    public void setMachineEntity(MachineEntity machineEntity) {
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

    public String getComponentStatus() {
        return componentStatus;
    }

    public void setComponentStatus(String componentStatus) {
        this.componentStatus = componentStatus;
    }

    public StorageSiteEntity getStorageSite() {
        return storageSite;
    }

    public void setStorageSite(StorageSiteEntity storageSite) {
        this.storageSite = storageSite;
    }
}
