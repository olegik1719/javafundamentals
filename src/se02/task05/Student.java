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

}
