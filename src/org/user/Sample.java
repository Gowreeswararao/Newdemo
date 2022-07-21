package org.user;

import java.util.LinkedHashSet;
import java.util.Set;

//import java.util.ArrayList;
//import java.util.List;

public class Sample {
	
	public static void main(String[] args) {
		
	Employee e1=new Employee(10,"gowrees",9553224342l);
	
	Employee e2=new Employee(20,"gowreesh",9443224342l);

	Employee e3=new Employee(30,"eswar",9663224342l);
	
	Set <Employee> li=new LinkedHashSet<Employee>();
	//add list
	li.add(e1);
	li.add(e2);
	li.add(e3);
	//fetch 2nd epl inf
	//Employee emp = li.get(1);
	
	//System.out.println("id is"+emp.getId());
	//System.out.println("Name is"+emp.getName());
	//System.out.println("phone is"+emp.getPhone());
	
	System.out.println("print all value from list");
	
//	for(int i=0;i<li.size();i++) {
	for(Employee e:li) {	
		//Employee e = li.get(i);
		System.out.println("id is"+e.getId());
		System.out.println("Name is"+e.getName());
		System.out.println("phone is"+e.getPhone());

		
	
	}
}
}
