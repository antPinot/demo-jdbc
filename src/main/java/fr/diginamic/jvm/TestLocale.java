package fr.diginamic.jvm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestLocale {

	public static void main(String[] args) {

		SimpleDateFormat formateur = new SimpleDateFormat("EEEE dd MMMM yyyy");
		
		Calendar dateCal = Calendar.getInstance();
		
		dateCal.set(Calendar.YEAR, 2022);
		
		dateCal.set(Calendar.MONTH, 9);
		
		dateCal.set(Calendar.DAY_OF_MONTH, 27);
		
		Date date = dateCal.getTime();

		String dateFormatee = formateur.format(date);
		
		System.out.println(dateFormatee);

	}

}
