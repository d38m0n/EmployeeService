package EmployeeService.model.entity;

import javax.persistence.*;

@Entity
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brandCar;
    private String modelCar;
    private String numberReg;
    private String carType;
    private String foundType;


    public CarEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id_car) {
        this.id = id_car;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getNumberReg() {
        return numberReg;
    }

    public void setNumberReg(String numberReg) {
        this.numberReg = numberReg;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getFoundType() {
        return foundType;
    }

    public void setFoundType(String foundType) {
        this.foundType = foundType;
    }


}
