package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{
    private short credits;
    public Freshman(String name, short age, short credits) {
        super(name, age);
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Freshmen{" +
                "Name: " + super.getName() + ", " +
                "credits: " + credits + ", " +
                "GPA: " + super.getGpa() +
                '}';
    }
}
