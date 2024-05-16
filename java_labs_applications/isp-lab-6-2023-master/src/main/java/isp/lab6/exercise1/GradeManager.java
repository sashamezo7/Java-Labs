package isp.lab6.exercise1;

import java.util.LinkedList;

public class GradeManager {
    LinkedList<Student> students;

    public GradeManager(){
        students = new LinkedList<>();
    }
    public void addStudent(Student s){
        students.add(s);
    }

    public void removeStudent(Student s){
        students.remove(s);
    }
    public void displayStudents(){
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + " ID: " + student.getId());
        }
    }
}
