package Assainment2;

import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        for(int i=1;i<=10;i++){
            int total=number*i;
            System.out.println(number+"*"+i+"="+total);
        }
    }
}
