package com.springinaction.test;

import org.junit.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.Auditorium;
import com.springinaction.springidol.Instrumentalist;
import com.springinaction.springidol.Magician;
import com.springinaction.springidol.MindReader;
import com.springinaction.springidol.OneManBand;
import com.springinaction.springidol.Performer;
import com.springinaction.springidol.PoeticJuggler;
import com.springinaction.springidol.Stage;
import com.springinaction.springidol.Thinker;
import com.springinaction.springidol.Ticket;
import com.springinaction.springidol.Volunteer;


public class TestCase {
	
	//这个ClassPathXmlApplicationContext是springframe-context中
	//org.springframework.context.support包下的类
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring/springbean.xml");//注意路径
	
	//测试声明式的切面、通知
	@Test
	public void testAspect() throws Exception {
		
		Performer kenny = (Performer) ac.getBean("kenny");
//		System.out.println(kenny);
		 
		kenny.perform();//输出 Playing 演员——薛之谦: 

		
		
	}
	
	//测试传入参数的通知
	@Test
	public void testArgsAdvisor() throws Exception {
		
		//思考者，先思考
		Thinker volunteer = (Thinker) ac.getBean("volunteer");
		volunteer.thinkOfSomething("你猜我想啥？");
		
		//读心者 对他想的啥
		MindReader magician = (MindReader) ac.getBean("magician");
		System.out.println(magician.getThoughts());

	}
	
}
