package com.grupoatrium.persistencia.impl;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Required;


import com.grupoatrium.persistencia.impl.ConnectionMgr;

//@Component("librosDAO")
public class LibrosDAO extends ConnectionMgr {
	

	private ConnectionMgr connMgr;
	

	public ConnectionMgr getConnMgr() {
		return connMgr;
	}
	
	
	//@Required
	public void setConnMgr(ConnectionMgr connMgr) {
		this.connMgr = connMgr;
	}
	public String toString() {
		return "LibrosDAO =" + this.connMgr.toString() +"\n";
	}
}
