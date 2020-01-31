package com.slk.task7.Serialization;

import java.io.Serializable;

public class Demo implements Serializable{
	
	String s;
	int i;
	
	Demo(String s,int i)
	{
		this.s=s;
		this.i=i;
		
	}
	

	public String getS() {
		return s;
	}


	public String setS(String s) {
		return this.s = s;
		
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}

//	@Override
//	public String toString() {
//		return "Serialization Data [Name= " + s + ", Id =" + i + "]";
//	}
//

}
