package com.springinaction.springidol;

/**
 * 读心者的实现类
 * @ClassName: Magician 
 * @Description: 可以读取别人想法的具体实例
 * @author mao
 * @date 2017年3月23日 下午5:29:12 
 *
 */
public class Magician implements MindReader {
	
	
	private String thoughts;
	
	public void interceptThoughts(String thoughts) {
		
		System.out.println("感应志愿者的想法！");
		this.thoughts = thoughts;

	}

	public String getThoughts() {
		
		return thoughts;
	}

}
