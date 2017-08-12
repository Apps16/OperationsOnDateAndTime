package com.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
                                                                                          
public class Calender {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
                                                                                                                                                                                                                                                                                                                  
		String date = "0000-00-00";
		try {                     
			if (date != null) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				sdf.setLenient(false);
				Date date1 = sdf.parse(date);
				sdf.format(date1);
                                  
				System.out.println("valid");
			} else {
				System.out.println("valid");
			}
		} catch (ParseException ex) {
			System.out.println("invalid");
		}

	}
}
