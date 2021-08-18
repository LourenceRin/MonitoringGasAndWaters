package com.example.monitoringgasandwater.repository;

import com.example.monitoringgasandwater.entity.EntityExpenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ExpensesRepository extends JpaRepository<EntityExpenses, UUID> {
}
