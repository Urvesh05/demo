package Sorting_Prectice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingMultipaleAttribute_Main {
	
	
	public static void sortEmployee()
	{
		
		List<Employee> listEmployees= new ArrayList<Employee>();
        listEmployees.add(new Employee("Hari", "Developer", 45, 80000));
        listEmployees.add(new Employee("Sanjay", "Designer", 30, 75000));
        listEmployees.add(new Employee("Bomit", "Designer", 45, 134000));
        listEmployees.add(new Employee("Patli", "Programmer", 25, 60000));
       
        listEmployees.add(new Employee("Pratik", "Developer", 35, 14000));
        listEmployees.add(new Employee("Avi", "Programmer", 35, 80000));
        listEmployees.add(new Employee("Daval", "Developer", 35, 99000));
      
 
		
		
        System.out.println("*** Before sorting:");
        
        for (Employee emp : listEmployees) 
        {
            System.out.println(emp);
        }
        
       
        Collections.sort(listEmployees,new EmployeeChainedComparator(new EmployeeJobTitleComparator(),
        		new EmployeeSalaryComparator(),new AgeComparetor()));
        
        System.out.println("\n*** After sorting:");
        
        for (Employee emp : listEmployees) {
            System.out.println(emp);
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortingMultipaleAttribute_Main.sortEmployee();

	}

}
