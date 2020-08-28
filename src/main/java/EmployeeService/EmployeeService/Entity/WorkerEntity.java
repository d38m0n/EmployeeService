package EmployeeService.EmployeeService.Entity;

import EmployeeService.EmployeeService.Enum.RoleWorker;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class WorkerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String login;
    private RoleWorker role;
    private String pwd;
    private String email;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private CompanyEntity company;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private EmployeeDataEntity employeeData;

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "user_commission",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "commission_id")})
    private List<CommissionEntity> commissions = new ArrayList<>();


    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public RoleWorker getRole() {
        return role;
    }

    public void setRole(RoleWorker role) {
        this.role = role;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeDataEntity getEmployeeData() {
        return employeeData;
    }

    public void setEmployeeData(EmployeeDataEntity employeeData) {
        this.employeeData = employeeData;
    }

    public List<CommissionEntity> getCommissions() {
        return commissions;
    }

    public void setCommissions(List<CommissionEntity> commissions) {
        this.commissions = commissions;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }
}