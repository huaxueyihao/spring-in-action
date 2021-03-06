package com.springinaction.test;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.Auditorium;
import com.springinaction.springidol.Instrumentalist;
import com.springinaction.springidol.OneManBand;
import com.springinaction.springidol.Performer;
import com.springinaction.springidol.PoeticJuggler;
import com.springinaction.springidol.Stage;
import com.springinaction.springidol.Ticket;


public class TestCase {
	
	//这个ClassPathXmlApplicationContext是springframe-context中
	//org.springframework.context.support包下的类
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring/springbean.xml");//注意路径
	
	//测试自动装配byName
	@Test
	public void testByName() throws Exception {
		
		Instrumentalist kenny = (Instrumentalist) ac.getBean("kenny");
		kenny.perform();//输出 Playing 演员——薛之谦: 
		kenny.getInstrument().play();//输出 TOOT　TOOT TOOT 
		Instrumentalist kenny1 = (Instrumentalist) ac.getBean("kenny1");
		kenny1.perform();//输出 Playing 演员1——薛之谦: 
		kenny1.getInstrument().play();//输出 TOOT　TOOT TOOT: 
		System.out.println(kenny.getInstrument()==kenny1.getInstrument());//输出 true 说明他两个人共用一个乐器
		
	}
	
	
	//测试自动装配byType
	public void testByType() throws Exception {
		
		Instrumentalist kenny = (Instrumentalist) ac.getBean("kenny");
		kenny.perform();//输出 Playing 演员——薛之谦: 
		kenny.getInstrument().play();//输出 TOOT　TOOT TOOT 

	}
	
	//测试自动装配constructor
	@Test
	public void testConstructor() throws Exception {
		
		PoeticJuggler duke = (PoeticJuggler) ac.getBean("duke");
		duke.perform();

	}
	//测试注解@Autowired @StringedInstrument
	@Test
	public void testAutowired() throws Exception {
		
		Instrumentalist kenny = (Instrumentalist) ac.getBean("kenny");
		kenny.perform();
		kenny.getInstrument().play();
		
	}
	
	//测试注解@Inject
	@Test
	public void testInject() throws Exception {
		
		Instrumentalist kenny = (Instrumentalist) ac.getBean("kenny");
		kenny.perform();
		kenny.getInstrument().play();
		
	}
	//测试注解@Component
	@Test
	public void testComponent() throws Exception {
		
		Instrumentalist eddie = (Instrumentalist) ac.getBean("eddie");
		eddie.perform();
		eddie.getInstrument().play();
		
	}
	
	//测试基于java的配置
	@Test
	public void testJava() throws Exception {
		
		Instrumentalist eddie = (Instrumentalist) ac.getBean("kenny");
		eddie.perform();
		eddie.getInstrument().play();
		
	}
}
