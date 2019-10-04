package com.lambton;

public class CommissionBasedPartTime extends PartTime
{
    private double commissionPerc;

    public CommissionBasedPartTime(String name, int age, float rate, float hoursWorked, double commissionPerc) {
        super(name, age, rate, hoursWorked);
        this.commissionPerc = commissionPerc;
    }

    public double getCommissionPerc() {
        return commissionPerc;
    }

    public void setCommissionPerc(double commissionPerc) {
        this.commissionPerc = commissionPerc;
    }

    public void printMyData() {

    }

    public void setcommissionPerc(double commissionPerc) {
        if (commissionPerc > 0.0) {
            this.commissionPerc = commissionPerc;
        } else {
            throw new IllegalArgumentException("Commission rate must be greater than zero");
        }
    }
}
