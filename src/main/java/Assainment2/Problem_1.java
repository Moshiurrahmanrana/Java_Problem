package Assainment2;

import java.util.Scanner;
//print whether that year is a leap year or not
public class Problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        if ((Number%4==0) || (Number%100==0) || (Number%400==0)){
            System.out.println("This year is a Leap year");
        }
        else{
            System.out.println("This year is not a leap year");
        }


    }
}
