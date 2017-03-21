package com.springinaction.springidol;


/**
 * 
 * @ClassName: Guitar 
 * @Description: 乐器：吉他
 * @author mao
 * @date 2017年3月19日 下午8:15:44 
 *
 */
@StringedInstrument//好嘛？这应该是自定义的注解吧
public class Guitar implements Instrument {
	
	public Guitar(){
		
	}
	
	public void play() {
		System.out.println("guitar guitar guitar");
	}

}
