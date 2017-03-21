package com.springinaction.springidol;

import javax.inject.Inject;
import javax.inject.Named;



/**
 * 
* @ClassName: Instrumentalist 
* @Description: һ�����츳�����ּ�
* @author mao
* @date 2017��3��19�� ����7:15:17 
*
 */
public class Instrumentalist implements Performer {
	
	private String song;
	
	@Inject
	@Named("guitar")
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
		System.out.println("Playing "+song+": ");
	}

}