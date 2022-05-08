package com.surya.busReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    private final String passengerName;
    private final  int busNumber;
    private Date date;

    public Booking() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter passenger name: ");
        passengerName = scanner.nextLine();

        System.out.println("Enter bus number: ");
        busNumber = scanner.nextInt();

        System.out.println("Enter Journey date in dd-MM-yyyy: ");
        String dateInput = scanner.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = simpleDateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
        int capacity = 0;
        for(Bus bus : buses){
            if (bus.getBusNumber() == busNumber){
                capacity = bus.getCapacity();
            }
        }

        int ticketsBooked = 0;
        for(Booking booking : bookings){
            if ((booking.busNumber == busNumber) && (booking.date.equals(date))){
                ticketsBooked++;
            }
        }
        return ticketsBooked < capacity;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public Date getDate() {
        return date;
    }
}