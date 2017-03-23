package com.springinaction.springidol;

import javax.inject.Inject;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



/**
 * 
* @ClassName: Instrumentalist 
* @Description: һ�����츳�����ּ�
* @author mao
* @date 2017��3��19�� ����7:15:17 
*
 */
//������ע�ᵽSpring�����У���ʾ��Ϊ������Ϊkenny����IDΪkenny
@Component("kenny")
public class Instrumentalist implements Performer {
	
	@Value("��Ա---Ѧ֮ǫ")
	private String song;
	
	@Autowired
	@Qualifier("saxophone")
	private Instrument instrument;
	
	//ע������
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	public Instrument getInstrument() {
		return instrument;
	}
	
	//ע�����
	public void setSong(String song) {
		this.song = song;
	}
	public String getSong() {
		return song;
	}
	
	public Instrumentalist(){
		
	}

	public void perform() throws Exception {
//		int i = 3/0;
//		Thread.sleep(1000);
		System.out.println("Playing "+song+": ");
	}

}