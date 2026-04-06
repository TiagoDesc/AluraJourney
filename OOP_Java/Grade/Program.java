package OOP_Java.Grade;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student's name: ");
        String name = sc.nextLine();
        System.out.println("Enter the student's grade1: ");
        double grade1 = sc.nextDouble();
        System.out.println("Enter the student's grade2: ");
        double grade2 = sc.nextDouble();

        Grade grade = new Grade(name, grade1, grade2);
        grade.averageGrade(grade1, grade2);
        System.out.println(grade);
    }

}
