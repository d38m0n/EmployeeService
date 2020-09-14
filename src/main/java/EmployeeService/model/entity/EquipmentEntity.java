package EmployeeService.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class EquipmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private String numberID;
    private String name;
    private String prince;
    private String dataBuy;
    private String dataInput;
    private String dataJoinToWorker;
    private String description;
    private String catalogNumber;
    private String Brand;
    private String usefulLife;

    public EquipmentEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idEquipment) {
        this.id = idEquipment;
    }

    public String getNumberID() {
        return numberID;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrince() {
        return prince;
    }

    public void setPrince(String prince) {
        this.prince = prince;
    }

    public String getDataBuy() {
        return dataBuy;
    }

    public void setDataBuy(String dataBuy) {
        this.dataBuy = dataBuy;
    }

    public String getDataInput() {
        return dataInput;
    }

    public void setDataInput(String dataInput) {
        this.dataInput = dataInput;
    }

    public String getDataJoinToWorker() {
        return dataJoinToWorker;
    }

    public void setDataJoinToWorker(String dataJoinToWorker) {
        this.dataJoinToWorker = dataJoinToWorker;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getUsefulLife() {
        return usefulLife;
    }

    public void setUsefulLife(String usefulLife) {
        this.usefulLife = usefulLife;
    }
}
