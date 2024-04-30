package com.section04;

import java.util.Calendar;
import java.util.Locale;
import static java.util.Calendar.*;
import java.util.Date;

public class Ex1011 {

public static int getDiffYears(Date first, Date last) {
		Calendar a = getCalendar(first);
		Calendar b = getCalendar(last);
		int diff = b.get(YEAR) - a.get(YEAR);
		
		if (a.get(MONTH) > b.get(MONTH) ||
				(a.get(MONTH) == b.get(MONTH) &&
				a.get(DATE) > b.get(DATE))) {
			diff --;
		}
		return diff;

	}
	public static Calendar getCalendar(Date date) {
		Calendar cal = Calendar.getInstance(Locale.KOREA);
		cal.setTime(date);
		return cal;
	}
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("현재 날짜: ");
		System.out.println(cal.get(YEAR) + "년");
		System.out.println(cal.get(MONTH) +1  + "일");
		System.out.println(cal.get(DATE) + "일");
		
		Date my_bday = new Date(2000, 11, 29);
		Date today = new Date();
		
		System.out.println();
		System.out.println("너의 나이는: " + getDiffYears(today, my_bday));
	}

}
