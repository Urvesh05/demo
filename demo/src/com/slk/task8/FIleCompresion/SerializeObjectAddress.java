package com.slk.task8.FIleCompresion;

import java.io.Serializable;

public class SerializeObjectAddress implements Serializable
{

	String s ;
	int id;
	


	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "SerializeObjectAddress [s=" + s + ", id=" + id + "]";
	}
	
	
	
}
