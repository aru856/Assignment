package com.firstjava;

import java.util.Scanner;

class Employee  {
    String name,name1;
    String cityname,cityname1;
    int age,age1;
    public void display(){
        System.out.println("The Name is:"+ name);
        System.out.println("The age is:" +age);
        System.out.println("Cityname:"+cityname);
    }
    public void display1(){
        System.out.println("The Name is:"+name1);
        System.out.println("The age is:"+age1);
        System.out.println("Cityname:"+cityname1);

    }
}

public class Main {

    public static void main(String[] args) {

        Employee e = new Employee();
        Employee e1 = new Employee();
        e.name="dheepa";
        e.age=23;
        e.cityname="cbe";
        e1.name1="aru";
        e1.age1=24;
        e1.cityname1="chennai";
        e.display();
        e1.display1();
    }

}



