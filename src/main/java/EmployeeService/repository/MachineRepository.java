package EmployeeService.repository;

import EmployeeService.model.entity.MachineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepository extends JpaRepository<MachineEntity, Long> {
}
