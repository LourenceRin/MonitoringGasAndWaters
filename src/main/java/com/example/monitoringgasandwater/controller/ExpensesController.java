package com.example.monitoringgasandwater.controller;

import com.example.monitoringgasandwater.entity.ExpensesEntity;
import com.example.monitoringgasandwater.exceptions.ExpenseNotFoundException;
import com.example.monitoringgasandwater.repository.ExpensesRepository;
import com.example.monitoringgasandwater.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/addExpense")
    public ResponseEntity addExpense(@RequestBody ExpensesEntity expense){
        try{
            expenseService.addExpense(expense);
            return ResponseEntity.ok("Затраты были сохранены!");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка!");
        }
    }

    @GetMapping
    public ResponseEntity getExpenses(@RequestParam UUID id){
        try{
            return ResponseEntity.ok(expenseService.getOne(id));
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка!");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable UUID id) {
        try {
            return ResponseEntity.ok(expenseService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
