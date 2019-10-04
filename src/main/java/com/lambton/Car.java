package com.lambton;

public class Car extends Vehicle

{
    private Double distanceTravelled;
    private String capacity;

    public Car(java.lang.Double distanceTravelled, java.lang.String capacity) {
        this.distanceTravelled = distanceTravelled;
        this.capacity = capacity;
    }

    public Double getDistanceTravelled() {
        return distanceTravelled;
    }
    public void setDistanceTravelled(Double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
    public String getCapacity() {
        return capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}
