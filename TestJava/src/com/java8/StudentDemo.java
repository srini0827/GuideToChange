package com.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		Student st1 = new Student(10, "test1");
		Student st2 = new Student(10, "test1");
		Student st3 = new Student(16, "test3");
		Student st4 = new Student(17, "test4");
		Student st5 = new Student(20, "test5");
		
		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(st1);
		hashSet.add(st2);
		
		System.out.println(hashSet.toString());
		List<Student> students = new ArrayList<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		students.add(null);
		
		students.stream().filter(s -> s != null && s.getMark() > 15).forEach(st -> System.out.println(st.getName()));

	}

}
