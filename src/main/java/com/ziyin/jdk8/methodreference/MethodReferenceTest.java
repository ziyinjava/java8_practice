package com.ziyin.jdk8.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-22:27
 */
public class MethodReferenceTest {

	public String getString(Supplier<String> supplier) {
		return supplier.get() + "test";
	}

	public String getString2(String str,Function<String,String> function) {
		return function.apply(str);
	}
	public static void main(String[] args) {
		Student student1 = new Student("zhangsan",10);;
		Student student2 = new Student("lisi",90);
		Student student3 = new Student("wangwu",50);
		Student student4 = new Student("zhaoliu",40);
		List<Student> students = Arrays.asList(student1,student2,student3,student4);
//		students.sort((studentParam1,studentParam2) -> Student.compareStudentByScore(studentParam1,studentParam2));
//		students.forEach(student -> System.out.println(student.getScore()));

		System.out.println("======================================================================");

		//类::静态方法
//		students.sort(Student::compareStudentByScore);
//		students.forEach(student -> System.out.println(student.getScore()));


		//对象::实例方法
//		StudentComparator studentComparator = new StudentComparator();
//		students.sort(studentComparator::compareStudentByScore);

		students.sort(Student::compareByScore);
		students.forEach(student -> System.out.println(student.getScore()));


		List<String> cities = Arrays.asList("qingdao","chongqing","tianjin","beijing");

		Collections.sort(cities,String::compareToIgnoreCase);
		cities.forEach(System.out::println);


		MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
		System.out.println(methodReferenceTest.getString(String::new));

		System.out.println(methodReferenceTest.getString2("test",String::new));
	}
}
