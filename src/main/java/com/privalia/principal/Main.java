package com.privalia.principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.privalia.business.Dia;
import com.privalia.util.FileUtil;

public class Main {
	ArrayList<Dia> Dias = new ArrayList<Dia>();
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		Date data = null;
	    DateFormat df = new SimpleDateFormat("dd-mmm-yyyy");
		Map<String, String> Cierre = new HashMap<String, String>();
		Map<String, String> Apertura = new HashMap<String, String>();

		FileUtil Lectura = new FileUtil();

		Cierre = Lectura.ReadFileCierre("Cierre");

		Apertura = Lectura.ReadFileCierre("Apertura");

		System.out.println(Cierre);
		System.out.println(Apertura);
		

		for (Map.Entry<String, String> Map : Cierre.entrySet()) {
		
		}

	}

}
