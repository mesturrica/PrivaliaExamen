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

    static ArrayList<Dia> Dias = new ArrayList<Dia>();
    static Calendar now = Calendar.getInstance();
    static int dia_semana;
    static int dia_mes;
    static int ultimo_jueves_mes;

    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws ParseException {

        BigDecimal inversion = new BigDecimal(49);

        FileUtil Lectura = new FileUtil();

        //Cierre = Lectura.ReadFileCierre("Cierre");
        Dias = Lectura.ReadFileCierre();

        System.out.println(now.get(Calendar.DAY_OF_WEEK));

        Iterator<Dia> it = Dias.iterator();
// mientras al iterador queda proximo juego
        while (it.hasNext()) {
            Dia dia = it.next();
            /*Logica para calcular los beneficios*/
            now.setTime(dia.getFecha());
            System.out.println(dia.getFecha());
            //System.out.println(now.get(Calendar.DAY_OF_WEEK));
            dia_semana = now.get(Calendar.DAY_OF_WEEK);
            dia_mes = now.getActualMaximum(Calendar.DAY_OF_MONTH);
            
            //Falta añadir logica para saber si el dia actual esta dentro del ultimo dia de cada més.
            if((dia_semana == 6 || dia_semana == 5)){
               inversion = inversion.add(dia.getCierre().subtract(dia.getApertura()));
            }
        }
        
        //System.out.println(inversion);

    }

}
