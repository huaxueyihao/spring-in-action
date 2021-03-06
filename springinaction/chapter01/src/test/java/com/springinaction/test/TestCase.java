package com.springinaction.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.Auditorium;
import com.springinaction.springidol.Instrumentalist;
import com.springinaction.springidol.OneManBand;
import com.springinaction.springidol.Performer;
import com.springinaction.springidol.Stage;
import com.springinaction.springidol.Ticket;


public class TestCase {
	
	//这个ClassPathXmlApplicationContext是springframe-context中
	//org.springframework.context.support包下的类
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring/springbean.xml");//注意路径
	
	//测试Jungger
	@Test
	public void testPerformer() throws Exception {
		
		Performer duke = (Performer) ac.getBean("duke");
		duke.perform();
		
	}
	
	//测试poeticJuggler
	//测试结果，能抛豆袋子，又能唱歌
	@Test
	public void testPJuggler() throws Exception {
		
		Performer duke = (Performer) ac.getBean("poeticDuke");
		duke.perform();
		
	}
	
	//测试单例bean
	@Test
	public void testStage() throws Exception {
		
		Stage stage1 = (Stage) ac.getBean("theStage");
//		Stage stage2 = (Stage) ac.getBean("theStage");
		System.out.println(stage1.getClass());
		
	}
	
	//测试多例bean
	@Test
	public void testTicket() throws Exception {
		
		Ticket ticket1 = (Ticket) ac.getBean("ticket");
		Ticket ticket2 = (Ticket) ac.getBean("ticket");
		System.out.println(ticket1==ticket2);//结果是false
		
	}
	
	//测试多例bean
	@Test
	public void testAuditorium() throws Exception {
		
		Auditorium ticket1 = (Auditorium) ac.getBean("auditorium");
		
	}
	
	//property  setter注入值
	@Test
	public void testProperty() throws Exception {
		
		Instrumentalist ins = (Instrumentalist) ac.getBean("kenny1");
		System.out.println(ins.getSong());
		ins.getInstrument().play();
	}
	
	//测试一个乐队
	@Test
	public void testHank() throws Exception {
		
		OneManBand band = (OneManBand) ac.getBean("hank3");
		band.perform();
	
	}
}
