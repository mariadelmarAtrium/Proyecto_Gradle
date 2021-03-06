package com.grupoatrium.persistencia.impl;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;


//@Component
public class ConnectionMgr {
		
	private String driver;
	private String url;
	private String usuario;
	private String password;
		
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//	@Override
	public String toString() {
		return "ConnectionMgr [driver=" + driver +
				", url=" + url + 
				", user=" + usuario+
				", password=" + password + "]"+"\n";
	}
}
