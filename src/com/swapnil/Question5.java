package com.swapnil;


//Question 6 Also
public class Question5 {
    public static void main(String[] args) {
        String str="CDF";
        ans(str);
    }

    public static void ans(String str){
        int cons=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!='a' && c!='A' && c!='e' && c!='E' && c!='i' && c!='I' && c!='o' && c!='O' && c!='u' && c!='U'){
                cons++;
            }
        }
        if(cons==0)
            System.out.println(0);
        else
            System.out.println(fact(cons));
    }

    public static int fact(int n){
        if(n==0) return 1;
        return n * fact(n-1);
    }
}
