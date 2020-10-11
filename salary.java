package com.firstjava;
import java.time.LocalDate;
import java.time.Period;

public class salary {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1997, 11, 26);
        int years = Period.between(birthDate, today).getYears();
        String name = "Arudheepa";
        int mon_salary, tax_amount;
        System.out.println("Name :" + name);
        System.out.println("Age:" + years);
        mon_salary =50000;
        int annualsalary = mon_salary * 12;
        if(annualsalary >= 500000)
        {
            tax_amount = (annualsalary*20)/100;
            System.out.println("Annual salary:"+annualsalary);
            System.out.println("Tax Amount:"+tax_amount);
        }
        else if(annualsalary >= 400000 && annualsalary < 500000)
        {
            tax_amount = (annualsalary*15)/100;
            System.out.println("Annual salary:"+annualsalary);
            System.out.println("Tax Amount:"+tax_amount);
        }
        else if(annualsalary >= 300000 && annualsalary < 400000)
        {
            tax_amount = (annualsalary*10)/100;
            System.out.println("Annual salary:"+annualsalary);
            System.out.println("Tax Amount:"+tax_amount);
        }
        else if(annualsalary >= 200000 && annualsalary < 300000)
        {
            tax_amount = (annualsalary*5)/100;
            System.out.println("Annual salary:"+annualsalary);
            System.out.println("Tax Amount:"+tax_amount);
        }
        else
            System.out.println("No Tax");
    }
}