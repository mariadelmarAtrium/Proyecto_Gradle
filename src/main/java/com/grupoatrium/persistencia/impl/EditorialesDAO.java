package com.grupoatrium.persistencia.impl;

import org.springframework.stereotype.Component;

import com.grupoatrium.persistencia.impl.ConnectionMgr;


@Component("EditorialesDAO")
public class EditorialesDAO {
	private ConnectionMgr connMgr;

	public ConnectionMgr getConnMgr() {
		return connMgr;
	}

	public void setConnMgr(ConnectionMgr connMgr) {
		this.connMgr = connMgr;
	}
	
	public String toString() {
		return "EditorialesDAO =" + this.connMgr.toString() +"\n";
				
	}
	
}
