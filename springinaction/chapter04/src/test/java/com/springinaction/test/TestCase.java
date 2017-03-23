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
	
	//���ClassPathXmlApplicationContext��springframe-context��
	//org.springframework.context.support���µ���
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring/springbean.xml");//ע��·��
	
	//��������ʽ�����桢֪ͨ
	@Test
	public void testAspect() throws Exception {
		
		Performer kenny = (Performer) ac.getBean("kenny");
//		System.out.println(kenny);
		 
		kenny.perform();//��� Playing ��Ա����Ѧ֮ǫ: 

		
		
	}
	
	//���Դ��������֪ͨ
	@Test
	public void testArgsAdvisor() throws Exception {
		
		//˼���ߣ���˼��
		Thinker volunteer = (Thinker) ac.getBean("volunteer");
		volunteer.thinkOfSomething("�������ɶ��");
		
		//������ �������ɶ
		MindReader magician = (MindReader) ac.getBean("magician");
		System.out.println(magician.getThoughts());

	}
	
}