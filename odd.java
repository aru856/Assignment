package com.firstjava;

public class odd {
    public static void main(String[]args) {
        int[] arr = new int[5];
        arr[0] = 7;
        arr[1] = 7;
        arr[2] = 8;
        arr[3] = 9;
        arr[4] = 4;
        for (int i = 0; i <=arr[4]; i++)
        {
            if (arr[i] % 2 != 0)
            {
                System.out.println("odd value:" + arr[i]);
            }
        }
    }
}
