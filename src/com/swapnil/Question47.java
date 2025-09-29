package com.swapnil;

public class Question47 {
    public static void main(String[] args) {
        int noOfTickets=35;
        boolean ref=true;
        boolean coupon=true;
        char circle='k';

        ans(noOfTickets,ref,coupon,circle);
    }

    public static void ans(int noTik,boolean ref,boolean coup, char circle){
        double newTkPrice=0.0;
        if(circle=='k'){
            newTkPrice=noTik * 75;
        }
        if(circle=='q'){
            newTkPrice=noTik * 150;
        }
        if(noTik>20){
            //get 10% discounts
            newTkPrice=newTkPrice * 0.90;
        }
        if(coup){
            newTkPrice=newTkPrice * 0.98;
        }
        double total=0;
        if(ref){
            total=newTkPrice+(50*noTik);
        }else {
            total=newTkPrice;
        }

        System.out.println(total);
    }
}
