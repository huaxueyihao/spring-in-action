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
* @Description: 一个有天赋的音乐家
* @author mao
* @date 2017年3月19日 下午7:15:17 
*
 */
//将该类注册到Spring容器中，显示的为其命名为kenny。即ID为kenny
@Component("kenny")
public class Instrumentalist implements Performer {
	
	@Value("演员---薛之谦")
	private String song;
	
	@Autowired
	@Qualifier("saxophone")
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
//		int i = 3/0;
//		Thread.sleep(1000);
		System.out.println("Playing "+song+": ");
	}

}
