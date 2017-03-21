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
	
	//���ClassPathXmlApplicationContext��springframe-context��
	//org.springframework.context.support���µ���
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring/springbean.xml");//ע��·��
	
	//�����Զ�װ��byName
	@Test
	public void testByName() throws Exception {
		
		Instrumentalist kenny = (Instrumentalist) ac.getBean("kenny");
		kenny.perform();//��� Playing ��Ա����Ѧ֮ǫ: 
		kenny.getInstrument().play();//��� TOOT��TOOT TOOT 
		Instrumentalist kenny1 = (Instrumentalist) ac.getBean("kenny1");
		kenny1.perform();//��� Playing ��Ա1����Ѧ֮ǫ: 
		kenny1.getInstrument().play();//��� TOOT��TOOT TOOT: 
		System.out.println(kenny.getInstrument()==kenny1.getInstrument());//��� true ˵���������˹���һ������
		
	}
	
	
	//�����Զ�װ��byType
	public void testByType() throws Exception {
		
		Instrumentalist kenny = (Instrumentalist) ac.getBean("kenny");
		kenny.perform();//��� Playing ��Ա����Ѧ֮ǫ: 
		kenny.getInstrument().play();//��� TOOT��TOOT TOOT 

	}
	
	//�����Զ�װ��constructor
	@Test
	public void testConstructor() throws Exception {
		
		PoeticJuggler duke = (PoeticJuggler) ac.getBean("duke");
		duke.perform();

	}
	//����ע��@Autowired @StringedInstrument
	@Test
	public void testAutowired() throws Exception {
		
		Instrumentalist kenny = (Instrumentalist) ac.getBean("kenny");
		kenny.perform();
		kenny.getInstrument().play();
		
	}
	
	//����ע��@Inject
	@Test
	public void testInject() throws Exception {
		
		Instrumentalist kenny = (Instrumentalist) ac.getBean("kenny");
		kenny.perform();
		kenny.getInstrument().play();
		
	}
}