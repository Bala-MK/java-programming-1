package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
class Employee{
    private int empId;
    private String empName,empDesignation,empLocation;
    private double empSalary;
    Employee(int empId, String empName, String empDesignation, double empSalary, String empLocation){
        this.empId=empId;
        this.empName=empName;
        this.empDesignation=empDesignation;
        this.empSalary=empSalary;
        this.empLocation=empLocation;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public double getEmpSalary() {
        return empSalary;
    }
}
public class Prog3 {
    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList();
        list.add(new Employee(1,"abc","Employee",100000,"Madurai"));
        list.add(new Employee(2,"pqr","Manager",60000,"Mumbai"));
        list.add(new Employee(3,"xyz","Accounting",45000,"Hyderabad"));

        List<String> names=list.stream().map(e->e.getEmpName()).collect(Collectors.toList());
        List<Double> salary=list.stream().filter(e->e.getEmpSalary()>50000).map(e->e.getEmpSalary()).collect(Collectors.toList());
        List<String> locations=list.stream().filter(e->e.getEmpLocation().startsWith("M")).map(e->e.getEmpLocation()).collect(Collectors.toList());
        List<String> designations=list.stream().filter(e->e.getEmpDesignation().endsWith("e")).map(e->e.getEmpDesignation()).collect(Collectors.toList());

        System.out.println(names);
        System.out.println(salary);
        System.out.println(locations);
        System.out.println(designations);
    }
}
*/