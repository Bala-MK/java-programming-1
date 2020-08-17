package com.company;

import java.util.ArrayList;

class Employee{
    String name, Address;
    int year;
    Employee(String name,int year, String Address){
        this.name=name;
        this.year=year;
        this.Address=Address;
    }

    @Override
    public String toString() {
        return name+"\t\t"+year+"\t\t"+Address;
    }
}
public class Prog6 {
    static void printEmp(Employee emp){
        System.out.println(emp);
    }

    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee("Robert",1994,"64C- WallStreet"));
        list.add(new Employee("Sam",2000,"68D- WallStreet"));
        list.add(new Employee("John",1999,"26B- WallStreet"));
        list.forEach(e->printEmp(e) );
    }
}
