package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

//在基于java的配置里使用@Configuration注解java类，就等价于XML配置中的<beans>
//@Configuration注解会作为一个标识告知Spring：这个类将包含一个多个SpringBean的定义。
//这些Bean的定义是使用@Bean注解所标注的方法。
@Configuration
public class SpingIdolConfig {
	
	/*
	 * 它等价于使用XML所配置的<bean>元素。@Bean告知Sping这个方法返回一个对象，
	 * 该对象应该被注册为Spring应用上下文中的一个Bean。方法名将作为该Bean的ID
	 */
	@Bean
	public Performer duke(){
		return new Juggler();
	}
	
	@Bean
	public Performer kenny(){
		
		Instrumentalist kenny = new Instrumentalist();
		kenny.setSong("认真的雪Bean----薛之谦");
		kenny.setInstrument(guitar());
		return kenny;
		
	}
	
	@Bean
	public Instrument guitar(){
		return new Guitar();
	}
	
}
