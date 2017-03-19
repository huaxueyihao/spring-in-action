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
	
	//���ClassPathXmlApplicationContext��springframe-context��
	//org.springframework.context.support���µ���
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring/springbean.xml");//ע��·��
	
	//����Jungger
	@Test
	public void testPerformer() throws Exception {
		
		Performer duke = (Performer) ac.getBean("duke");
		duke.perform();
		
	}
	
	//����poeticJuggler
	//���Խ�������׶����ӣ����ܳ���
	@Test
	public void testPJuggler() throws Exception {
		
		Performer duke = (Performer) ac.getBean("poeticDuke");
		duke.perform();
		
	}
	
	//���Ե���bean
	@Test
	public void testStage() throws Exception {
		
		Stage stage1 = (Stage) ac.getBean("theStage");
//		Stage stage2 = (Stage) ac.getBean("theStage");
		System.out.println(stage1.getClass());
		
	}
	
	//���Զ���bean
	@Test
	public void testTicket() throws Exception {
		
		Ticket ticket1 = (Ticket) ac.getBean("ticket");
		Ticket ticket2 = (Ticket) ac.getBean("ticket");
		System.out.println(ticket1==ticket2);//�����false
		
	}
	
	//���Զ���bean
	@Test
	public void testAuditorium() throws Exception {
		
		Auditorium ticket1 = (Auditorium) ac.getBean("auditorium");
		
	}
	
	//property  setterע��ֵ
	@Test
	public void testProperty() throws Exception {
		
		Instrumentalist ins = (Instrumentalist) ac.getBean("kenny1");
		System.out.println(ins.getSong());
		ins.getInstrument().play();
	}
	
	//����һ���ֶ�
	@Test
	public void testHank() throws Exception {
		
		OneManBand band = (OneManBand) ac.getBean("hank3");
		band.perform();
	
	}
}