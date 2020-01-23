package Sorting_Prectice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeChainedComparator implements Comparator<Employee>{

	private List<Comparator<Employee>> listComparetor;
	
	//Contractor
	 @SafeVarargs
	public EmployeeChainedComparator(Comparator<Employee>... comparator) 
	 {
		 this.listComparetor=Arrays.asList(comparator);
		// TODO Auto-generated constructor stub
	}
	 
	/*
	  public EmployeeChainedComparator(EmpIdComparetor empIdComparetor,
	 
			NameComparetor nameComparetor,AgeComparetor ageComparetor) 
	{
		// TODO Auto-generated constructor stub
		this.listComparetor=Arrays.asList(empIdComparetor);
		this.listComparetor=Arrays.asList(nameComparetor);
		this.listComparetor=Arrays.asList(ageComparetor);
	}
	*/

	@Override
	public int compare(Employee e1, Employee e2) {
		
		for(Comparator<Employee> com:listComparetor)
		{
			int result =com.compare(e1, e2);
			if(	result !=0)
			{
				return result;
			}
		}
		return 0;
	}

}
