package com.dev;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalanderDay {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a date in DDMMYYYY format: ");
		String date = in.nextLine();
		
		findDay(date);
	}

	private static void findDay(String date) {
		
		Calendar calander = Calendar.getInstance();
		
		
		String onlyDate = date.substring(0, 2);
		System.out.println("Date is: " + onlyDate);
		int finalDate = Integer.parseInt(onlyDate);
		
		String onlyMonth = date.substring(2, 4);
		System.out.println("Month is: " + onlyMonth);
		int finalMonth = Integer.parseInt(onlyMonth);
		
		String onlyYear = date.substring(4, 8);
		System.out.println("Year is: " + onlyYear);
		int finalYear = Integer.parseInt(onlyYear);
		
		calander.set(finalYear, finalMonth, finalDate);
		int day = calander.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day value: " + day);
		
		switch (day) {
		case 1: System.out.println("Its a Sunday");
		break;
		
		case 2: System.out.println("It's a Monday");
		break;
		
		case 3: System.out.println("It's a Tuesday");
		break;
		
		case 4: System.out.println("It's a Wednesday");
		break;
		
		case 5: System.out.println("It's a Thursday");
		break;
		
		case 6: System.out.println("It's a Friday");
		break;
		
		case 7: System.out.println("It's a Saturday");
		break;
		
		default: System.out.println("THis Does Not Compute");
		break;
		}
		
		
		
	}

}
