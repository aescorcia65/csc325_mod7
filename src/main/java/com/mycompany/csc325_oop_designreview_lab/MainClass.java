/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ToDo 5: Fix the error

        // ToDo 6: Fix the constructor of the Student class

        // Todo 7: Create two classes for Freshman and Senior

        // ToDo 8: The senior class should have a minimum of 85 credits

        // ToDo 9: Add a toString method for the Student class
        // ToDo 10: Add a toString method for the Freshman class

		//Useless code
        Student std1 = new Student("James", (short) 20);
        // ToDo 11: Add a toString method for the Senior class

        std1 = new Freshman("James", (short) 20, (short) 12); // name, age, credits

        Student std2 = new Senior("John", (short) 30, (short) 90);


        // ToDo 12: Set the gpa of the student using the scanner and user
        // 			input and then print the output.
		System.out.print("Enter Studnet 1 GPA: ");

        double std1gpa = scanner.nextDouble();
		std1.setGpa(std1gpa);
		System.out.print("Enter Studnet 2 GPA: ");
        double std2gpa = scanner.nextDouble();
		std2.setGpa(std2gpa);

        System.out.println(std1);

        System.out.println(std2);

        // ToDo 13: add comments and explain your code

        // ToDo 14: submit using a pull request.
    }

}

