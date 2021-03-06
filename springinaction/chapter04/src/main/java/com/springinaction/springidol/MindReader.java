package com.springinaction.springidol;

/**
 * 读心者类
 * @ClassName: MindReader 
 * @Description: 可以读取别人的思想
 * @author mao
 * @date 2017年3月23日 下午5:23:49 
 *
 */
public interface MindReader {
	
	//拦截别人的想法(感应别人的内心想法)
	void interceptThoughts(String thoughts);
	
	//获得想法
	String getThoughts();
}
