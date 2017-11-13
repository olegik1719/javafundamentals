package se02.task05;

import lombok.Getter;
import lombok.Setter;

public class Student {
    
    @Getter
    @Setter
    private String name;

    public Student(String name){
        this.setName(name);
    }
    /*
    public boolean isInList(Subject subject){
        return (subject.isHere(this));
    }
    
    public Number gradeSubject(Subject subject){
        if (isInList){
            return (subject.getGrade(this))
        }
        return null
    }
    
    public double averageGrade(){
        Subject[] subjects = Subject.values();
        int countSubj = 0;// Yes, it's default, I know
        double sumGrades = 0; // Yes, it's default too
        for (int i=0; i < subjects.length; i++){
            if isInList(subjects[i]){
                countSubj++;
                sumGrades+=gradeSubject(subjects[i]);
            }
        }
        if (countSubj == 0) return -1
        else return sumGrades / countSubj
    }
    
    */
}
