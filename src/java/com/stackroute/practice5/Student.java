package com.stackroute.practice5;

//4. Create a Student class that represents the following information of a student: id, name, and age
//        all the member variables should be private .
//        a. Implement `getter and setter` .
//        b. Create a `StudentSorter` class that implements `Comparator interface` .
//        c. Write a class `Maintest` create Student class object(minimum 5)
//        d. Add these student object into a List of type Student .
//        e. Sort the list based on their age in decreasing order, for student having
//        same age, sort based on their name.
//        f. For students having same name and age, sort them according to their ID.

public class Student {

    private String studentName;
    private int id,age;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
