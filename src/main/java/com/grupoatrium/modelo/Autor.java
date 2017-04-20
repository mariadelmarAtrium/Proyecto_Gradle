package com.grupoatrium.modelo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("autor1")
public class Autor {
	
	@Value("Craig Walls")
	private String nombre;
	
	@Value("Inglaterra")
	private String nacionalidad;
	
	@Value("El autor es un ingeniero de la empresa Pivolta")
	private String comentarios;
	
	
	//constructor por defecto
	
	public Autor() {
	    }
	//contructor con todos los atributos
	public Autor(String nombre, String nacionalidad, String comentarios) {
	        this.nombre = nombre;
	        this.nacionalidad = nacionalidad;
	        this.comentarios = comentarios;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	
    public String toString() {
        return  "Autor \n"+"nombre: "+this.getNombre()+"\n"+
        		"nacionalidad: "+this.getNacionalidad()+ "\n"+
        		"comentarios: "+this.getComentarios()+ "\n";
    }
}