package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingJava8 {

	public static void main(String[] args) {
		Student st1 = new Student(10, "abc");
		Student st2 = new Student(16, "kdf");
		Student st3 = new Student(20, "dfe");
		Student st4 = new Student(17, "cgh");
		Student st5 = new Student(21, "ijk");
		List<Student> students = new ArrayList<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		
		Collections.sort(students, (s1,s2) -> s1.getName().compareTo(s2.getName()));
		
		System.out.println(students);
		
		Collections.sort(students, (s1, s2) -> s1.getMark()-s2.getMark());
		
		System.out.println(students);

	}

}
