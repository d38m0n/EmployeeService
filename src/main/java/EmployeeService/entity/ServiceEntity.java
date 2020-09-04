package EmployeeService.entity;

import EmployeeService.typeEnum.ServicePriority;
import EmployeeService.typeEnum.ServiceStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_service;

}
