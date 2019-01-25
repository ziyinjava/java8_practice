package com.ziyin.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author ziyin
 @create 2019-01-2019/1/20-21:18
 Optional 没有实现序列化接口不要定义为实例变量和方法参数
 */
public class OptionTest2 {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setName("zhangsan");
		Employee employee2  = new Employee();
		employee2.setName("lisi");
		Company company = new Company();
		company.setName("company1");
		List<Employee> employees = Arrays.asList(employee1,employee2);
		company.setEmployees(employees);

		Optional<Company> optional = Optional.ofNullable(company);
		System.out.println(optional.map(theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList()));
	}
}
