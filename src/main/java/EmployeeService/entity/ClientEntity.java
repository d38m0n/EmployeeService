package EmployeeService.entity;

import javax.persistence.*;


@Entity
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client;

}
