package codebase;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class convertDate {

	
	
	public static String changedateformat (String datum) throws ParseException {
		
		
		String start_dt = datum;
		DateFormat formatter = new SimpleDateFormat("DD-MM-yyyy"); 
		Date date = (Date)formatter.parse(start_dt);
		SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-DD");
		String finalString = newFormat.format(date);	
		return finalString;
		
	}
	
	
	public static void main(String[] args) throws ParseException {
		
		System.out.println(changedateformat("01-01-2017"));
		
	}
	
	
}
