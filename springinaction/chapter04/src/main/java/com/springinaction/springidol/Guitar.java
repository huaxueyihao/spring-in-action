package com.springinaction.springidol;

import org.springframework.stereotype.Component;


/**
 * 
 * @ClassName: Guitar 
 * @Description: ����������
 * @author mao
 * @date 2017��3��19�� ����8:15:44 
 *
 */
//�Զ�������ע��ΪSpring Bean��Bean��IDĬ�����޶������������ֳ����£�Guitar Bean��IDΪguitar
@Component
public class Guitar implements Instrument {
	
	public Guitar(){
		
	}
	
	public void play() {
		System.out.println("guitar guitar guitar");
	}

}
