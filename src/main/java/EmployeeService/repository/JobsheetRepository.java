package EmployeeService.repository;

import EmployeeService.model.entity.JobsheetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsheetRepository extends JpaRepository<JobsheetEntity, Long> {
}
