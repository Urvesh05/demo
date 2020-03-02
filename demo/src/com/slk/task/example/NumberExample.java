package com.slk.task.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberExample  extends Thread{

	
	public  void run1() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter line 1 people :=");
		int l1=sc.nextInt();
		
		System.out.print("Enter line 2 people :=");
		int l2=sc.nextInt();
		
		System.out.print("Enter line 3 people :=");
		int l3=sc.nextInt();
		
		System.out.print("Enter line 4 people :=");
		int l4=sc.nextInt();
	
		int totalPeople = l1+l2+l3+l4;
		System.out.println("Totale Number Of People = "+totalPeople);
		
		
	       int i,j,k,l;
		
			//Even Number 
	        if(totalPeople%4==0)
	        {
	        	System.out.println("\nPeople Devide By 4 Line");
	        	
	        	int line1=totalPeople/4;
	 			System.out.println("Line 1 :"+line1);
	 			
	 			int line2=totalPeople/4;
	 			System.out.println("Line 2 :"+line2);
	 				
	 			int line3=totalPeople/4;
	 			System.out.println("Line 3 :"+line3);
	 				
	 			int line4=totalPeople/4;
	 			System.out.println("Line 4 :"+line4);
	 			
	 			System.out.println("\nLine 1 People Tickit Collected..");
	 			
	 			for(i=1;i<=line1;i++)
	 			{
	 				try 
	 				{
	 					Thread.sleep(300);
	 				
		 				System.out.print(i);
		 				
		 				List<Integer> array = new ArrayList<Integer>();
		 				array.add(i);
		 				
		 				for(int counter=1; counter<=array.size(); counter++)
		 				{
		 					//System.out.println(counter);
		 					
		 				}
		 				array.remove(0);
		 				System.out.println(" People Tickit collect... ");
		 				
	 				}catch(Exception e)
	 				{
	 					e.printStackTrace();
	 				}
	 			}
	 			
	 			
	 			System.out.println("\nLine 2 People Tickit Collected..");
	 			
	 			for(j=1;j<=line2;j++)
	 			{
	 				
	 				try 
	 				{
						
						Thread.sleep(300);
		 				System.out.print(j);
		 				
		 				List<Integer> array = new ArrayList<Integer>();
		 				array.add(j);
		 				
		 				for(int counter=1; counter<=array.size(); counter++)
		 				{
		 					//System.out.println(counter);
		 					
		 				}
		 				array.remove(0);
		 				System.out.println(" People Tickit collect... ");
		 				
	 				}catch(Exception e)
	 				{
	 					e.printStackTrace();
	 				}
	 			}
	 			
	 			
	 			
	 			System.out.println("\nLine 3 People Tickit Collected..");
	 			
	 			for(k=1;k<=line3;k++)
	 			{
	 				
	 				try 
	 				{
						
						Thread.sleep(300);
		 				System.out.print(k);
		 				
		 				List<Integer> array = new ArrayList<Integer>();
		 				array.add(k);
		 				
		 				for(int counter=1; counter<=array.size(); counter++)
		 				{
		 					//System.out.println(counter);
		 					
		 				}
		 				array.remove(0);
		 				System.out.println(" People Tickit collect... ");
		 				
	 				}catch(Exception e)
	 				{
	 					e.printStackTrace();
	 				}
	 			}
	 			
	 			
	 			System.out.println("\nLine 4 People Tickit Collected..");
	 			
	 			for(l=1;l<=line4;l++)
	 			{
	 				
	 				try 
	 				{
						Thread.sleep(300);
		 				System.out.print(l);
		 				
		 				List<Integer> array = new ArrayList<Integer>();
		 				array.add(l);
		 				
		 				for(int counter=1; counter<=array.size(); counter++)
		 				{
		 					//System.out.println(counter);
		 					
		 				}
		 				array.remove(0);
		 				System.out.println(" People Tickit collect... ");
		 				
	 				}catch(Exception e)
	 				{
	 					e.printStackTrace();
	 				}
	 			}
	 			System.out.println("\n All line Are Empty...");
	 									
	        }
	        
	        //One People Extra
	        else if(totalPeople%4==1)
			 {
				 System.out.println("remainde "+totalPeople%4);
				 
				 
				 
				 System.out.println("\nPeople Devide By 4 Line ");
		        	
		        	int line1=totalPeople/4+1;
		        	System.out.println("First line 1 People Extra\n");
		 			System.out.println("Line 1 :"+line1);
		 			
		 			int line2=totalPeople/4;
		 			System.out.println("Line 2 :"+line2);
		 				
		 			int line3=totalPeople/4;
		 			System.out.println("Line 3 :"+line3);
		 				
		 			int line4=totalPeople/4;
		 			System.out.println("Line 4 :"+line4);
		 			
		 			
		 			System.out.println("\nLine 1 People Tickit Collected..");
		 			
		 			for(i=1;i<=line1;i++)
		 			{
		 				try 
		 				{
		 					Thread.sleep(300);
		 				
			 				System.out.print(i);
			 				
			 				List<Integer> array = new ArrayList<Integer>();
			 				array.add(i);
			 				
			 				for(int counter=1; counter<=array.size(); counter++)
			 				{
			 					//System.out.println(counter);
			 					
			 				}
			 				array.remove(0);
			 				System.out.println(" People Tickit collect... ");
			 				
		 				}catch(Exception e)
		 				{
		 					e.printStackTrace();
		 				}
		 			}
		 			
		 			
		 			System.out.println("\nLine 2 People Tickit Collected..");
		 			
		 			for(j=1;j<=line2;j++)
		 			{
		 				try 
		 				{
		 					Thread.sleep(300);
		 				
			 				System.out.print(j);
			 				
			 				List<Integer> array = new ArrayList<Integer>();
			 				array.add(j);
			 				
			 				for(int counter=1; counter<=array.size(); counter++)
			 				{
			 					//System.out.println(counter);
			 					
			 				}
			 				array.remove(0);
			 				System.out.println(" People Tickit collect... ");
			 				
		 				}catch(Exception e)
		 				{
		 					e.printStackTrace();
		 				}
		 			}
		 			
		 			
		 			System.out.println("\nLine 3 People Tickit Collected..");
		 			
		 			for(k=1;k<=line3;k++)
		 			{
		 				try 
		 				{
		 					Thread.sleep(300);
		 				
			 				System.out.print(k);
			 				
			 				List<Integer> array = new ArrayList<Integer>();
			 				array.add(k);
			 				
			 				for(int counter=1; counter<=array.size(); counter++)
			 				{
			 					//System.out.println(counter);
			 					
			 				}
			 				array.remove(0);
			 				System.out.println(" People Tickit collect... ");
			 				
		 				}catch(Exception e)
		 				{
		 					e.printStackTrace();
		 				}
		 			}
		 			
		 			System.out.println("\nLine 4 People Tickit Collected..");
		 			
		 			for(l=1;l<=line4;l++)
		 			{
		 				try 
		 				{
		 					Thread.sleep(300);
		 				
			 				System.out.print(l);
			 				
			 				List<Integer> array = new ArrayList<Integer>();
			 				array.add(l);
			 				
			 				for(int counter=1; counter<=array.size(); counter++)
			 				{
			 					//System.out.println(counter);
			 					
			 				}
			 				array.remove(0);
			 				System.out.println(" People Tickit collect... ");
			 				
		 				}catch(Exception e)
		 				{
		 					e.printStackTrace();
		 				}
		 			}
		 		
		 			
		 			System.out.println("\nAll Line Are Empty..");
		        }
			 
	        
	        
	        else if(totalPeople%4==2)
	        {
	        	 System.out.println("remainde "+totalPeople%4); 
		        	
				 System.out.println("\nPeople Devide By 4 Line ");
		        	
		        	int line1=totalPeople/4+1;
		        	System.out.println("2 People Extra\n");
		 			System.out.println("Line 1 :"+line1);
		 			
		 			int line2=totalPeople/4+1;
		 			System.out.println("Line 2 :"+line2);
		 				
		 			int line3=totalPeople/4;
		 			System.out.println("Line 3 :"+line3);
		 				
		 			int line4=totalPeople/4;
		 			System.out.println("Line 4 :"+line4);
		 			
		 			
		 			System.out.println("\nLine 1 People Tickit Collected..");
		 			
		 			for(i=1;i<=line1;i++)
		 			{
		 				try 
		 				{
		 					Thread.sleep(300);
		 				
			 				System.out.print(i);
			 				
			 				List<Integer> array = new ArrayList<Integer>();
			 				array.add(i);
			 				
			 				for(int counter=1; counter<=array.size(); counter++)
			 				{
			 					//System.out.println(counter);
			 					
			 				}
			 				array.remove(0);
			 				System.out.println(" People Tickit collect... ");
			 				
		 				}catch(Exception e)
		 				{
		 					e.printStackTrace();
		 				}
		 			}
		 			
		 			
		 			System.out.println("\nLine 2 People Tickit Collected..");
		 			
		 			for(j=1;j<=line2;j++)
		 			{
		 				try 
		 				{
		 					Thread.sleep(300);
		 				
			 				System.out.print(j);
			 				
			 				List<Integer> array = new ArrayList<Integer>();
			 				array.add(j);
			 				
			 				for(int counter=1; counter<=array.size(); counter++)
			 				{
			 					//System.out.println(counter);
			 					
			 				}
			 				array.remove(0);
			 				System.out.println(" People Tickit collect... ");
			 				
		 				}catch(Exception e)
		 				{
		 					e.printStackTrace();
		 				}
		 			}
		 			
		 			
		 			System.out.println("\nLine 3 People Tickit Collected..");
		 			
		 			for(k=1;k<=line3;k++)
		 			{
		 				try 
		 				{
		 					Thread.sleep(300);
		 				
			 				System.out.print(k);
			 				
			 				List<Integer> array = new ArrayList<Integer>();
			 				array.add(k);
			 				
			 				for(int counter=1; counter<=array.size(); counter++)
			 				{
			 					//System.out.println(counter);
			 					
			 				}
			 				array.remove(0);
			 				System.out.println(" People Tickit collect... ");
			 				
		 				}catch(Exception e)
		 				{
		 					e.printStackTrace();
		 				}
		 			}
		 			
		 			System.out.println("\nLine 4 People Tickit Collected..");
		 			
		 			for(l=1;l<=line4;l++)
		 			{
		 				try 
		 				{
		 					Thread.sleep(300);
		 				
			 				System.out.print(l);
			 				
			 				List<Integer> array = new ArrayList<Integer>();
			 				array.add(l);
			 				
			 				for(int counter=1; counter<=array.size(); counter++)
			 				{
			 					//System.out.println(counter);
			 					
			 				}
			 				array.remove(0);
			 				System.out.println(" People Tickit collect... ");
			 				
		 				}catch(Exception e)
		 				{
		 					e.printStackTrace();
		 				}
		 			}
		 			
	        }
	        
	        
	        else if(totalPeople%4==3)
	        {
	        	 System.out.println("remainde "+totalPeople%4); 
	        	
				 System.out.println("\nPeople Devide By 4 Line ");
		        	
		        	int line1=totalPeople/4+1;
		        	System.out.println("3 People Extra \n");
		 			System.out.println("Line 1 :"+line1);
		 			
		 			//System.out.println("Second line 1 People Extra");
		 			int line2=totalPeople/4+1;
		 			System.out.println("Line 2 :"+line2);
		 				
		 			//System.out.println("Third line 1 People Extra");
		 			int line3=totalPeople/4+1;
		 			System.out.println("Line 3 :"+line3);
		 				
		 			int line4=totalPeople/4;
		 			System.out.println("Line 4 :"+line4);
		 			
		 			
		 			System.out.println("\nLine 1 People Tickit Collected..");
		 			
		 			for(i=1;i<=line1;i++)
		 			{
		 				try 
		 				{
		 					Thread.sleep(300);
		 				
			 				System.out.print(i);
			 				
			 				List<Integer> array = new ArrayList<Integer>();
			 				array.add(i);
			 				
			 				for(int counter=1; counter<=array.size(); counter++)
			 				{
			 					//System.out.println(counter);
			 					
			 				}
			 				array.remove(0);
			 				System.out.println(" People Tickit collect... ");
			 				
		 				}catch(Exception e)
		 				{
		 					e.printStackTrace();
		 				}
		 			}
		 			
		 			
		 			System.out.println("\nLine 2 People Tickit Collected..");
		 			
		 			for(j=1;j<=line2;j++)
		 			{
		 				try 
		 				{
		 					Thread.sleep(300);
		 				
			 				System.out.print(j);
			 				
			 				List<Integer> array = new ArrayList<Integer>();
			 				array.add(j);
			 				
			 				for(int counter=1; counter<=array.size(); counter++)
			 				{
			 					//System.out.println(counter);
			 					
			 				}
			 				array.remove(0);
			 				System.out.println(" People Tickit collect... ");
			 				
		 				}catch(Exception e)
		 				{
		 					e.printStackTrace();
		 				}
		 			}
		 			
		 			
		 			System.out.println("\nLine 3 People Tickit Collected..");
		 			
		 			for(k=1;k<=line3;k++)
		 			{
		 				try 
		 				{
		 					Thread.sleep(300);
		 				
			 				System.out.print(k);
			 				
			 				List<Integer> array = new ArrayList<Integer>();
			 				array.add(k);
			 				
			 				for(int counter=1; counter<=array.size(); counter++)
			 				{
			 					//System.out.println(counter);
			 					
			 				}
			 				array.remove(0);
			 				System.out.println(" People Tickit collect... ");
			 				
		 				}catch(Exception e)
		 				{
		 					e.printStackTrace();
		 				}
		 			}
		 			
		 			System.out.println("\nLine 4 People Tickit Collected..");
		 			
		 			for(l=1;l<=line4;l++)
		 			{
		 				try 
		 				{
		 					Thread.sleep(300);
		 				
			 				System.out.print(l);
			 				
			 				List<Integer> array = new ArrayList<Integer>();
			 				array.add(l);
			 				
			 				for(int counter=1; counter<=array.size(); counter++)
			 				{
			 					//System.out.println(counter);
			 					
			 				}
			 				array.remove(0);
			 				System.out.println(" People Tickit collect... ");
			 				
		 				}catch(Exception e)
		 				{
		 					e.printStackTrace();
		 				}
		 			}
		 		
		 			System.out.println("\nAll Line Are Empty..");
	        }
	}
	
	
	
	
	
	
	
	//Practice  Example 2
	public  void run11() 
	{
		
		int i,j;
		
		int number1=2;
		int number2=2 ;
		
		
		int total=number1+number2;
		System.out.println("total number = "+total);
		
		//Check number 
	
		if(total%2==0)
		{
			System.out.println("Even Number ");
			
			int line1=total/2;
			int line2=total/2;
			
			System.out.println("line 1 = "+line1);
			System.out.println("line 2 = "+line2);
			
			//check elements  lime 1 
			System.out.println("\nLine 1 elements = ");
			
			for( i=1;i<=line1;i++)
			{
				
				try 
				{
					Thread.sleep(1000);
								
					System.out.print(i);
	
					ArrayList<Integer>arr1= new ArrayList<Integer>();
					arr1.add(i);
					//System.out.println(arr);
					
					 
					 for (int counter = 1; counter <= arr1.size(); counter++)
					 { 		      
				         // System.out.println(arr.get(counter)); 
						 
						 if(arr1!=null)
						 {
							arr1.remove(0); 
							System.out.println(" Remove Elements ");
						 }
						 
				     } 	
				
				
				} catch (Exception e) 
				{	
					e.printStackTrace();
				}
			}
			
				System.out.println("\nLine 1 Is Empty ...");
				
				
			
			//line 2
			
			System.out.println("\nLine 2");
			for(j=1;j<=line1;j++)
			{
				

				try 
				{
					Thread.sleep(1000);
					
					System.out.print(j);
				
					ArrayList<Integer>arr1= new ArrayList<Integer>();
					arr1.add(j);
					//System.out.println(arr);
					
					 
					 for (int counter = 1; counter <=arr1.size(); counter++)
					 { 		      
				         // System.out.println(arr.get(counter)); 
						 
						 if(arr1!=null)
						 {
							arr1.remove(0); 
							System.out.println(" Remove Elements ");
						 }
						 
				     } 		
				
				} catch (Exception e) 
				{
		
					e.printStackTrace();
				}
				
			} 
				System.out.println("\nLine 2 Is Empty ..");
		
		}
		
	
		
		//Odd Number 
		else
			
		{
			System.out.println("Odd Number \n");
			int line1=total/2+1;//odd number is +1
			
			int line2=total/2;
			System.out.println("Line 1 = "+line1);
			System.out.println("line 2 = "+line2);
			
			
			//check elements  lime 1 
			System.out.println("\nLine 1 elements = ");
			
			for( i=1;i<=line1;i++)
			{
				try 
				{
					Thread.sleep(1000);
					System.out.print(i);
				
	
					ArrayList<Integer>arr1= new ArrayList<Integer>();
					arr1.add(i);
					//System.out.println(arr);
					
					 
					 for (int counter = 1; counter <=arr1.size(); counter++)
					 { 		      
				         // System.out.println(arr.get(counter)); 
						 
						 if(arr1!=null)
						 {
							arr1.remove(0); 
							System.out.println(" Remove Elements ");
						 }
						 
				     } 	
				}
				catch(Exception e) 
				{
					e.printStackTrace();
				}
				
			}
				
			System.out.println("\nLine 1 Is Empty ...");
			
	
			//line 2
			
			System.out.println("\n\nLine 2 elements = ");
			for( j=1;j<=line2;j++)
			{
				try
				{
					Thread.sleep(1000);
					System.out.print(j);
					
					ArrayList<Integer>arr1= new ArrayList<Integer>();
					arr1.add(j);
					//System.out.println(arr);
					
					 
					 for (int counter = 1; counter <=arr1.size(); counter++)
					 { 		      
				         // System.out.println(arr.get(counter)); 
						 
						 if(arr1!=null)
						 {
							arr1.remove(0); 
							System.out.println(" Remove Elements ");
						 }
					 
					 } 	
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			System.out.println("\nLine 2 Is Empty ...");
			
		}
		
		
		System.out.println("\nLine 1 Remove Elements One by one ..");
		
		System.out.println("\nLine 2 Remove Elements One by one ..");
	}
	
	
	//Example 3
	public void run() {
		
		
		int i,j;
		int a=11;
		
		if(a%2==0)
		{
			
			System.out.println("even");
			int b= a/2;
			int c= a/2;
			
			System.out.println("Line 1 ="+b);
			System.out.println("Line 2 ="+c);
			
			for(i=1;i<=b;i++)
			{
				//System.out.println(i);
				
				try
				{

					System.out.println("task 1");
	
					Thread.sleep(1000);
				
					
					List< Integer> list = new ArrayList<Integer>();
					list.add(i);
					
					for(int counter=1; counter<=list.size(); counter++)
					{
						//System.out.println();
					}
					
					System.out.println("Line 1 Remove Elemetnts = "+list.remove(0));
					
				} catch (InterruptedException e) 
				{
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
			
			}
		}
		
		
		
		else
		{
			System.out.println("odd");
			
		
			int b= a/2;
			int c= a/2;
			
			System.out.println("Line 1 = "+b);
			System.out.println("Line 2 = "+c);
			
			
			System.out.println("Line 1...");
			for(i=1;i<=b;i++)
			{
				//System.out.println(i);
				
				try 
				{

					System.out.println("task 1");
		
					Thread.sleep(1000);
					
					List< Integer> list = new ArrayList<Integer>();
					list.add(i);
					
					for(int counter=1; counter<=list.size(); counter++)
					{
						//System.out.println();
					}
					
					System.out.println("Line 2 Remove Elemetnts = "+list.remove(0));
			}
			 catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			}
		}
			
			
			int b= a/2;
			int c= a/2;
			
			System.out.println("Line 1 = "+b);
			System.out.println("Line 2 = "+c);
			
			for(j=1;j<=c;j++)
			{
				//System.out.println(i);
				
				try 
				{

					System.out.println("task 1");
		
					Thread.sleep(1000);
					
					List< Integer> list = new ArrayList<Integer>();
					list.add(j);
					
					for(int counter=1; counter<=list.size(); counter++)
					{
						//System.out.println();
					}
					
					System.out.println("Line 2 Remove Elemetnts = "+list.remove(0));
			}
			 catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			}
		}
	
	

	public static void main(String[] args) 
	{
		//NumberExample n= new NumberExample();
		//n.start();
		NumberExample n1= new NumberExample();
		n1.start();
		
		
	}

}
