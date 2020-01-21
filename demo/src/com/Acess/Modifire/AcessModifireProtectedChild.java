package com.Acess.Modifire;
import com.slk.task.opps.*;

public class AcessModifireProtectedChild extends AcessModifireProtected {
	
	
	protected void msg() {
		
		System.out.println("protected parent class");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		
		AcessModifireProtected acessModifireProtectedChild = new AcessModifireProtectedChild();
		acessModifireProtectedChild.msg();
		
		AcessModifireProtected acessModifireProtected = new AcessModifireProtected();
		acessModifireProtected.msg();
		
//		AcessModifireProtectedChild a1= new AcessModifireProtectedChild();
//		a1.msg();

	}

}
