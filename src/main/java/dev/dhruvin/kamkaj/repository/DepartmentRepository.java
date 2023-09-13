package dev.dhruvin.kamkaj.repository;

import dev.dhruvin.kamkaj.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
