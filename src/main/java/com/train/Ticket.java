package com.train;

public class Ticket {
    int totalTickets;
    int roundTrip;

    public Ticket(int totalTickets, int roundTrip){
        this.totalTickets = totalTickets;
        this.roundTrip = roundTrip;
    }
    public void show(){
        System.out.println("Total tickets:" + totalTickets + "\n" +
                "Round-trip:" + roundTrip + "\n" +
                "Total:" + "\t" + ((totalTickets-roundTrip)*1000+(roundTrip*2000)*0.9));
    }
}
