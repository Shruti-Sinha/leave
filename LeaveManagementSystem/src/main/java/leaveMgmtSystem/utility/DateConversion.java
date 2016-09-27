package leaveMgmtSystem.utility;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class DateConversion {

	static Timestamp timeStamp = null;
	static java.util.Date uDate = null;
	static SimpleDateFormat sDate = null;
	static Date sqlDate = null;
	static String stringDate = null;

	public static Timestamp getcurrentTimeStamp() {
		uDate = new java.util.Date();
		timeStamp = new Timestamp(uDate.getTime());
		return timeStamp;
	}

	public  static  java.sql.Date stringToSQLDate(String date) throws ParseException {
		// Convert string date value to java.sql.Date class obj-dob
		sDate = new SimpleDateFormat("dd-mm-yy");
		uDate = sDate.parse(date);
		sqlDate = new java.sql.Date(uDate.getTime());
		return sqlDate;

	}

	public static String sqlDateToString(Date date) {
		// converting sql date to java.util.Date
		uDate = (java.util.Date) date;
		// Convert util date to string
		sDate = new SimpleDateFormat("MM-dd-yy");
		stringDate = sDate.format(uDate);
		return stringDate;

	}

}
