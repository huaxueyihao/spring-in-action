package com.springinaction.springidol;

/**
 * �����ߵ�ʵ����
 * @ClassName: Magician 
 * @Description: ���Զ�ȡ�����뷨�ľ���ʵ��
 * @author mao
 * @date 2017��3��23�� ����5:29:12 
 *
 */
public class Magician implements MindReader {
	
	
	private String thoughts;
	
	public void interceptThoughts(String thoughts) {
		
		System.out.println("��Ӧ־Ը�ߵ��뷨��");
		this.thoughts = thoughts;

	}

	public String getThoughts() {
		
		return thoughts;
	}

}
