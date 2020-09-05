package EmployeeService.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class EquipmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipment;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private WorkerEntity worker;
    private String numberID;
    private String name;
    private BigDecimal prince;
    private String dataBuy;
    private String dataInput;
    private String dataJoinToWorker;
    private String description;
    private String catalogNumber;
    private String Brand;
    private String usefulLife;

}
