package se03.task01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CrazyLogger {
    private StringBuilder crazyLog;
    //private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-YYYY : hh:mm - ");
    private static String fmtDate= "dd-MM-yyyy : HH:mm - ";
    // MSG fmt dd-mm-YYYY : hh-mm -
    private static DateFormat df;// = new SimpleDateFormat(fmtDate);
    private static int DATE_LENGTH;// = 21;//Date -- 10, time -- 5, 4 spaces, 2 symbols
    private static ArrayList<Integer> logEnds; //list of last byte every records
    
    static{
       df = new SimpleDateFormat(fmtDate);
       DATE_LENGTH = fmtDate.length();
    }

    public CrazyLogger() {
        crazyLog = new StringBuilder();
        logEnds = new ArrayList<Integer>();
        //DATE_LENGTH = fmtDate.length();
    }


    public CrazyLogger addEvent(StringBuilder event) {
        Date date = Calendar.getInstance().getTime();
                
        //System.out.println(date);
        // format date, add record
        // put end to logEnds
        return this;
    }

    public ArrayList<StringBuilder> searhEvent(StringBuilder subString) {
        ArrayList<StringBuilder> result = new ArrayList<StringBuilder>();
        // getEventByID(every),
        // search subString,
        // add to result
        return result;
    }

    public StringBuilder getEventByID(int id) {
        StringBuilder result = new StringBuilder();
        // get first
        //
        return result;
    }
}
