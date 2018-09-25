package com.cg.repo;

import com.cg.bean.Day;

public interface DayRepo {

	Day save(Day player);

	Day finByPlayerName(String playerName);

	Day finByGameName(String gameName);

}
