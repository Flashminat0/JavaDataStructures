package com.sliit;

import java.util.Arrays;

public class ArrayM {
    public static void main(String[] args) {
        //initialize the array
        int[] newArr = new int[5];
        System.out.println(newArr); //this will print the memory location
        System.out.println(Arrays.toString(newArr));

        //Assign a element
        newArr[0] = 10;
        newArr[1] = 20;
        newArr[2] = 30;
        System.out.println(Arrays.toString(newArr));

        //Declare and initialize the array
        int[] newNewArray = {12, 23, 34, 45};

        //get the length of array
        System.out.println(newArr.length);
        System.out.println(newNewArray.length);


    }
}
