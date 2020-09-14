package EmployeeService.model.entity;


import EmployeeService.model.permanent.statusE.ServicePriority;
import EmployeeService.model.permanent.typeE.ServiceType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class JobsheetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String privName;
    private String serviceType;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private MachineEntity machineEntity;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private ClientEntity client;
    private String dateService;
    private String descriptionService;
    private String counterCurrently;
    private String place;

    private String timeStartRoad;
    private String timeStopRoad;
    private String totalTimeRoad;
    private String distanceRoad;

    private String timeStartWork;
    private String timeStopWork;
    private String totalTimeWork;
    private String servicePriority;
    private String signature;

    public JobsheetEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id_jobsheet) {
        this.id = id_jobsheet;
    }

    public String getPrivName() {
        return privName;
    }

    public void setPrivName(String privName) {
        this.privName = privName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public MachineEntity getMachineEntity() {
        return machineEntity;
    }

    public void setMachineEntity(MachineEntity machineEntity) {
        this.machineEntity = machineEntity;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public String getDateService() {
        return dateService;
    }

    public void setDateService(String dateService) {
        this.dateService = dateService;
    }

    public String getDescriptionService() {
        return descriptionService;
    }

    public void setDescriptionService(String descriptionService) {
        this.descriptionService = descriptionService;
    }

    public String getCounterCurrently() {
        return counterCurrently;
    }

    public void setCounterCurrently(String counterCurrently) {
        this.counterCurrently = counterCurrently;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTimeStartRoad() {
        return timeStartRoad;
    }

    public void setTimeStartRoad(String timeStartRoad) {
        this.timeStartRoad = timeStartRoad;
    }

    public String getTimeStopRoad() {
        return timeStopRoad;
    }

    public void setTimeStopRoad(String timeStopRoad) {
        this.timeStopRoad = timeStopRoad;
    }

    public String getTotalTimeRoad() {
        return totalTimeRoad;
    }

    public void setTotalTimeRoad(String totalTimeRoad) {
        this.totalTimeRoad = totalTimeRoad;
    }

    public String getDistanceRoad() {
        return distanceRoad;
    }

    public void setDistanceRoad(String distanceRoad) {
        this.distanceRoad = distanceRoad;
    }

    public String getTimeStartWork() {
        return timeStartWork;
    }

    public void setTimeStartWork(String timeStartWork) {
        this.timeStartWork = timeStartWork;
    }

    public String getTimeStopWork() {
        return timeStopWork;
    }

    public void setTimeStopWork(String timeStopWork) {
        this.timeStopWork = timeStopWork;
    }

    public String getTotalTimeWork() {
        return totalTimeWork;
    }

    public void setTotalTimeWork(String totalTimeWork) {
        this.totalTimeWork = totalTimeWork;
    }


    public String getServicePriority() {
        return servicePriority;
    }

    public void setServicePriority(String servicePriority) {
        this.servicePriority = servicePriority;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}