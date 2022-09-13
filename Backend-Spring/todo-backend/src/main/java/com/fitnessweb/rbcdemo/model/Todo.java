package com.fitnessweb.rbcdemo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "todo")
public class Todo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(name = "taskname")
    private String name;
    @Column(name = "usermail")
    private String email;
    @Column(name = "category")
    private String address;
    @Column(name = "level")
    private String city;
    @Column(name = "weight")
    private Integer code;
    @Column(name = "gender")
    private String country;
    
    @Column(name = "date")
    private String dueDate;
    
    @Column(name = "description")
    private String description;
 
    @Column(name = "caloriesburnt")
    private Double total;
    
    @Column(name = "taskdone")
    private Boolean isPaid;


    public Todo() {}

    public Todo(String name, String email, String address, String city, Integer code, String country, String description, String dueDate, Double total, Boolean isPaid) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.city = city;
        this.code = code;
        this.country = country;
        this.dueDate = dueDate;
        this.description = description;
        this.total = total;
        this.isPaid = isPaid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }
}
