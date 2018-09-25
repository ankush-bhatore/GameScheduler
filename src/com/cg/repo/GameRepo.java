package com.cg.repo;

import com.cg.bean.Game;

public interface GameRepo {

	Game save(Game game);

	Game finByName(String name);

}
