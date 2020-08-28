package EmployeeService.EmployeeService.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CommissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_commission;
    private int counterMachine;

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "commission_user",
            joinColumns = {@JoinColumn(name = "commission_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private List<UserEntity> users = new ArrayList<>();

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

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
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
}
