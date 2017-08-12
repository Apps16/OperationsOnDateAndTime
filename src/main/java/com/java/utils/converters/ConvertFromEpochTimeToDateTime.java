package com.java.utils.converters;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import com.java.utils.Constants;

//Converts from epoch time in milliseconds to date-time format
public class ConvertFromEpochTimeToDateTime {
	public static void main(String[] args) {
		Long dateTime = Constants.epochTime;
		String format = Constants.destinationFormatFromEpoch;

		ConvertFromEpochTimeToDateTime dateConverter = new ConvertFromEpochTimeToDateTime();
		try {

			String result = dateConverter.convertToEpochTime(dateTime, format);
			System.out.println("Epoch time : '" + dateTime + "' in '" + format + "' format is '" + result + "'");
		} catch (NullPointerException nullEx) {

			System.out.println("Please enter a non null date-time format");
		} catch (IllegalArgumentException illEx) {

			System.out.println("Please enter a valid date-time format");
		}
	}

	public String convertToEpochTime(Long timeDate, String format)
			throws NullPointerException, IllegalArgumentException {
		DateFormat dateFormat = new SimpleDateFormat(format);
		dateFormat.setTimeZone(TimeZone.getTimeZone(Constants.timeZone));
		String formatted = dateFormat.format(timeDate);
		
		return formatted;
	}
}
