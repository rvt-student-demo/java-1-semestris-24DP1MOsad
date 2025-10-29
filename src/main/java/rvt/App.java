package rvt;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Student st1 = new Student("Janis", 12);
        // st1.name = "Janis";
        // st1.age = 12;
        
        Student st2 = new Student("Johs", 22);
        // st2.name = "Johs";
        // st2.age = 22;
        
        Student[] stArr = new Student[5];
        ArrayList<Student> stList = new ArrayList<>();
        stArr[0] = st1;
        stList.add(st2);
        
    }
}
