package dr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class fix {
    public static final String DATE_FORMAT_CSV_YYYYMMDD = "yyyy/MM/dd";
    public static final String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";
    public static final int MINUTES_PER_HOUR = 60;
    public static final String SPACE = " ";
	public static void main(String[] args) {
		fix fix = new fix();
		fix.convertToWorkingSchedules();
	}
	public void convertToWorkingSchedules() {
		String date = "20191212";
		String dateString = fix.convertStringToCSVDateFormat(date);
		String startTime = dateString.concat(SPACE)
                .concat(convertMinutesToHHmmss(651*1000));
		System.out.println(startTime);
		
		
}
	public static String convertStringToCSVDateFormat(String strDate) {
      
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_CSV_YYYYMMDD, Locale.JAPAN);
        Date dateTemp = null;
        try {
            dateTemp = new SimpleDateFormat(DATE_FORMAT_YYYYMMDD, Locale.JAPAN).parse(strDate);
        } catch (ParseException e) {
           
        }
        return sdf.format(dateTemp);
    }
	 public static String convertMinutesToHHmmss(int source) {
	        return convertMinutesToHHmm(source).concat(":00");
	    }
	 public static String convertMinutesToHHmm(int source) {
	        return String.format("%02d:%02d", source / MINUTES_PER_HOUR, source % MINUTES_PER_HOUR);
	    }
}
