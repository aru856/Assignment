package com.firstjava;
import java.util.Scanner;
public class Marks{

  public static void main(String[]args) {
      int mrk1, mrk2, mrk3, mrk4, mrk5, sum, percentage, total;
      Scanner sc = new Scanner(System.in);
      mrk1 = sc.nextInt();
      mrk2 = sc.nextInt();
      mrk3 = sc.nextInt();
      mrk4 = sc.nextInt();
      mrk5 = sc.nextInt();
      total = 500;
      sum = mrk1 + mrk2 + mrk3 + mrk4 + mrk5;
      percentage = sum * 100 / total;
      System.out.println("English   :"+mrk1);
      System.out.println("Science   :"+mrk2);
      System.out.println("Maths     :"+mrk3);
      System.out.println("History   :"+mrk4);
      System.out.println("Geography :"+mrk5);
      System.out.println("Total     :"+sum);
      if (percentage <= 100 && percentage >= 90)
          System.out.println("Grade A and the percentage is:" + percentage+"%");
      else if (percentage < 90 && percentage >= 80)
          System.out.println("Grade B and the percentage is:" + percentage+"%");
      else if (percentage < 80 && percentage >= 65)
          System.out.println("Grade C and the percentage is:" + percentage+"%");
      else if (percentage < 65 && percentage >= 50)
          System.out.println("Grade D and the percentage is:" + percentage+"%");
      else
          System.out.println("Grade U and the percentage is:" + percentage+"%");

  }

 }



