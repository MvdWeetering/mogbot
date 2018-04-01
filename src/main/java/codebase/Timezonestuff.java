package codebase;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Timezonestuff {
	public static ZonedDateTime getTimezoneData() {

		ZoneId thuis = ZoneId.systemDefault();
		LocalDateTime ldt = LocalDateTime.of(2018, Month.MARCH, 15, 16, 30);

		ZoneId usCentral = thuis;
		ZonedDateTime zdt = ZonedDateTime.of(ldt, usCentral);
		//System.out.println("home:" + zdt);

		return zdt;

	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(getTimezoneData());
		
		
	}
	
	
	
	
}
