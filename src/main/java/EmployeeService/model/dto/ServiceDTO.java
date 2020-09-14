package EmployeeService.model.dto;

import EmployeeService.model.permanent.statusE.ServicePriority;

import java.util.ArrayList;
import java.util.List;

public class ServiceDTO {


    private ClientDTO clientEntity;
    private List<JobsheetDTO> jobsheets = new ArrayList<>();
    private String codeService;
    private String dateInput;
    private String dateStartAction;
    private String dateFinisher;
    private String firstDateAction;
    private String timeStartAction;
    private String timeStopAction;

    private ServicePriority servicePriority;


    public ClientDTO getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientDTO clientEntity) {
        this.clientEntity = clientEntity;
    }

    public List<JobsheetDTO> getJobsheets() {
        return jobsheets;
    }

    public void setJobsheets(List<JobsheetDTO> jobsheets) {
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

    public ServicePriority getServicePriority() {
        return servicePriority;
    }

    public void setServicePriority(ServicePriority servicePriority) {
        this.servicePriority = servicePriority;
    }
}
