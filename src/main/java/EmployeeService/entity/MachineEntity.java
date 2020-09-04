package EmployeeService.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MachineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_machine;

}
