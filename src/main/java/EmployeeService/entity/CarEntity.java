package EmployeeService.entity;

import EmployeeService.typeE.CarType;
import EmployeeService.typeE.FoundType;

import javax.persistence.*;

@Entity
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_car;
    private String brandCar;
    private String modelCar;
    private String numberReg;
    private CarType carType;
    private FoundType foundType;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private WorkerEntity workerEntity;
}
