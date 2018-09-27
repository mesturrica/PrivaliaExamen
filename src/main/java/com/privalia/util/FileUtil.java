package com.privalia.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FileUtil {

	public Map<String, String> ReadFileCierre(String Lectura) {
		String filename = "stocks-ITX.csv";
		Map<String, String> Cierre = new HashMap<String, String>();
		Map<String, String> Apertura = new HashMap<String, String>();

		List<String> daysPrice = new ArrayList<String>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("stocks-ITX.csv"));

			String line = br.readLine();
			while (line != null && !line.isEmpty()) {
				String[] day = line.split(";", -1);
				daysPrice.add(day[0]);
				Cierre.put(day[0], day[2]);
				Apertura.put(day[0], day[1]);
				line = br.readLine();
			}
		} catch (IOException E) {
			System.out.println(E.getMessage());
		}

		if (Lectura.equals("Apertura")) {
			return Apertura;
		} else {
			return Cierre;
		}
	}
	


	public Date parseDate(String date, String format) throws ParseException
{
    SimpleDateFormat formatter = new SimpleDateFormat(format);
    return formatter.parse(date);
}
}
