package com.springinaction.springidol;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * 
 * @ClassName: OneManBand 
 * @Description: 一个表演乐队
 * @author mao
 * @date 2017年3月19日 下午8:09:04 
 *
 */
public class OneManBand implements Performer {
	
//	private Collection<Instrument> instruments;
//	
//	public void setInstruments(Collection<Instrument> instruments) {
//		this.instruments = instruments;
//	}
//	
//	public Collection<Instrument> getInstruments() {
//		return instruments;
//	}
	
//	private Map<String,Instrument> instruments;
//	
//	public void setInstruments(Map<String,Instrument> instruments) {
//		this.instruments = instruments;
//	}
//	
//	public Map<String,Instrument> getInstruments() {
//		return instruments;
//	}
//	
//	public OneManBand(){
//		
//	}
	
	private Properties instruments;
	
	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}
	
	public Properties getInstruments() {
		return instruments;
	}
	
	public OneManBand(){
		
	}
	
	
	
//	public void perform() throws Exception {
//		for (Instrument instrument : instruments) {
//			instrument.play();
//		}
//	}
	
//	public void perform() throws Exception {
//		for (String key : instruments.keySet()) {
//			Instrument instrument = instruments.get(key);
//			instrument.play();
//		}
//	}
	
	public void perform() throws Exception {
		for (Object key : instruments.keySet()) {
			System.out.println(instruments.get(key));
		}
	
	}
}
