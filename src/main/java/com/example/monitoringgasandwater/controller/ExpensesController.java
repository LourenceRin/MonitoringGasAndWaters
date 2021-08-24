package com.example.monitoringgasandwater.controller;

import com.example.monitoringgasandwater.entity.ExpensesEntity;
import com.example.monitoringgasandwater.repository.ExpensesRepository;
import com.example.monitoringgasandwater.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/addExpense")
    public ResponseEntity addExpense(@RequestBody ExpensesEntity expense, Principal principal){
        try{
            expense.setUserName(principal.getName());
            expenseService.addExpense(expense);
            return ResponseEntity.ok("Затраты были сохранены!");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка!");
        }
    }

    @GetMapping
    public ResponseEntity<List<ExpensesEntity>> getAll(){
        return ResponseEntity.ok(expenseService.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable UUID id) {
        try {
            return ResponseEntity.ok(expenseService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/{userName}")
    public ResponseEntity<List<ExpensesEntity>> getByUser(@PathVariable String userName){
        return ResponseEntity.ok(expenseService.getExpensesByUser(userName));
    }

}
