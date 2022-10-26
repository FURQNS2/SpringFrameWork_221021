package com.sycompany.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String configLocation1 = "classpath:applicationCTX1.xml";  //변수 선언, xml불러오기
		String configLocation2 = "classpath:applicationCTX2.xml";  // 변수 선언, xml불러오기
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1,  configLocation2); //xml을 담아둔 제네릭(클래스로 값을 담아둔 것을 일컫음)을 불러들임
		
		Student student1 = ctx.getBean("student1", Student.class);   // bean의 객체불러들임  getBean(객체명, 객체의 사용 클래스)
		
		System.out.println(student1.getName());  //홍길동
		System.out.println(student1.getAge());  // 30
		System.out.println(student1.getHobbys());   // [운동, 노래, 게임]
		System.out.println(student1.getWeight());   // 몸무게 80
		System.out.println(student1.getHeight());   //키 180
		
	 	
		StudentInfo studentInfo = ctx.getBean("studentInfo1", StudentInfo.class);
		Student studentHong = studentInfo.getStudent();
	    
		System.out.println("---------------------------------");
		
		System.out.println(studentHong.getName());
	
	     
	     if(student1.equals(studentHong)) {
	         System.out.println("student1와 studentHong은 같은 객체입니다.");	    	 
	     } else {
	         System.out.println("student1와 studentHong은 다른 객체입니다.");
	     	    	 
	     }
	     
	    Student student2 = ctx.getBean("student2", Student.class);
	    System.out.println(student2.getName());  //김유신
		System.out.println(student2.getAge());  // 23
		System.out.println(student2.getHobbys());   // [영화, 체육, 야구]
		System.out.println(student2.getWeight());   // 몸무게 83
		System.out.println(student2.getHeight());   //키 176
		
		
		Family family = ctx.getBean("family", Family.class);
		
		System.out.println(family.getFather()); //길동아빠
		System.out.println(family.getMother()); //길동엄마
		System.out.println(family.getSister()); //길동누나
		System.out.println(family.getBrother()); //길동동생
		
		
	    ctx.close();
}
}
