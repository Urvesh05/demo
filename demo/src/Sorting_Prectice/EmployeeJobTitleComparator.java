package Sorting_Prectice;

import java.util.Comparator;

public class EmployeeJobTitleComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) 
	{
		// TODO Auto-generated method stub
		
		 return e1.getJobTitle().compareTo(e2.getJobTitle());
	}

}
