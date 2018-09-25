package com.cg.bean;

import java.util.List;
import java.util.Map;

public class DayReport {

	private String dayName;
	private Map<Game, List<Player>> map;

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public Map<Game, List<Player>> getMap() {
		return map;
	}

	public void setMap(Map<Game, List<Player>> map) {
		this.map = map;
	}

}
