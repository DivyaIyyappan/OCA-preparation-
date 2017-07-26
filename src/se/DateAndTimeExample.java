
package se;
//import java.text.Format;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTimeExample {
	
		public static void main(String[] args) {
		
			
			//creating date,time and datetime
	
	LocalDate d=LocalDate.of(2015, Month.JULY, 2);
	LocalDate d1=LocalDate.now();
System.out.println(d);
System.out.println(d1);
 
LocalTime t=LocalTime.of(6, 30, 59, 200);
LocalTime t1=LocalTime.now();
System.out.println(t);
System.out.println(t1);

LocalDateTime dt=LocalDateTime.of(2016, Month.APRIL, 02, 6, 30);
LocalDateTime dt1=LocalDateTime.now();
System.out.println(dt);
System.out.println(dt1);
                    
                     //manipulating date,time and datetime
LocalDate d2=LocalDate.now();
LocalDate d3=LocalDate.of(2015, Month.AUGUST, 3);
d2.plusDays(1);
d2.minusDays(1);
d3.plusDays(5);
d3.minusDays(5);
System.out.println(d2);   // LocalDateTime is immutable
System.out.println(d3);

System.out.println(d2.plusDays(1));
System.out.println(d3.plusDays(5));


LocalTime t2=LocalTime.now();
LocalTime t3=LocalTime.of(6, 30, 50);
t2.plusHours(1).minusHours(30);
t3.plusHours(1).minusMinutes(30);

System.out.println(t2);
System.out.println(t3);


System.out.println(t2.plusHours(1).minusHours(30));
System.out.println(t3.plusHours(1).minusMinutes(30));



LocalDateTime dt2=LocalDateTime.now();
LocalDateTime dt3=LocalDateTime.of(2015, Month.AUGUST, 02, 5, 45);
dt2=dt2.plusDays(5).plusMonths(2).plusYears(2).plusHours(1).plusMinutes(30).plusNanos(20);
dt3=dt3.minusDays(5).minusMinutes(2).minusYears(5).minusHours(1).minusMinutes(30).minusNanos(20);

System.out.println(dt2);
System.out.println(dt3);


//Formatting date and time
LocalDate oo=LocalDate.now();
System.out.println(oo.getDayOfMonth());
int p;
 p=oo.getYear();
System.out.println(p);
System.out.println(oo.getDayOfWeek());


LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
LocalTime time = LocalTime.of(11, 12, 34);
LocalDateTime dateTime = LocalDateTime.of(date, time);System.out.println(date
.format(DateTimeFormatter.ISO_LOCAL_DATE));
System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

Period i=Period.between(oo, date);
System.out.println(i);

	
	}

		
}
