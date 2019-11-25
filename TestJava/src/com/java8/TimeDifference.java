package com.java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TimeDifference {

	public static void main(String args[]) {
		LocalDateTime one = LocalDateTime.now();
		
		LocalDateTime two = LocalDateTime.of(2015, Month.AUGUST, 1, 10, 10);
		System.out.println("one -> " + one);
		System.out.println("two -> " + two);
		Period period = Period.between(one.toLocalDate(), two.toLocalDate());
		
		/*System.out.println(period);
		
		System.out.println(period.getMonths());
		
		System.out.println(period.getDays());
		
		System.out.println(Duration.between(one, two).toDays());*/
		
		System.out.println(ChronoUnit.MONTHS.between(one, two));
		
		LocalDate independenceDay = LocalDate.of(2014, Month.JULY, 4);
		LocalDate christmas = LocalDate.of(2014, Month.DECEMBER, 25);

		System.out.println("Until christmas: " + independenceDay.until(christmas).getMonths() + "." + independenceDay.until(christmas).getDays());
		System.out.println("Until christmas (with crono): " + independenceDay.until(christmas, ChronoUnit.DAYS));
	}
}
