package com.springinaction.springidol;

/**
 * µ¥ÀıÀà£ºÎèÌ¨
 *
 */
public class Stage {
	private Stage(){
		
	}
	
	private static class StageSingletonHolder{
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
}
