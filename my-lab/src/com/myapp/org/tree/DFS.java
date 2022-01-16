package com.myapp.org.tree;

import java.util.Stack;
import java.util.function.Consumer;

public class DFS {
	
	public static Employee dfs(Employee emp ,int empId) {
		Employee employee=null;
		Stack<Employee> stack=new Stack<Employee>();
	    stack.push(emp);
	    while(!stack.isEmpty()) {
	    	Employee e=stack.pop();
	    	if(e.getEmpId()==empId) {
	    		return e;
	    	}else {
	    		if(e.getSubordinates()!=null) {
	    			stack.addAll(e.subordinates);
	    		}
	    	}
	    } 
		return employee;
		
	}
	
	public static Employee dfsWithRec(Employee emp ,int empId) {
		
		//System.out.println(emp.getEmpId());
		Employee emp2=null;
		if(emp.getEmpId()==empId)return emp;
		if(emp.getSubordinates()!=null) {
			for(Employee e1:emp.getSubordinates()) {
				emp2=dfsWithRec(e1,empId);
				if(emp2!=null) {
					break;
	        	}
			}
		}
		return emp2;	
	}
	
	public static int dfsSumWithRec(Employee emp) {
		int sum=0;
	    if (emp!=null) sum=sum+emp.getImportance();
	    if(emp.getSubordinates()!=null) {
	    	for (Employee e1:emp.getSubordinates()) {
	    		sum=sum+dfsSum(e1);
	    	}
	    }
		return sum;
	}
	
	
	public static int dfsSum(Employee emp) {
		int sum=0;
		Stack<Employee> stack=new Stack<Employee>();
		stack.push(emp);
		while(!stack.isEmpty()) {
			Employee e1=stack.pop();
			sum=sum+e1.getImportance();
			if(e1.getSubordinates()!=null) {
				stack.addAll(e1.getSubordinates());
			}
		}
		return sum;
	}

}
