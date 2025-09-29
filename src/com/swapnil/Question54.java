package com.swapnil;

import java.util.ArrayList;

public class Question54 {
    public static void main(String[] args) {
        String[] products={"mobile,10000,20","shoe,5000,10","watch,6000,15","laptop,35000,5"};
        ans(products);
    }

    public static void ans(String[] products){

        ArrayList<Integer>minDiscount=new ArrayList<>();
        double minDisc=Integer.MAX_VALUE;
        for(int i=0;i<products.length;i++){
            String[] oneProduct=products[i].split(",");
            int price=Integer.parseInt(oneProduct[1]);
            int disc=Integer.parseInt(oneProduct[2]);
            int currentDiscount=(price*disc)/100;
            if(currentDiscount<minDisc){
                minDiscount.clear();
                minDiscount.add(i);
                minDisc=currentDiscount;
            }else if(currentDiscount==minDisc){
                minDiscount.add(i);
            }
        }

        for(int i:minDiscount){
            System.out.println(products[i]);
        }
    }
}
