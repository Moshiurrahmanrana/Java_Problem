package Assainment2;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gpa = 0;
        int total_gpa = 1;
        for (int i=1;i<=4 ; i++){
            System.out.println("enter subject "+i+" marks: ");
            int marks = input.nextInt();
            if (marks >=80 && marks <=100){
                gpa= 4.0;
            }
            total_gpa+=gpa;
        }
        System.out.println("cgpa: "+total_gpa/4);
    }
}