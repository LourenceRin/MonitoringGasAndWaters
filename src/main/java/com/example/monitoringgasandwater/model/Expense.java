package com.example.monitoringgasandwater.model;

import com.example.monitoringgasandwater.entity.ExpensesEntity;
import com.example.monitoringgasandwater.entity.UserEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


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

    public Expense() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTypeResource() {
        return typeResource;
    }

    public void setTypeResource(String typeResource) {
        this.typeResource = typeResource;
    }

    public Long getSpentResource() {
        return spentResource;
    }

    public void setSpentResource(Long spentResource) {
        this.spentResource = spentResource;
    }
}
