package com.org.task;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    public static void main(String[] args) {
        // Create a Map to store student details
        Map<Integer, Student> studentMap = new HashMap<>();

        // Create and add 15 students using setters
        Student s1 = new Student();
        s1.setStdId(1);
        s1.setStdName("aadil");
        s1.setStdPhone("1234567890");
        s1.setAddress("123 Main St");
        s1.setDOB("2000-01-01");
        s1.setEMail("alice.johnson@example.com");
        s1.setGender("Female");
        studentMap.put(s1.getStdId(), s1);

        Student s2 = new Student();
        s2.setStdId(2);
        s2.setStdName("Basil");
        s2.setStdPhone("1234567891");
        s2.setAddress("456 Elm St");
        s2.setDOB("2001-02-02");
        s2.setEMail("bob.smith@example.com");
        s2.setGender("Male");
        studentMap.put(s2.getStdId(), s2);

        // Repeat for the remaining 13 students
        Student s3 = new Student();
        s3.setStdId(3);
        s3.setStdName("malik");
        s3.setStdPhone("1234567892");
        s3.setAddress("789 Oak St");
        s3.setDOB("2002-03-03");
        s3.setEMail("charlie.brown@example.com");
        s3.setGender("Male");
        studentMap.put(s3.getStdId(), s3);

        Student s4 = new Student();
        s4.setStdId(4);
        s4.setStdName("suhaib");
        s4.setStdPhone("1234567893");
        s4.setAddress("101 Pine St");
        s4.setDOB("2003-04-04");
        s4.setEMail("david.white@example.com");
        s4.setGender("Male");
        studentMap.put(s4.getStdId(), s4);

        Student s5 = new Student();
        s5.setStdId(5);
        s5.setStdName("salman");
        s5.setStdPhone("1234567894");
        s5.setAddress("202 Birch St");
        s5.setDOB("2004-05-05");
        s5.setEMail("eve.black@example.com");
        s5.setGender("Female");
        studentMap.put(s5.getStdId(), s5);

        Student s6 = new Student();
        s6.setStdId(6);
        s6.setStdName("yahya");
        s6.setStdPhone("1234567895");
        s6.setAddress("303 Cedar St");
        s6.setDOB("2005-06-06");
        s6.setEMail("frank.green@example.com");
        s6.setGender("Male");
        studentMap.put(s6.getStdId(), s6);

        Student s7 = new Student();
        s7.setStdId(7);
        s7.setStdName("salman");
        s7.setStdPhone("1234567896");
        s7.setAddress("404 Maple St");
        s7.setDOB("2006-07-07");
        s7.setEMail("grace.blue@example.com");
        s7.setGender("Female");
        studentMap.put(s7.getStdId(), s7);

        Student s8 = new Student();
        s8.setStdId(8);
        s8.setStdName("rifath");
        s8.setStdPhone("1234567897");
        s8.setAddress("505 Spruce St");
        s8.setDOB("2007-08-08");
        s8.setEMail("hank.purple@example.com");
        s8.setGender("Male");
        studentMap.put(s8.getStdId(), s8);

        Student s9 = new Student();
        s9.setStdId(9);
        s9.setStdName("thameem");
        s9.setStdPhone("1234567898");
        s9.setAddress("606 Ash St");
        s9.setDOB("2008-09-09");
        s9.setEMail("ivy.grey@example.com");
        s9.setGender("Female");
        studentMap.put(s9.getStdId(), s9);

        Student s10 = new Student();
        s10.setStdId(10);
        s10.setStdName("fazulu");
        s10.setStdPhone("1234567899");
        s10.setAddress("707 Walnut St");
        s10.setDOB("2009-10-10");
        s10.setEMail("jack.pink@example.com");
        s10.setGender("Male");
        studentMap.put(s10.getStdId(), s10);

        Student s11 = new Student();
        s11.setStdId(11);
        s11.setStdName("fareed");
        s11.setStdPhone("1234567800");
        s11.setAddress("808 Chestnut St");
        s11.setDOB("2010-11-11");
        s11.setEMail("kara.red@example.com");
        s11.setGender("Female");
        studentMap.put(s11.getStdId(), s11);

        Student s12 = new Student();
        s12.setStdId(12);
        s12.setStdName("rizwan");
        s12.setStdPhone("1234567801");
        s12.setAddress("909 Willow St");
        s12.setDOB("2011-12-12");
        s12.setEMail("leo.orange@example.com");
        s12.setGender("Male");
        studentMap.put(s12.getStdId(), s12);

        Student s13 = new Student();
        s13.setStdId(13);
        s13.setStdName("Rahim ");
        s13.setStdPhone("1234567802");
        s13.setAddress("1010 Fir St");
        s13.setDOB("2012-01-01");
        s13.setEMail("mia.yellow@example.com");
        s13.setGender("Female");
        studentMap.put(s13.getStdId(), s13);

        Student s14 = new Student();
        s14.setStdId(14);
        s14.setStdName("Noah Silver");
        s14.setStdPhone("1234567803");
        s14.setAddress("1111 Poplar St");
        s14.setDOB("2013-02-02");
        s14.setEMail("noah.silver@example.com");
        s14.setGender("Male");
        studentMap.put(s14.getStdId(), s14);

        Student s15 = new Student();
        s15.setStdId(15);
        s15.setStdName("aadil pdm");
        s15.setStdPhone("1234567804");
        s15.setAddress("1212 Redwood St");
        s15.setDOB("2014-03-03");
        s15.setEMail("olivia.gold@example.com");
        s15.setGender("Female");
        studentMap.put(s15.getStdId(), s15);

        // Display the student details
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Student ID " + entry.getValue().getStdId());
            System.out.println(entry.getValue().getStdName());
            System.out.println(entry.getValue().getStdPhone());
            System.out.println(entry.getValue().getEMail());
            System.out.println(entry.getValue().getDOB());
            System.out.println(entry.getValue().getAddress());
            System.out.println(entry.getValue().getGender());
            System.out.println("--------------------------------------------");
        }
    }
}
