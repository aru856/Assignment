package com.firstjava;
import java.util.Scanner;

public class avenger {
    String name, power,weapon,planet;
    int age;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        avenger[] av = new avenger[5];
        int i;

        for ( i = 0; i < 5; i++) {
            av[i] = new avenger();
            av[i].getDetails();
            av[i].displayDetails();
        }
    }
    private void getDetails() {
        System.out.println("Name:");
        name = sc.nextLine();
        System.out.println("Age:");
        age = sc.nextInt();
        System.out.println("Power:");
        sc.nextLine();
        power = sc.nextLine();
        System.out.println("Weapon:");
        weapon = sc.nextLine();
        System.out.println("Planet:");
        planet = sc.next();
    }

    private void displayDetails() {
        System.out.println("Avenger name is:" + name);
        System.out.println("Age is:" + age);
        System.out.println("Power is:" + power);
        System.out.println("Weapon:" + weapon);
        System.out.println("Planet:" + planet);

    }

    }

