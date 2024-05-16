package isp.lab6.exercise1;

import java.util.HashMap;

public class Student {
    private int id;
    public String name;
    public HashMap<String,Integer> grades;

    public Student (String name,int ID){
        this.name = name;
        this.grades = new HashMap<>();
        this.id = ID;
    }
    public void addGrade(String numeMaterie, int nota){
        grades.put(numeMaterie,nota);
    }
    public double averageGrade(){
        int sum = 0;
        double average;
        for(int i: grades.values()){
            sum+=i;
        }
        average = (double)sum/grades.size();
        return average;

    }

    public void setName(String name) {
        this.name = name;
    }
    public void changeGrade(String materie, int newGrade){
        grades.put(materie,newGrade);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
