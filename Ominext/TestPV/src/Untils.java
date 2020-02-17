import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Untils {
	public static void main(String[] args) {
		Untils untils = new Untils();
		System.out.println(untils.StringDates("20191110", "20191011"));
	}
	public long StringDates(String startDate, String endDate) {
		
		LocalDate localstartDate = LocalDate.parse(startDate, DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate localendDate = LocalDate.parse(endDate, DateTimeFormatter.BASIC_ISO_DATE);
		long numOfDaysBetween = ChronoUnit.DAYS.between(localstartDate, localendDate);
		
		return numOfDaysBetween;
	}
	
	public static String convertSecondsToHHmm(Date stringDate) {
		Calendar calendar = GregorianCalendar.getInstance(); 
		calendar.setTime(stringDate); 
		calendar.get(Calendar.HOUR_OF_DAY);
		
	    return "";
	}
	
}