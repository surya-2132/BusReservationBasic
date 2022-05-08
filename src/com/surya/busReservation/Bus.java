package com.surya.busReservation;

public class Bus {
    private int busNumber;
    private boolean isAC;
    private int capacity;

    public Bus(int busNumber, boolean isAC, int capacity) {
        this.busNumber = busNumber;
        this.isAC = isAC;
        this.capacity = capacity;
    }

    public void displayBusInfo(){
        System.out.println("Bus Number: " + busNumber + " , is AC available: " + isAC + " , and Capacity: " + capacity);
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public boolean isAC() {
        return isAC;
    }

    public void setAC(boolean AC) {
        isAC = AC;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber=" + busNumber +
                ", isAC=" + isAC +
                ", capacity=" + capacity +
                '}';
    }
}
