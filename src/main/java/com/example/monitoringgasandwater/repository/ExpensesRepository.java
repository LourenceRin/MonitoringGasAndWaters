package com.example.monitoringgasandwater.repository;

import com.example.monitoringgasandwater.entity.ExpensesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

public interface ExpensesRepository extends JpaRepository<ExpensesEntity, UUID> {
    List<ExpensesEntity> findAll();
    List<ExpensesEntity>findAllByUserName(String userName);
}
