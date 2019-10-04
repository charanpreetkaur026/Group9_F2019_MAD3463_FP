package com.lambton;

import java.time.LocalDate;

public class Employee
{
    private String name;
    private int age;
    private Vehicle vehicle;
    private double earnings;

    public String getName() {
        return name;
    }

    public Employee(String name, int age, Vehicle vehicle) {
        this.name=name;
        this.age=calcBirthYear(age);
        setVehicle(vehicle);
    }

    public int calcBirthYear(int yearofBirth) {


        LocalDate end =  LocalDate.now();
        int age=Integer.valueOf(end.toString().substring(0, 4))  ;
        age=age-yearofBirth-1;
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}
