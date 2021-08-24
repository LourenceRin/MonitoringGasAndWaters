package com.example.monitoringgasandwater.repository;

import com.example.monitoringgasandwater.entity.ExpensesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ExpensesRepository extends JpaRepository<ExpensesEntity, UUID> {
    List<ExpensesEntity> findAll();
}
