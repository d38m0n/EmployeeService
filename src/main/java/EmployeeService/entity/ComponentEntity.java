package EmployeeService.entity;

import EmployeeService.statusE.ComponentStatus;
import EmployeeService.typeE.ComponentType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class ComponentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_product;
    private String name;
    private ComponentType componentType;
    private String brand;
    private String model;
    private BigDecimal prince;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private MachineEntity machineEntity;
    private String dateInput;
    private String dateOutput;
    private ComponentStatus componentStatus;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private StorageSiteEntity storageSite;

}
