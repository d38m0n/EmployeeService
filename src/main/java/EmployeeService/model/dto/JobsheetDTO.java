package EmployeeService.model.dto;


import EmployeeService.model.permanent.statusE.ServicePriority;
import EmployeeService.model.permanent.typeE.ServiceType;

import java.util.ArrayList;
import java.util.List;

public class JobsheetDTO {
    private int privName;
    private ServiceType serviceType;
    private MachineDTO machineEntity;
    private ClientDTO client;
    private String dateService;
    private String descriptionService;
    private String counterCurrently;
    private String place;
    private String timeStartRoad;
    private String timeStopRoad;
    private String totalTimeRoad;
    private int distanceRoad;
    private String timeStartWork;
    private String timeStopWork;
    private String totalTimeWork;
    private List<WorkerDTO> workers = new ArrayList<>();
    private ServicePriority servicePriority;
    private String signature;



    public int getPrivName() {
        return privName;
    }

    public void setPrivName(int privName) {
        this.privName = privName;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public MachineDTO getMachineEntity() {
        return machineEntity;
    }

    public void setMachineEntity(MachineDTO machineEntity) {
        this.machineEntity = machineEntity;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
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

    public int getDistanceRoad() {
        return distanceRoad;
    }

    public void setDistanceRoad(int distanceRoad) {
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

    public List<WorkerDTO> getWorkers() {
        return workers;
    }

    public void setWorkers(List<WorkerDTO> workers) {
        this.workers = workers;
    }

    public ServicePriority getServicePriority() {
        return servicePriority;
    }

    public void setServicePriority(ServicePriority servicePriority) {
        this.servicePriority = servicePriority;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}