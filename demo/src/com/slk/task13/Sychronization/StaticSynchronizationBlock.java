package com.slk.task13.Sychronization;


//static synchronized 
class StaticBlock
{
 	 synchronized static void test(int n)
	{
		for (int i = 0; i < 10; i++) {
			
			System.out.println(n*i);
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Static1 extends Thread
{
	public Static1(StaticBlock st) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		StaticBlock.test(4);//class name.method name to call method
	}
}



class Static2 extends Thread
{
	public Static2(StaticBlock st) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		StaticBlock.test(8);
	}
}


public class StaticSynchronizationBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("StaticSynchronizationBlock  ");
		
		StaticBlock st = new StaticBlock();
		
		Static1 t = new Static1(st);
		Static2 t2 = new Static2(st);
		
		
		t.start();
		t2.start();

	}

}
