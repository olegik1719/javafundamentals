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
		//System.out.printf("Size logEnds: %d\n",logEnds.size());
		if (subString.equals("")){
			// System.out.printf("substring is clean\n");
			for (int i = 0; i<logEnds.size()-1;result.add(getEventByID(i++)));// System.out.printf("EventID = %d\n", i);
		} else {
			int eventID = 0;
			int indexFound = crazyLog.indexOf(subString,DATE_LENGTH);
			while ((indexFound > 0)&(eventID<logEnds.size()-1)){
				// search event with this substring
				//System.out.printf("subString:%s\nevID: %d\n",subString,eventID);
				// System.out.printf("event:%s\n",getEventByID(eventID));
				while(logEnds.get(eventID) < indexFound) eventID++;
				// if (substring is for message) add event to list, 
				// start search from next event
				// System.out.printf("%s\n",getEventByID(eventID-1));
				// System.out.printf("%d\n",getEventByID(eventID-1,false).indexOf(subString));
				if (getEventByID(eventID-1,false).indexOf(subString) > -1){
					result.add(getEventByID(eventID-1));
				}
				// System.out.printf("EventID:%d\n", eventID);
				if (eventID<logEnds.size()) indexFound = crazyLog.indexOf(subString, logEnds.get(eventID));
				// else search from next message
				// 
				// 
			}
		}
		// old ideas:
		// getEventByID(every),
		//	String temp = getEventByID(id);
        // search subString,
        // add to result
        return result;
    }
	
	public CrazyLogger outEventByID(int id) {
		return outEventByID(id, true);
    }
	
	public CrazyLogger outEventByID(int id, boolean withDate) {
		System.out.println(getEventByID(id, withDate));
		return this;
    }

	public String getEventByID(int id) {
		return getEventByID(id, true);
    }
	
	public String getEventByID(int id, boolean withDate) {
        String result = "";
//		System.out.printf("EventIN = %d\n", id);
		//Check input
		if ((id>=0)&(id<logEnds.size()-1)){
			
			if (withDate) result = crazyLog.substring(logEnds.get(id),logEnds.get(id+1));
			else result = crazyLog.substring(logEnds.get(id)+DATE_LENGTH,logEnds.get(id+1));
//			System.out.printf("exit:%d\n",id);
		}
        return result;
	}

    public static void main(String[] args) {
        CrazyLogger cl = (new CrazyLogger()).addEvent("Hello world!")
				.addEvent("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
				.addEvent("He123456789!!!0")
				// .outEventByID(0,false)
				// .outEventByID(1,false)
				// .outEventByID(2,false)
				// .outEventByID(3,false)
			;
		//System.out.println(logEnds);
		System.out.println(cl.searchEvent("!"));
    }
}
