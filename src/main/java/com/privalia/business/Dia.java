package com.privalia.business;

import java.math.BigDecimal;
import java.util.Date;

public class Dia {


	private Date fecha;
	private BigDecimal apertura;
	private BigDecimal cierre;
        
        
         public Dia(Date fecha, BigDecimal apertura, BigDecimal cierre) {
            this.fecha = fecha;
            this.apertura = apertura;
            this.cierre = cierre;
        }
         
             public Dia() {

        }
         
         
             public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setApertura(BigDecimal apertura) {
        this.apertura = apertura;
    }

    public void setCierre(BigDecimal cierre) {
        this.cierre = cierre;
    }

    public Date getFecha() {
        return fecha;
    }

    public BigDecimal getApertura() {
        return apertura;
    }

    public BigDecimal getCierre() {
        return cierre;
    }
    
    

}
