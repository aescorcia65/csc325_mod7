package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{
    private short credits;

    public Senior(String name, short age, short credits) {
        super(name, age);
        if (credits < 85) throw new IllegalArgumentException("Senior must have at least 85 credits");
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Senior{" +
                "Name: " + super.getName() + ", " +
                "credits=" + credits + ", " +
                "GPA: " + super.getGpa() +
                '}';
    }
}
