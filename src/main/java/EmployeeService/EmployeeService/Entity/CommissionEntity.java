package EmployeeService.EmployeeService.Entity;


import EmployeeService.EmployeeService.Enum.StatusCommission;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CommissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_commission;
    private String numberProject;
    private int counterMachine;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private CommuteEntity commuteTo;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private CommuteEntity commuteFrom;
    private String entryDate;
    private String entryTime;
    private String startWorkDate;
    private String startWorkTime;
    private String endDate;
    private String endTime;
    private StatusCommission statusCommission;

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "commission_worker",
            joinColumns = {@JoinColumn(name = "commission_id")},
            inverseJoinColumns = {@JoinColumn(name = "worker_id")})
    private List<WorkerEntity> workers = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "commission_component",
            joinColumns = {@JoinColumn(name = "commission_id")},
            inverseJoinColumns = {@JoinColumn(name = "component_id")})
    private List<ComponentEntity> components = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "commission_machine",
            joinColumns = {@JoinColumn(name = "commission_id")},
            inverseJoinColumns = {@JoinColumn(name = "machine_id")})
    private List<MachineEntity> machines = new ArrayList<>();

    public Long getId_commission() {
        return id_commission;
    }

    public void setId_commission(Long id_commission) {
        this.id_commission = id_commission;
    }

    public int getCounterMachine() {
        return counterMachine;
    }

    public void setCounterMachine(int counterMachine) {
        this.counterMachine = counterMachine;
    }

    public List<ComponentEntity> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentEntity> components) {
        this.components = components;
    }

    public List<MachineEntity> getMachines() {
        return machines;
    }

    public void setMachines(List<MachineEntity> machines) {
        this.machines = machines;
    }

    public String getNumberProject() {
        return numberProject;
    }

    public void setNumberProject(String numberProject) {
        this.numberProject = numberProject;
    }

    public CommuteEntity getCommuteTo() {
        return commuteTo;
    }

    public void setCommuteTo(CommuteEntity commuteTo) {
        this.commuteTo = commuteTo;
    }

    public CommuteEntity getCommuteFrom() {
        return commuteFrom;
    }

    public void setCommuteFrom(CommuteEntity commuteFrom) {
        this.commuteFrom = commuteFrom;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(String startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    public String getStartWorkTime() {
        return startWorkTime;
    }

    public void setStartWorkTime(String startWorkTime) {
        this.startWorkTime = startWorkTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<WorkerEntity> getWorkers() {
        return workers;
    }

    public void setWorkers(List<WorkerEntity> workers) {
        this.workers = workers;
    }

    public StatusCommission getStatusCommission() {
        return statusCommission;
    }

    public void setStatusCommission(StatusCommission statusCommission) {
        this.statusCommission = statusCommission;
    }
}
