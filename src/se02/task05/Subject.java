package se02.task05;

import lombok.Getter;

public enum Subject {
    MATHS(false),
    LANG(true),
    IT(false);

    @Getter
    private boolean isGradeInt;

    Subject(boolean isInt) {
        isGradeInt = isInt;
    }
    /*
    
     private class RecordToList{
        Student student;
        Number grade;
        RecordToList(Student student, Number grade){
            this.student = student;
            this.grade = grade;
        }
        RecordToList changeGrade(Number grade){
            this.grade = grade;
            return this;
        }
     }
     
     private ArrayList<RecordToList> records;
     
     public Subject addStudent(Student student){
        return addGrade(student, 0)
     }
     
     public Subject addRecord(RecordToList record){
        // add ...
     }
     
     public Subject addGrade(Student student, Number grade){
        if (student isn't in List){
            RecordToList record = new RecordToList(student,0);
            addRecord(record);
        }else{
            // change record
            
        }
        return this;
     }
     //Number getGrade(student){
     // if isInt Number.toInt
     // else Num.toDouble
     
     //public boolean isHere(student);
     
    */
}
