package se02.task07;
import java.lang.annotation.Documented;

@Documented
public @interface AnnoSubmarine {
    String author() default "Olegik1719";

    String project() default "EPAM Cources";

    int taskNumber();
    //Annotation body
}