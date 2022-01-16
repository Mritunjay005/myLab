package com.myapp.org.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
	
	public static Employee bfs(Employee e, int empId) {
		Queue<Employee> queue = new LinkedList<Employee>();
		Employee employee = null;
		queue.add(e);
		
		while(!queue.isEmpty()) {
			Employee emp=queue.remove();
			if(emp.getEmpId()==empId) {
				return emp;
			}else {
				if(emp.getSubordinates()!=null)
					queue.addAll(emp.getSubordinates());
			}
		}
		
		
		return employee;
	}
	
	public static int bfsSum(Employee e) {
		Queue<Employee> queue = new LinkedList<Employee>();
		int sum = 0;
		queue.add(e);
		
		while(!queue.isEmpty()) {
			Employee emp=queue.remove();
			sum=sum+emp.getImportance();
			if(emp.getSubordinates()!=null)
				queue.addAll(emp.getSubordinates());	
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		//return null;
		Employee a1=new Employee(1, 3);
		Employee a2=new Employee(2, 4);
		Employee a3=new Employee(3, 5);
		Employee a4=new Employee(4, 6);
		Employee a5=new Employee(5, 7);
		Employee a6=new Employee(6, 8);
		Employee a7=new Employee(7, 9);
		Employee a8=new Employee(8, 10);
		Employee a9=new Employee(9, 11);
		
		List<Employee> sub1=new ArrayList<Employee>();
		List<Employee> sub2=new ArrayList<Employee>();
		List<Employee> sub3=new ArrayList<Employee>();
		List<Employee> sub4=new ArrayList<Employee>();
		
		sub1.add(a2);sub1.add(a3);
		sub2.add(a4);sub2.add(a5);
		sub3.add(a6);sub2.add(a7);
		sub4.add(a8);sub2.add(a9);
		
		a1.setSubordinates(sub1);
		a2.setSubordinates(sub2);
		a3.setSubordinates(sub3);
		a6.setSubordinates(sub4);
		
		System.out.println(bfs(a1,3));
		System.out.println(DFS.dfs(a1,3));
		System.out.println(DFS.dfsWithRec(a1,3));
		
		System.out.println(DFS.dfsSum(DFS.dfsWithRec(a1,3)));
		System.out.println(DFS.dfsSumWithRec(DFS.dfsWithRec(a1,3)));
		
//		Employee emp=bfs(a1,3);
//		int sum=emp.getImportance()+emp.getSubordinates().stream().mapToInt(n->n.getImportance()).sum();
//		
//		System.out.println(sum);
//		
//		System.out.println(bfsSum(bfs(a1,3)));
		
		
	}

}
