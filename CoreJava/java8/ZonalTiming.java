package java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonalTiming {
	
	public static void main(String[] args) {
		
//		Set<String> zone = ZoneId.getAvailableZoneIds();
		
		ZoneId zone = ZoneId.of("US/Central");
		
		ZonedDateTime time = ZonedDateTime.now(zone);
		
		System.out.println(time);
		
		
		
	}

}
