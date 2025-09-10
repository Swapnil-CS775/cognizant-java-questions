package com.swapnil;

public class Question16 {
    public static void main(String[] args) {
        int n=240;
        int p=50,q=8;

        ans(n,p,q);
    }

    public static void ans(int n,int p ,int q){
        int noOfTripsByBus=n/80;
        int remPassengers=n%80;
        int noOfTripsShutle=0;
        while(remPassengers>=8){
            remPassengers=remPassengers%8;
            noOfTripsShutle++;
        }
        if(remPassengers!=0) noOfTripsShutle++;

        int totalCost=(noOfTripsByBus * p * 75) + (noOfTripsShutle * q * 75);
        System.out.println(totalCost);
    }
}
