package com.exception;

import javax.net.ssl.SSLEngineResult.Status;

public class FinallyBlock {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				int num;
				num= 100/2;
				System.out.println("Ans = "+num);
				
				System.out.println("This is a try Block ");
				
				System.exit(1);//The finally block will not be executed if program exits
			
			}catch (Exception e) {
				System.out.println(e);
			}
				
			finally {
				
				System.out.println("finally executed");
			}

	}

}
