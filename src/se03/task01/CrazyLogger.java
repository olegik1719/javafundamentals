package se03.task01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class CrazyLogger {
    private StringBuilder crazyLog;
    private static String fmtDate= "dd-MM-yyyy : HH:mm - ";
    // MSG fmt dd-mm-YYYY : hh-mm -
    private static DateFormat dateFormat;// = new SimpleDateFormat(fmtDate);
    private static int DATE_LENGTH;// = 21;//Date -- 10, time -- 5, 4 spaces, 2 symbols
    private static ArrayList<Integer> logEnds; //list of last byte every records
    
    static{
       dateFormat = new SimpleDateFormat(fmtDate);
       DATE_LENGTH = fmtDate.length();
    }

    public CrazyLogger() {
        crazyLog = new StringBuilder();
        logEnds = new ArrayList<>();
    }


    public CrazyLogger addEvent(String event) {
        crazyLog.append(dateFormat.format(Calendar.getInstance().getTime())).append(event);
        int currentEventLength = DATE_LENGTH + event.length();
        logEnds.add(currentEventLength);
        //System.out.printf("Log: %s\nCurrent Length: %d\n In _Ends_: %d",crazyLog.substring(0,logEnds.get(logEnds.size()-1)));
        //logEnds.add()
        //System.out.println(date);
        // format date, add record
        // put end to logEnds
        return this;
    }

    public ArrayList<StringBuilder> searchEvent(StringBuilder subString) {
        ArrayList<StringBuilder> result = new ArrayList<StringBuilder>();
        // getEventByID(every),
        // search subString,
        // add to result
        return result;
    }

    public String getEventByID(int id) {
        String result = "";
        int startPosition=0;
        for (int i = 0; i < id-1; i++) {
            startPosition+=logEnds.get(i);
        }
        result = crazyLog.substring(startPosition,logEnds.get(id-1));
        return result;
    }

    public static void main(String[] args) {
        (new CrazyLogger()).addEvent("Hello world!");
    }
}
