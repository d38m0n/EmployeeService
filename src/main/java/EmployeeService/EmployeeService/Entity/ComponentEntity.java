package EmployeeService.EmployeeService.Entity;

import EmployeeService.EmployeeService.Enum.StatusComponent;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class ComponentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_product;
    private String serialNumber;
    private String pratNumber;
    private String addDate;
    private String useDate;
    private BigDecimal prince;
    private String machineModel;
    private String place;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private WorkerEntity user;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private CommissionEntity commission;

    private StatusComponent status;

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPratNumber() {
        return pratNumber;
    }

    public void setPratNumber(String pratNumber) {
        this.pratNumber = pratNumber;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public BigDecimal getPrince() {
        return prince;
    }

    public void setPrince(BigDecimal prince) {
        this.prince = prince;
    }

    public String getMachineModel() {
        return machineModel;
    }

    public void setMachineModel(String machineModel) {
        this.machineModel = machineModel;
    }

    public String getUseDate() {
        return useDate;
    }

    public void setUseDate(String useDate) {
        this.useDate = useDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public WorkerEntity getUser() {
        return user;
    }

    public void setUser(WorkerEntity user) {
        this.user = user;
    }

    public CommissionEntity getCommission() {
        return commission;
    }

    public void setCommission(CommissionEntity commission) {
        this.commission = commission;
    }

    public StatusComponent getStatus() {
        return status;
    }

    public void setStatus(StatusComponent status) {
        this.status = status;
    }
}
