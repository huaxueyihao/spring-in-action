package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

//�ڻ���java��������ʹ��@Configurationע��java�࣬�͵ȼ���XML�����е�<beans>
//@Configurationע�����Ϊһ����ʶ��֪Spring������ཫ����һ�����SpringBean�Ķ��塣
//��ЩBean�Ķ�����ʹ��@Beanע������ע�ķ�����
@Configuration
public class SpingIdolConfig {
	
	/*
	 * ���ȼ���ʹ��XML�����õ�<bean>Ԫ�ء�@Bean��֪Sping�����������һ������
	 * �ö���Ӧ�ñ�ע��ΪSpringӦ���������е�һ��Bean������������Ϊ��Bean��ID
	 */
	@Bean
	public Performer duke(){
		return new Juggler();
	}
	
	@Bean
	public Performer kenny(){
		
		Instrumentalist kenny = new Instrumentalist();
		kenny.setSong("�����ѩBean----Ѧ֮ǫ");
		kenny.setInstrument(guitar());
		return kenny;
		
	}
	
	@Bean
	public Instrument guitar(){
		return new Guitar();
	}
	
}