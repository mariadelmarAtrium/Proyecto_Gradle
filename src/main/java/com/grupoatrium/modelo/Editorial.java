package com.grupoatrium.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="editorial")
public class Editorial {
	@Value("Rama")
	private String nombre;
	
	@Autowired
	private Direccion direccion;
	
	@Value("26033795A")
	private String nif;
	
	
	//constructor por defecto
	public Editorial() {
    }

	//contructor con todos los atributos
    public Editorial(String nombre, Direccion direccion, String nif) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nif = nif;
    }
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	@Override
	public String toString() {
	    return  "nombre =" + nombre +"\n"+
	    		"nif =" + this.nif+ "\n"+
	    		"Direccion \n"+this.direccion.toString()+"\n";
	}
}
