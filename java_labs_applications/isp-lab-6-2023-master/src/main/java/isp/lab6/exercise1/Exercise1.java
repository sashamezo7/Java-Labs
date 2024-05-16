package isp.lab6.exercise1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Exercise1 {
    public static void main(String[] args) {

        GradeManager gradeManager = new GradeManager();
        Student s = new Student("Marian Ioane",1);
        Student s2 = new Student("Pop Ionel",2);
        s.addGrade("Mate",10);
        s.addGrade("Romana",5);
        s2.addGrade("Fizica",4);
        s.changeGrade("Mate",3);
        gradeManager.addStudent(s);
        gradeManager.addStudent(s2);
        gradeManager.displayStudents();

    }
}
