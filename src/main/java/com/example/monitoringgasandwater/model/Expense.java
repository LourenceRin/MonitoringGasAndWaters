package com.example.monitoringgasandwater.model;

import com.example.monitoringgasandwater.entity.ExpensesEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
public class Expense {
    private UUID id;
    private String typeResource;
    private Long spentResource;

    public static Expense toModel(ExpensesEntity entity){
        Expense model = new Expense();
        model.setId(entity.getId());
        model.setTypeResource(entity.getTypeResource());
        model.setSpentResource(entity.getSpentResource());
        return model;
    }
}
