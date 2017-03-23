package com.springinaction.springidol;

/**
 * 沉思者
 * @ClassName: Volunteer 
 * @Description: 一个时代的思想家
 * @author mao
 * @date 2017年3月23日 下午5:31:58 
 *
 */
public class Volunteer implements Thinker {
	
	private String thoughts;
	
	public void thinkOfSomething(String thoughts) {
		
		this.thoughts = thoughts;

	}

	public String getThoughts() {
		return thoughts;
	}
	
}
