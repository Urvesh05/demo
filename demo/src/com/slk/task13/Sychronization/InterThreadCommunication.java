package com.slk.task13.Sychronization;


class Customer
{
	int amount =10000;
	
	
	//withdraw
	synchronized void withdraw(int amount)
	{
		System.out.println("Available Balance = "+this.amount+"\n");
		System.out.println("Withdraw Amount   = "+amount);
		
		if(this.amount<amount)
		{
			System.out.println("Insufficient Balance waiting for deposit \n");
			
			try {
				wait();
				
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		this.amount -=amount;
		System.out.println("Delected Amount = "+ amount);
		System.out.println("Saving Balance amount = "+this.amount);
		
		
	}
	
	
	//Deposit
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit = "+amount);
		this.amount+=amount;
		
		System.out.println("Total Avialable amount "+this.amount);
		
		System.out.println("Transaction Complet \n");
		
		
		notify();
	}
	
}




public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			final Customer c = new Customer();
			
			//withdraw amount 
			Thread t = new Thread()
					{
						@Override
						public void run() {
							// TODO Auto-generated method stub
							c.withdraw(15000);
						}
					};
					t.start();
					

					//Deposit amount 
					Thread t2 = new Thread()
							{
								@Override
								public void run() {
									// TODO Auto-generated method stub
									c.deposit(10000);
								}
							};
							t2.start();
								/*
							//Deposit amount 
							Thread t3 = new Thread()
									{
										@Override
										public void run() {
											// TODO Auto-generated method stub
											c.deposit(10000);
										}
									};
									t3.start();	
									*/		
	}

}
