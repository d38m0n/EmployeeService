package EmployeeService.model.entity;

import EmployeeService.model.permanent.typeE.WorkerRole;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class WorkerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "worker_jobsheet",
            joinColumns = {@JoinColumn(name = "id_worker")},
            inverseJoinColumns = {@JoinColumn(name = "id_jobsheet")})
    private List<JobsheetEntity> jobsheets = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "worker_eq",
            joinColumns = {@JoinColumn(name = "id_worker")},
            inverseJoinColumns = {@JoinColumn(name = "id_eq")})
    private List<EquipmentEntity> equipments = new ArrayList<>();

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private AddressEntity address;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private CarEntity car;

    private String login;
    private String email;
    private String pwd;
    private String name;
    private String surname;
    private String pesel;
    private WorkerRole role;
    private BigDecimal salary;
    private String joinDate;
    private String codeService;

    public WorkerEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<JobsheetEntity> getJobsheets() {
        return jobsheets;
    }

    public void setJobsheets(List<JobsheetEntity> jobsheets) {
        this.jobsheets = jobsheets;
    }

    public List<EquipmentEntity> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<EquipmentEntity> equipments) {
        this.equipments = equipments;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public WorkerRole getRole() {
        return role;
    }

    public void setRole(WorkerRole role) {
        this.role = role;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }
}
