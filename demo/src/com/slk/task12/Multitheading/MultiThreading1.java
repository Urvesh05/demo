package com.slk.task12.Multitheading;

public class MultiThreading1 implements Runnable {

String name;

Thread t;

MultiThreading1 (String thread)
{
	//https://www.edureka.co/blog/java-thread/
    name = threadname; 

    t = new Thread(this, name);

System.out.println("New thread: " + t);

t.start();

}

public void run() {

 try {

     for(int i = 5; i > 0; i--) {

     System.out.println(name + ": " + i);

      Thread.sleep(1000);

}

}catch (InterruptedException e) {

     System.out.println(name + "Interrupted");

}

     System.out.println(name + " exiting.");

}

}

class MultiThread {

public static void main(String args[]) {

     new MultiThreading1("One");

     new MultiThreading1("Two");

     new MultiThreading1("Three");

try {

     Thread.sleep(10000);

} catch (InterruptedException e) {

      System.out.println("Main thread Interrupted");

}

      System.out.println("Main thread exiting.");

      }

}
	
	/*
	 private Thread t;
	   private String threadName;
	   
	   MultiThreading1( String name)
	   {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   
	   public void run() 
	   {
		      System.out.println("Running " +  threadName );
		      try {
		         for(int i = 4; i > 0; i--) {
		            System.out.println("Thread: " + threadName + ", " + i);
		            // Let the thread sleep for a while.
		            Thread.sleep(50);
		         }
		      } catch (InterruptedException e) {
		         System.out.println("Thread " +  threadName + " interrupted.");
		      }
		      System.out.println("Thread " +  threadName + " exiting.");
		   }
	   
	   			public void start ()
	   			{
	   				System.out.println("Starting " +  threadName );
	   				if (t == null) 
	   				{
	   					t = new Thread (this, threadName);
	   					t.start ();
	   				}
	   			}
	   			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MultiThreading1 R1 = new MultiThreading1( "Thread-1");
	      R1.start();
	      
	      MultiThreading1 R2 = new MultiThreading1( "Thread-2");
	      R2.start();
	}


}
*/
