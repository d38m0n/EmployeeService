package EmployeeService.entity;

import EmployeeService.entity.WorkerEntity;
import EmployeeService.entity.JobsheetEntity;
import EmployeeService.typeEnum.ComponentStatus;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class ComponentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_product;

}
