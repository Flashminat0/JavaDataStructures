package com.sliit;

public class Main {

    public static void main(String[] args) {
        ArrayEX a = new ArrayEX(3);
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        a.insert(6);
        a.printArr();
//        a.removeOf(2);
//        a.printArr();
//        a.removeOf(4);
//        a.printArr();

        System.out.println(a.searchForNumber(4));
    }
}
