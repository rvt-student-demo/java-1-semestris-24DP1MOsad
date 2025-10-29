package rvt;

public class Student {
    
    String name;
    int age;

    public Student(String n, int a) {
        n = name;
        a = age;
    }

    public void introduce(){
        System.out.println("Student: " + name + ", age: " + age);
    }
}
