package com.lambton;

public abstract class FullTime extends Employee
{
    private double salary;
    private double bonus;
    private Vehicle vehicle;

    public double getSalary() {
        return salary;
    }

    public FullTime(String name, int age, double salary,double bonus,Vehicle vehicle) {
        super(name, age,vehicle);
        this.salary=salary;
        this.bonus=bonus;
        setVehicle(vehicle);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
