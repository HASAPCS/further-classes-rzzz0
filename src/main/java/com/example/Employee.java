package com.example;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private String department;

    public Employee(String name, int id, double salary, String department) {
        // TODO: Initialize the attributes
        this.name = name;
        this.salary = salary;
        this.department = department;

    }
    public String getName(){
        return this.name;
    }
   
    public int getId(){
        return this.id;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setName (String newName){
        this.name = newName;
    }

    public void setId (int newId){
        this.id = newId;
    }

    public void setDepartment (String newDepartment){
        this.department = newDepartment;
    }

    public void setSalary (double newSalary){
        this.salary = newSalary;
    }
    // TODO: Implement getters, setters, and any other methods you find necessary
}
