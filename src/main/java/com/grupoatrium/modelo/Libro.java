package com.grupoatrium.modelo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



import com.grupoatrium.modelo.Editorial;
import com.grupoatrium.modelo.Autor;

import java.util.List;

@Component(value = "libro")
public class Libro {
	@Value("978-84-415-3682-1")
	private String isbn;
	
	@Value("Spring")
	private String titulo;
	
	@Autowired
	@Qualifier("autor1")
	private List<Autor> autores;
	
	@Autowired
	@Qualifier("editorial")
	private Editorial editorial;
	
	@Value("4")
	private int publicacion;
	
	@Value("45.0")
	private double precio;
	
	@Value("Spring es un framework....")
	private String descripcion;
	
		
	
	//constructor por defecto
	
	 public Libro() {
	    }

	 //contructor con todos los atributos
	    public Libro(String titulo, String isbn,int publicacion,
	    		double precio,String descripcion) {
	        this.titulo = titulo;
	        this.isbn = isbn;
	        this.publicacion = publicacion;
	        this.precio=precio;
	        this.descripcion=descripcion;
    }
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void getAutores() {
		//return autores;
		 for(int i=0; i< this.autores.size(); i++) {
	            System.out.println(this.autores.get(i));
	     }
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	public void getEditorial() {
		//return editorial;
		System.out.println(this.editorial.toString());
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	
	public int getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(int publicacion) {
		this.publicacion = publicacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
	    return "Libro " + "\n titulo =" + this.getTitulo() +"\n"+
	        			  " isbn =" + this.getIsbn() +"\n"+
	        			  " publicacion =" + this.getPublicacion() + "\n"+
  	        		      " precio =" + this.getPrecio()+ "€ "+"\n"+
  	        		      " descripcion =" + this.getDescripcion()+"\n"+
	           			  " Editorial  \n " + this.editorial.toString()+"\n"+
	           			  this.autores.toString()+ "\n";
	}
}
