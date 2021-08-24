package com.example.monitoringgasandwater.service;

import com.example.monitoringgasandwater.entity.ExpensesEntity;
import com.example.monitoringgasandwater.exceptions.ExpenseNotFoundException;
import com.example.monitoringgasandwater.model.Expense;
import com.example.monitoringgasandwater.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ExpenseService {

    @Autowired
    private ExpensesRepository repository;

    public void addExpense (ExpensesEntity expense){
        repository.save(expense);
    }

    public Expense getOne(UUID id) throws ExpenseNotFoundException {
        ExpensesEntity expensesEntity = repository.findById(id).get();
        if (expensesEntity == null){
            throw new ExpenseNotFoundException("Показатель не найден!");
        }
        return Expense.toModel(expensesEntity);
    }

    public UUID delete(UUID id) {
        repository.deleteById(id);
        return id;
    }

    public List<ExpensesEntity> getAll(){
        List<ExpensesEntity> list = repository.findAll();
        return list;
    }

}
