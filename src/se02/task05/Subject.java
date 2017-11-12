package se02.task05;

public enum Subject {
    MATHS(false),
    LANG(true),
    IT(false);

    private boolean isGradeInt;

    Subject(boolean isInt){
        isGradeInt = isInt;
    }
}
