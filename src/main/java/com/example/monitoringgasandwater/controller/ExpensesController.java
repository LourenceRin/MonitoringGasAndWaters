package com.example.monitoringgasandwater.controller;

import com.example.monitoringgasandwater.entity.EntityExpenses;
import com.example.monitoringgasandwater.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    private ExpensesRepository repository;

    @PostMapping
    public ResponseEntity addExpense(@RequestBody EntityExpenses expense){
        try{
            repository.save(expense);
            return ResponseEntity.ok("Затраты были сохранены!");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error!");
        }
    }
}
