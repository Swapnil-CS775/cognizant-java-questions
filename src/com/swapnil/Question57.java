package com.swapnil;

public class Question57 {
    public static void main(String[] args) {
        int[] changes={-39957,-17136,35466,21820,-26711};
        ans(changes);
    }

    public static void ans(int[] arr){
        int price=0;
        int minPrice=0;
        for(int i=0;i<arr.length;i++){
            price+=arr[i];
            if(price<minPrice) minPrice=price;
        }

        System.out.println(minPrice);
    }
}
