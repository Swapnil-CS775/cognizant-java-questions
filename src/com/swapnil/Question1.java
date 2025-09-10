package com.swapnil;

import java.util.HashMap;

public class Question1 {
    public static void main(String[] args) {
        String s1="abcaba";
        ans(s1);
        ans2(s1);
    }

    //using hashmap
    public static void ans(String str){
        HashMap<Character,Integer>myMap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!myMap.containsKey(str.charAt(i))){
                myMap.put(str.charAt(i),i+1);
            }
        }

        StringBuilder ans=new StringBuilder();
        for(int i =0;i<str.length();i++){
            int n=myMap.get(str.charAt(i));
            for(int j=0;j<n;j++){
                ans.append(str.charAt(i));
            }
            if(i!=str.length()-1) {
                ans.append("-");
            }
        }

        System.out.println(ans.toString());
    }


    //using array
    public static void ans2(String str){
        StringBuilder ans=new StringBuilder();
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)-'a']==0){
                arr[str.charAt(i)-'a']=i+1;
            }
        }

        for(int i =0;i<str.length();i++){
            int n=arr[str.charAt(i)-'a'];
            for(int j=0;j<n;j++){
                ans.append(str.charAt(i));
            }
            if(i!=str.length()-1) {
                ans.append("-");
            }
        }
        System.out.println(ans.toString());
    }
}
