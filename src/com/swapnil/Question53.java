package com.swapnil;

public class Question53 {
    public static void main(String[] args) {
        String[] courses={"Java", "Oracle", "C++", "Mysql", "Dotnet"};
        String c="Java";
        ans(courses,c);
    }

    public static void ans(String[] courses,String c){
        boolean notFound=true;
        for(String s:courses){
            if(s.equalsIgnoreCase(c)) {
                System.out.println("Present");
                notFound=false;
                break;
            }
        }

        if(notFound){
            System.out.println("Absent");
        }
    }
}
