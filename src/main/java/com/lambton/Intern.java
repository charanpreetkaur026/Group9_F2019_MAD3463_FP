package com.lambton;

public class Intern extends Employee

{
    private String schoolName;
    private double earnings;
    private Vehicle vehicle;

    public Intern(String name, int age, String schoolName,Vehicle vehicle) {
        super(name, age, vehicle);
        this.schoolName = schoolName;

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }
}
