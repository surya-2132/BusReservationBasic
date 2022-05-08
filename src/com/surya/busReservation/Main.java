package com.surya.busReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, false, 6));
        buses.add(new Bus(3, true, 7));

        for(Bus bus : buses){
            bus.displayBusInfo();
        }

        //to loop of booking
        int userOption = 1;
        Scanner scanner = new Scanner(System.in);
        while(userOption == 1) {
            System.out.println("Enter 1 for Booking and Enter 2 to exit");
            userOption = scanner.nextInt();
            if (userOption == 1){
                Booking booking = new Booking();
                if (booking.isAvailable(bookings, buses)){
                    bookings.add(booking);
                    System.out.println("Your Booking is confirmed");
                }else{
                    System.out.println("No seat is Available, Try Another Bus");
                }
            }else{
                System.out.println("ThankYou Visit again");
            }
        }
    }
}