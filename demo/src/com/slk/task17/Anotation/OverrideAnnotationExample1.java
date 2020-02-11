package com.slk.task17.Anotation;

public class OverrideAnnotationExample1 {
	
	
    public void Display()
    {
        System.out.println("Base display()");
    } 
    
   
}

class Derived extends OverrideAnnotationExample1
{
    @Override
    public void Display()
    {
        System.out.println("Derived display()");
    }
    
    public static void main(String args[])
    {
    	OverrideAnnotationExample1 t1 = new Derived();//Parent class reference and child class object 
        t1.Display();
    }    
}
