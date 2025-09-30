package com.swapnil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question59 {
    public static void main(String[] args) {
        int[] tree={1,2,3,4,5};
        int person=4;

        ans(tree,person);
    }

    public static void ans(int[] tree,int person){
        int index=-1;
        for(int i=0;i<tree.length;i++){
            if(tree[i]==person){
                index=i;
                break;
            }
        }

        if(index==0){
            System.out.println(-1);
            return;
        }

        int parent=(index-1)/2;
        List<Integer> siblings=new ArrayList<>();
        int left=2*parent+1;
        int right=2*parent+2;
        if(left<tree.length && left!=index) siblings.add(tree[left]);
        if(right<tree.length && right!=index) siblings.add(tree[right]);

        if(siblings.isEmpty()) System.out.println(-1);
        else {
            Collections.sort(siblings);
            System.out.println(siblings);
        }

    }
}

/*
* 1. Problem Interpretation (Binary Tree Structure)
The key to understanding the problem is the rule that defines the parent-child relationships within the array:

"...the emperor is at the main position and his kids are at pos (2i + 1) and (2i + 2)."

This is the standard formula for representing a complete binary tree in an array:

Root (Parent): The element at index i.

Left Child: The element at index 2i+1.

Right Child: The element at index 2i+2.

Parent of any node at index i (where i>0): The element at index ⌊
2
i−1
​
 ⌋.

Since siblings are defined as children who share the same parent, the goal is to:

Find the index of person X.

Find the index of X's parent.

Find all children of that parent (the siblings).
* */