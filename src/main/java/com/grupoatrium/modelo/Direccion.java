package com.grupoatrium.modelo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value="direccion")
public class Direccion {
	
	@Value("c/Egido de la Alcantarilla nº 16 4c")
	private String calle;
	
	@Value("16")
	private int numero;
	
	@Value("Jaen")
	private String poblacion;
	
	@Value("23002")
	private int cp;
	
	@Value("Jaen")
	private String provincia;
	
	//constructor por defecto
	public Direccion() {
    }

 //	contructor con todos los atributos
    public Direccion(String calle,int numero,String poblacion,int cp,String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.poblacion= poblacion;
        this.cp=cp;
        this.provincia=provincia;
    }
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String toString() {
	    return   "calle =" + calle +"\n"+
	        	 " numero =" + numero +"\n"+
	        	 " poblacion =" + poblacion+"\n"+
	    		 " cp ="+cp+"\n"+
	    		 " provincia ="+provincia;
	}
}
