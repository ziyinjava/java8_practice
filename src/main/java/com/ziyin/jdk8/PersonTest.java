package com.ziyin.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-14:33
 */
public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person("zangsan",20);
		Person person2 = new Person("lisi",26);
		Person person3 = new Person("wangwu",30);
		List<Person> persons = Arrays.asList(person1,person2,person3);

		PersonTest test = new PersonTest();
		List<Person> list = test.getPersonByUserName("zangsan", persons);
		list.forEach(person -> System.out.println(person.getUsername()));
		test.getPersonByAge(25,persons).forEach(person -> System.out.println(person.getAge()));
	}

	public List<Person> getPersonByUserName(String username,List<Person> persons){
		return persons.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
	}

	public List<Person> getPersonByAge(int age,List<Person> persons){
		BiFunction<Integer,List<Person>,List<Person>> biFunction = (Integer ageOfPerson, List<Person> personList) ->
				personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());

		return biFunction.apply(age,persons);
	}

	public List<Person> getPersonByAge2(int age,List<Person> persons,BiFunction<Integer,List<Person>,List<Person>> biFunction){
		return biFunction.apply(age,persons);
	}
}
