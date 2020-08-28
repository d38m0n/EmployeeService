package EmployeeService.EmployeeService.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MachineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_machine;
    private String fullName;
    private String brand;
    private String model;
    private int totalCounter;

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "machine_component",
            joinColumns = {@JoinColumn(name = "machine_id")},
            inverseJoinColumns = {@JoinColumn(name = "component_id")})
    private List<ComponentEntity> components = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "machine_commission",
            joinColumns = {@JoinColumn(name = "machnie_id")},
            inverseJoinColumns = {@JoinColumn(name = "commission_id")})
    private List<CommissionEntity> commissions = new ArrayList<>();

    public Long getId_machine() {
        return id_machine;
    }

    public void setId_machine(Long id_machine) {
        this.id_machine = id_machine;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public int getTotalCounter() {
        return totalCounter;
    }

    public void setTotalCounter(int totalCounter) {
        this.totalCounter = totalCounter;
    }

    public List<ComponentEntity> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentEntity> components) {
        this.components = components;
    }

    public List<CommissionEntity> getCommissions() {
        return commissions;
    }

    public void setCommissions(List<CommissionEntity> commissions) {
        this.commissions = commissions;
    }
}
