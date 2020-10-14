package com.firstjava;

import java.util.Scanner;

public class add {


    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = new int[5];
        for (int i=0;i<=4;i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            sum = sum + arr[i] ;
        }
        System.out.println("sum of all values:"+sum);
    }


}
