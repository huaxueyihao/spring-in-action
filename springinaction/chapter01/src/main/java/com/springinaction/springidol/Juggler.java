package com.springinaction.springidol;

/**
 * Performer��һ��ʵ���ࣺJuggler
 *
 */
public class Juggler implements Performer {
	
	//Juggler��һ�������ӣ���ʼֵ��3
	private int beanBags = 3;
	
	public Juggler(){}
	
	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}
	
	//�����׶�����
	public void perform() throws Exception {
		
		System.out.println("JUGGLING "+beanBags+" BENABAGS");
	
	}

}