package com.comparator;

import java.util.Arrays;

public class ComparatorMain {

	public static void main(String[] args) {
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);

		//sort employees array using Comparator by Salary
		Arrays.sort(empArr, Employee.salaryComparator);
		System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));

		//sort employees array using Comparator by Age
		Arrays.sort(empArr, Employee.ageComparator);
		System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));

		//sort employees array using Comparator by Name
		Arrays.sort(empArr, Employee.nameComparator);
		System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));

	}

}
