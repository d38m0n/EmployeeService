package EmployeeService.model.dto;

import EmployeeService.model.permanent.typeE.CarType;
import EmployeeService.model.permanent.typeE.FoundType;


public class CarDTO {


    private String brandCar;
    private String modelCar;
    private String numberReg;
    private CarType carType;
    private FoundType foundType;
    private WorkerDTO workerEntity;



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

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public FoundType getFoundType() {
        return foundType;
    }

    public void setFoundType(FoundType foundType) {
        this.foundType = foundType;
    }

    public WorkerDTO getWorkerEntity() {
        return workerEntity;
    }

    public void setWorkerEntity(WorkerDTO workerEntity) {
        this.workerEntity = workerEntity;
    }
}
