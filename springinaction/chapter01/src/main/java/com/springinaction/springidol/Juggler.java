package com.springinaction.springidol;

/**
 * Performer的一个实现类：Juggler
 *
 */
public class Juggler implements Performer {
	
	//Juggler有一个豆袋子，初始值是3
	private int beanBags = 3;
	
	public Juggler(){}
	
	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}
	
	//表演抛豆袋子
	public void perform() throws Exception {
		
		System.out.println("JUGGLING "+beanBags+" BENABAGS");
	
	}

}
