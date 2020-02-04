package com.slk.task12.Multitheading;

import java.util.Date; 
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//https://www.geeksforgeeks.org/thread-pools-java/
public class ThreadPool14_2 implements Runnable    
{ 
    private String name; 
      
    public ThreadPool14_2(String s) 
    { 
        name = s; 
    }
    
    public void run() 
    { 
        try
        { 
            for (int i = 0; i<=5; i++) 
            { 
                if (i==0) 
                { 

                	Date d = new Date(); 
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
                    System.out.println("Initialization Time for"
                            + " task name - "+ name +" = " +ft.format(d));    
                    //prints the initialization time for every task  
                } 
                else
                { 
                    Date d = new Date(); 
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
                    System.out.println("Executing Time for task name - "+ 
                            name +" = " +ft.format(d));    
                    // prints the execution time for every task  
                } 
                Thread.sleep(1000); 
            } 
            System.out.println(name+" complete"); 
        } 
        
        
        catch(InterruptedException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
      
    // Prints task name and sleeps for 1s 
    // This Whole process is repeated 5 times 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Maximum number of threads in thread pool 
	    final int MAX_T = 3;   
	 
	        // creates five tasks 
	        Runnable r1 = new ThreadPool14_2("task 1"); 
	        Runnable r2 = new ThreadPool14_2("task 2"); 
	        Runnable r3 = new ThreadPool14_2("task 3"); 
	        Runnable r4 = new ThreadPool14_2("task 4"); 
	        Runnable r5 = new ThreadPool14_2("task 5");       
	          
	        // creates a thread pool with MAX_T no. of  
	        // threads as the fixed pool size(Step 2) 
	        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);   
	         
	        // passes the Task objects to the pool to execute (Step 3) 
	        pool.execute(r1); 
	        pool.execute(r2); 
	        pool.execute(r3); 
	        pool.execute(r4); 
	        pool.execute(r5);  
	          
	        // pool shutdown ( Step 4) 
	        pool.shutdown();     
	    
	}

}
