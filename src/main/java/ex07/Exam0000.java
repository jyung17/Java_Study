package main.java.ex07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam0000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date myDate = new Date();
		SimpleDateFormat sm = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

		System.out.println(sm.format(myDate));
	}

}
