package com.swapnil;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Question24 {
    public static void main(String[] args) {
        int input1 = 6;
        String[] input2 = {"01-01-2023", "10-01-2023", "05-02-2023", "25-12-2022", "03-01-2023", "01-03-2023"};
        String input3 = "01-01-2023";
        String input4 = "31-01-2023";

        ans(input1,input2,input3,input4);
    }

    public static void ans(int input1,String[] input2,String start,String end){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);

        LocalDate startDate=LocalDate.parse(start,formatter);
        LocalDate endDate=LocalDate.parse(end,formatter);

        int validCount=0;

        for(String regDateStr:input2){
            LocalDate regDate=LocalDate.parse(regDateStr.trim(),formatter);

            boolean isValid = (regDate.isEqual(startDate) || regDate.isAfter(startDate)) && (regDate.isEqual(endDate) || regDate.isBefore(endDate));
            if(isValid){
                validCount++;
            }
        }

        System.out.println(validCount);
    }
}
