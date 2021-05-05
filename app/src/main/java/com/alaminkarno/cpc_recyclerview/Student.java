package com.alaminkarno.cpc_recyclerview;

public class Student {
    private int imageView;
    private String name,roll,department,section;

    public Student() {
    }

    public Student(int imageView, String name, String roll, String department, String section) {
        this.imageView = imageView;
        this.name = name;
        this.roll = roll;
        this.department = department;
        this.section = section;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
