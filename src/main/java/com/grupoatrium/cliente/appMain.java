package com.grupoatrium.cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.grupoatrium.modelo.Libro;
import com.grupoatrium.persistencia.impl.ConnectionMgr;

public class appMain {

    public static void main(String[] args) {
        // Generar el contenedor de beans indicando el archivo xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      
        //Crea el contenedor de beans de la clase Libro
        System.out.println(context.getBean("libro", Libro.class));
        
                 
        // Crea el contenedor de beans de la clase ConnectionMgr
        System.out.println(context.getBean("connectionMgr",ConnectionMgr.class));
     
     	     	
        //Clases que heredan del bean abstracto ConnectionMgr
    	System.out.println(context.getBean("librosDAO"));
    	System.out.println(context.getBean("editorialesDAO"));
    	
           
    }

}