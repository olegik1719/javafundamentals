package se02.task05;
import lombok.Getter;

public enum Subject {
    MATHS(false),
    LANG(true),
    IT(false);
    
    @Getter
    private boolean isGradeInt;

    Subject(boolean isInt){
        isGradeInt = isInt;
    }
}
