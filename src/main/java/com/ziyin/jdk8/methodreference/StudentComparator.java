package com.ziyin.jdk8.methodreference;

/**
 * @author ziyin
 @create 2019-01-2019/1/21-8:20
 */
public class StudentComparator {
	public  int compareStudentByScore(Student student1,Student student2){
		return student1.getScore() - student2.getScore();
	}
	public  int compareStudentByName(Student student1,Student student2){
		return student1.getName().compareToIgnoreCase(student2.getName());
	}

}
