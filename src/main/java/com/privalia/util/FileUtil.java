package com.privalia.util;

import com.privalia.business.Dia;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class FileUtil {

	public ArrayList<Dia> ReadFileCierre() throws ParseException {
            //Array donde crearemos la coleccion de dias, para poder recorrerlo mas facilmente.
                BigDecimal apertura = null;
                BigDecimal cierre = null;
                ArrayList<Dia> Dias = new ArrayList<Dia>();
                Dia aux = null;
		String filename = "stocks-ITX.csv";
                SimpleDateFormat date1 = new SimpleDateFormat("dd-MMM-yyyy");
                Date  dateform = new Date();
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
                                

                                
                                 if (!day[0].equals("Fecha")) {

                                dateform= date1.parse(day[0]);
                      
                                aux = new Dia();
                                aux.setFecha(dateform);
                                apertura = new BigDecimal(day[1]);
                                cierre = new BigDecimal(day[2]);
                                aux.setApertura(apertura);
                                aux.setCierre(cierre);
                                Dias.add(aux);
                                 }
                        }
		} catch (IOException E) {
			System.out.println(E.getMessage());
		}

		return Dias;
	}
	


	public Date parseDate(String date, String format) throws ParseException
{
    SimpleDateFormat formatter = new SimpleDateFormat(format);
    return formatter.parse(date);
}
}
