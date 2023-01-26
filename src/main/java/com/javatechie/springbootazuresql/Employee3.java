package com.javatechie.springbootazuresql;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee3 {
    
    @Id
    @GeneratedValue
    
    private int id;
    private String name;
    private String dept;
    private long salary;

}
