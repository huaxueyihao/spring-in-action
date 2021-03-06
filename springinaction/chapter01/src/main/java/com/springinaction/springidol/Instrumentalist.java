package com.springinaction.springidol;

/**
 * 
* @ClassName: Instrumentalist 
* @Description: 一个有天赋的音乐家
* @author mao
* @date 2017年3月19日 下午7:15:17 
*
 */
public class Instrumentalist implements Performer {
	
	private String song;
	
	private Instrument instrument;
	
	//注入乐器
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	public Instrument getInstrument() {
		return instrument;
	}
	//注入歌曲
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
