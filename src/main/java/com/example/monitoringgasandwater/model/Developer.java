package com.example.monitoringgasandwater.model;

import com.example.monitoringgasandwater.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Developer {
    private Long id;
    private String login;
}
