package com.cg.repo;

import com.cg.bean.Player;

public interface PlayerRepo {

	Player save(Player player);

	Player finByPlayerName(String playerName);

	Player finByGameName(String gameName);

}
