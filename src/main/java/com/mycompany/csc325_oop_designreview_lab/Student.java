/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
    private double gpa;

    // ToDo 1: Make this class a child of Human
    public Student(String name, short age) {
        super(name, age);
    }

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter
    @Override
    public String getAddress() {
        return super.address;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void setAddress(String address) {
        super.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name: " + super.getName() +
                "gpa=" + this.gpa +
                '}';
    }
	
	// ToDo 4: Add comments to your code
}
