package javabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * switch 语句中使用枚举常量
 * @author max.zhang
 *
 */
public class JudgeData {

	/*
	 * 使用switch case判断颜色
	 */
	public void printcolor(color col) {
		switch(col) {
		case BLACK:
			System.out.println("1");
			break;
		case WHITE:
			System.out.println("2");
			break;
		case RED:
			System.out.println("NOTHING");
			break;
		default:
			System.out.println("None");
		}
	}

	public static void main(String[] args) {
		JudgeData jd = new JudgeData();

		String str1 = "ABCDEFG";
		System.out.println(str1.length());
		System.out.println(Math.PI);
		System.out.println(Math.E);

		Calendar calender = Calendar.getInstance();
		System.out.println(calender.getTime());
		Date date = calender.getTime();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(f.format(date));

		// int <-> integer
		int m = 100;

		// boxing
		Integer int1 = new Integer(m);
		// unboxing
		int n = int1.intValue();

		Integer int2 = new Integer(100);
		System.out.println("int1 == int2 is " + int1.equals(int2));

		// int <-> string
		System.out.println(m + "");

		String s1 = "500";
		String s2 = "351.4";
		int1 = Integer.parseInt(s1);
		float f2 = Float.parseFloat(s2);

		System.out.println("int1 == " + int1 + ", " + "f2 == " + f2);
	}
}
