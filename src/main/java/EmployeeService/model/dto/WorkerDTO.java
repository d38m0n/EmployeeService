package EmployeeService.model.dto;

import EmployeeService.model.permanent.typeE.WorkerRole;

import java.math.BigDecimal;


public class WorkerDTO {


    private String login;
    private String email;
    private String pwd;
    private String name;
    private String surname;
    private String pesel;
    private AddressDTO addressEntity;
    private WorkerRole role;
    private BigDecimal salary;
    private String joinDate;
    private String codeService;


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

    public AddressDTO getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressDTO addressEntity) {
        this.addressEntity = addressEntity;
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
