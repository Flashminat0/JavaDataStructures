package com.sliit;

public class ArrayEX {
    private int lengthArr;
    int[] arrNew;
    int[] arrNewNew;

    public ArrayEX(int length) {
        arrNew = new int[length];
        lengthArr = 0;
    }

    public void insert(int num) {
        if (isArrFull()) {
            System.out.println("Array is Full ...");
            arrNewNew = new int[lengthArr + 1];
            int i;
            for (i = 0; i < lengthArr; i++) {
                arrNewNew[i] = arrNew[i];
            }
            arrNewNew[i] = num;
            arrNew = new int[arrNewNew.length];
            for (int j = 0; j < arrNew.length; j++) {
                arrNew[j] = arrNewNew[j];
            }
            lengthArr++;
        } else {
            arrNew[lengthArr] = num;
            lengthArr++;
        }
    }

    public void removeOf(int searchNumber) {
        if (isEmpty()) {
            System.out.println("Array is Empty");
            return;
        }
        int index = searchForNumber(searchNumber);
        arrNewNew = new int[arrNew.length - 1];
        int i = 0;
        int x = 0;
        while (i < arrNew.length) {
            {
                if (i != index) {
                    arrNewNew[x]= arrNew[i];
                    x++;
                }
                i++;
            }
        }
        System.out.println(" ");
        arrNew = new int[arrNewNew.length];
        for (int r = 0; r < arrNewNew.length; r++) {
            arrNew[r] = arrNewNew[r];
        }
        lengthArr++;
    }

    public int searchForNumber(int number) {
        for (int i = 0; i < arrNew.length; i++) {
            if (arrNew[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return lengthArr == 0;
    }

    public boolean isArrFull() {
        return arrNew.length == lengthArr;
    }

    public void printArr() {
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + " ");
        }
        System.out.println(" ");
    }

}
