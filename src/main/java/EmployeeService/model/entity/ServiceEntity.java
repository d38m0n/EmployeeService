package EmployeeService.model.entity;

import EmployeeService.model.permanent.statusE.ServicePriority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private ClientEntity clientEntity;

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "service_jobsheet",
            joinColumns = {@JoinColumn(name = "service_id")},
            inverseJoinColumns = {@JoinColumn(name = "jobsheet_id")})
    private List<JobsheetEntity> jobsheets = new ArrayList<>();

    private String codeService;
    private String dateInput;
    private String dateStartAction;
    private String dateFinisher;
    private String firstDateAction;
    private String timeStartAction;
    private String timeStopAction;

    private String servicePriority;

    public ServiceEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id_service) {
        this.id = id_service;
    }

    public ClientEntity getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public List<JobsheetEntity> getJobsheets() {
        return jobsheets;
    }

    public void setJobsheets(List<JobsheetEntity> jobsheets) {
        this.jobsheets = jobsheets;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getDateInput() {
        return dateInput;
    }

    public void setDateInput(String dateInput) {
        this.dateInput = dateInput;
    }

    public String getDateStartAction() {
        return dateStartAction;
    }

    public void setDateStartAction(String dateStartAction) {
        this.dateStartAction = dateStartAction;
    }

    public String getDateFinisher() {
        return dateFinisher;
    }

    public void setDateFinisher(String dateFinisher) {
        this.dateFinisher = dateFinisher;
    }

    public String getFirstDateAction() {
        return firstDateAction;
    }

    public void setFirstDateAction(String firstDateAction) {
        this.firstDateAction = firstDateAction;
    }

    public String getTimeStartAction() {
        return timeStartAction;
    }

    public void setTimeStartAction(String timeStartAction) {
        this.timeStartAction = timeStartAction;
    }

    public String getTimeStopAction() {
        return timeStopAction;
    }

    public void setTimeStopAction(String timeStopAction) {
        this.timeStopAction = timeStopAction;
    }

    public String getServicePriority() {
        return servicePriority;
    }

    public void setServicePriority(String servicePriority) {
        this.servicePriority = servicePriority;
    }
}
