package com.org.task;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
	public static void main(String[] args) {
		// Create a Map to store employee details
		Map<Integer, Employee> employeeMap = new HashMap<>();

		// Create and add 15 employees using setters
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setName("malik");
		e1.setPhone("1234567890");
		e1.setAddress("123 Main St");
		e1.setDob("1990-01-01");
		e1.setDoj("2020-01-01");
		e1.seteMail("john.doe@example.com");
		e1.setGender("Male");
		e1.setSal(60000);
		employeeMap.put(e1.getEmpId(), e1);

		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setName("ismail");
		e2.setPhone("1234567891");
		e2.setAddress("456 Elm St");
		e2.setDob("1989-02-02");
		e2.setDoj("2019-02-02");
		e2.seteMail("jane.smith@example.com");
		e2.setGender("Female");
		e2.setSal(62000);
		employeeMap.put(e2.getEmpId(), e2);

		Employee e3 = new Employee();
		e3.setEmpId(3);
		e3.setName("basil");
		e3.setPhone("1234567892");
		e3.setAddress("789 Oak St");
		e3.setDob("1991-03-03");
		e3.setDoj("2018-03-03");
		e3.seteMail("jim.brown@example.com");
		e3.setGender("Male");
		e3.setSal(58000);
		employeeMap.put(e3.getEmpId(), e3);

		Employee e4 = new Employee();
		e4.setEmpId(4);
		e4.setName("aadil");
		e4.setPhone("1234567893");
		e4.setAddress("101 Pine St");
		e4.setDob("1992-04-04");
		e4.setDoj("2017-04-04");
		e4.seteMail("jill.white@example.com");
		e4.setGender("Female");
		e4.setSal(61000);
		employeeMap.put(e4.getEmpId(), e4);

		Employee e5 = new Employee();
		e5.setEmpId(5);
		e5.setName("yahya");
		e5.setPhone("1234567894");
		e5.setAddress("202 Birch St");
		e5.setDob("1988-05-05");
		e5.setDoj("2016-05-05");
		e5.seteMail("jack.black@example.com");
		e5.setGender("Male");
		e5.setSal(63000);
		employeeMap.put(e5.getEmpId(), e5);

		Employee e6 = new Employee();
		e6.setEmpId(6);
		e6.setName("suhaib");
		e6.setPhone("1234567895");
		e6.setAddress("303 Cedar St");
		e6.setDob("1993-06-06");
		e6.setDoj("2015-06-06");
		e6.seteMail("jen.green@example.com");
		e6.setGender("Female");
		e6.setSal(64000);
		employeeMap.put(e6.getEmpId(), e6);

		Employee e7 = new Employee();
		e7.setEmpId(7);
		e7.setName("salman");
		e7.setPhone("1234567896");
		e7.setAddress("404 Maple St");
		e7.setDob("1994-07-07");
		e7.setDoj("2014-07-07");
		e7.seteMail("jerry.blue@example.com");
		e7.setGender("Male");
		e7.setSal(65000);
		employeeMap.put(e7.getEmpId(), e7);

		Employee e8 = new Employee();
		e8.setEmpId(8);
		e8.setName("sarfan");
		e8.setPhone("1234567897");
		e8.setAddress("505 Spruce St");
		e8.setDob("1995-08-08");
		e8.setDoj("2013-08-08");
		e8.seteMail("jessica.purple@example.com");
		e8.setGender("Female");
		e8.setSal(66000);
		employeeMap.put(e8.getEmpId(), e8);

		Employee e9 = new Employee();
		e9.setEmpId(9);
		e9.setName("rifadh");
		e9.setPhone("1234567898");
		e9.setAddress("606 Ash St");
		e9.setDob("1996-09-09");
		e9.setDoj("2012-09-09");
		e9.seteMail("jeff.grey@example.com");
		e9.setGender("Male");
		e9.setSal(67000);
		employeeMap.put(e9.getEmpId(), e9);

		Employee e10 = new Employee();
		e10.setEmpId(10);
		e10.setName("prasad");
		e10.setPhone("1234567899");
		e10.setAddress("707 Walnut St");
		e10.setDob("1997-10-10");
		e10.setDoj("2011-10-10");
		e10.seteMail("janet.pink@example.com");
		e10.setGender("Female");
		e10.setSal(68000);
		employeeMap.put(e10.getEmpId(), e10);

		Employee e11 = new Employee();
		e11.setEmpId(11);
		e11.setName("malik j");
		e11.setPhone("1234567800");
		e11.setAddress("808 Chestnut St");
		e11.setDob("1998-11-11");
		e11.setDoj("2010-11-11");
		e11.seteMail("jordan.red@example.com");
		e11.setGender("Male");
		e11.setSal(69000);
		employeeMap.put(e11.getEmpId(), e11);

		Employee e12 = new Employee();
		e12.setEmpId(12);
		e12.setName("fazulu");
		e12.setPhone("1234567801");
		e12.setAddress("909 Willow St");
		e12.setDob("1999-12-12");
		e12.setDoj("2009-12-12");
		e12.seteMail("julia.orange@example.com");
		e12.setGender("Female");
		e12.setSal(70000);
		employeeMap.put(e12.getEmpId(), e12);

		Employee e13 = new Employee();
		e13.setEmpId(13);
		e13.setName("mesham");
		e13.setPhone("1234567802");
		e13.setAddress("1010 Fir St");
		e13.setDob("2000-01-01");
		e13.setDoj("2008-01-01");
		e13.seteMail("jason.yellow@example.com");
		e13.setGender("Male");
		e13.setSal(71000);
		employeeMap.put(e13.getEmpId(), e13);

		Employee e14 = new Employee();
		e14.setEmpId(14);
		e14.setName("Fareed");
		e14.setPhone("1234567803");
		e14.setAddress("1111 Poplar St");
		e14.setDob("2001-02-02");
		e14.setDoj("2007-02-02");
		e14.seteMail("jasmine.silver@example.com");
		e14.setGender("Female");
		e14.setSal(72000);
		employeeMap.put(e14.getEmpId(), e14);

		Employee e15 = new Employee();
		e15.setEmpId(15);
		e15.setName("thameem");
		e15.setPhone("1234567804");
		e15.setAddress("1212 Redwood St");
		e15.setDob("2002-03-03");
		e15.setDoj("2006-03-03");
		e15.seteMail("jeremy.gold@example.com");
		e15.setGender("Male");
		e15.setSal(73000);
		employeeMap.put(e15.getEmpId(), e15);

		// Display the employee details
		for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println("Employee : " + entry.getValue().getEmpId());
			System.out.println(entry.getValue().getName());
			System.out.println(entry.getValue().getGender());
			System.out.println(entry.getValue().geteMail());
			System.out.println(entry.getValue().getDob());
			System.out.println(entry.getValue().getDoj());
			System.out.println(entry.getValue().getPhone());
			System.out.println(entry.getValue().getSal());
			System.out.println(entry.getValue().getAddress());
			System.out.println("-------------------------------------------");
		}
	}
}
