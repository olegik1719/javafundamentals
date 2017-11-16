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
        logEnds = new ArrayList();
		logEnds.add(0);
    }


    public CrazyLogger addEvent(String event) {
        crazyLog.append(dateFormat.format(Calendar.getInstance().getTime())).append(event);
		// System.out.println(crazyLog.length());
        int currentEventLength = DATE_LENGTH + event.length();
		int previousEnd = logEnds.get(logEnds.size()-1); 
        logEnds.add(crazyLog.length());
        // System.out.printf("Log: %s\n",crazyLog.substring(previousEnd,logEnds.get(logEnds.size()-1)));
		// System.out.printf("Current Length: %d\n",currentEventLength);
		// System.out.printf("In _Ends_: %d\n",logEnds.get(logEnds.size()-1));
        // logEnds.add()
        // System.out.println(date);
        // format date, add record
        // put end to logEnds
        return this;
    }

    public ArrayList<String> searchEvent(String subString) {
        ArrayList<String> result = new ArrayList<String>();
		// getEventByID(every),
		//	String temp = getEventByID(id);
        // search subString,
        // add to result
        return result;
    }
	
	public CrazyLogger outEventByID(int id) {
		return outEventByID(id, false);
    }
	
	public CrazyLogger outEventByID(int id, boolean withDate) {
		System.out.println(getEventByID(id, withDate));
		return this;
    }

	public String getEventByID(int id) {
		return getEventByID(id, false);
    }
	
	public String getEventByID(int id, boolean withDate) {
        String result = "";
		//Check input
		if ((id>=0)&(id<logEnds.size())){
			if (withDate) result = crazyLog.substring(logEnds.get(id),logEnds.get(id+1));
			else result = crazyLog.substring(logEnds.get(id)+DATE_LENGTH,logEnds.get(id+1));
		}
        return result;
	}

    public static void main(String[] args) {
        CrazyLogger cl = (new CrazyLogger()).addEvent("Hello world!")
				.addEvent("")
				.addEvent("1234567890")
				.outEventByID(0,false)
				.outEventByID(1,false)
				.outEventByID(2,false)
            ;
		//System.out.println(logEnds);
		
    }
}
