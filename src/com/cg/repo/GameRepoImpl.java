package com.cg.repo;

import java.util.Set;

import com.cg.bean.Game;

public class GameRepoImpl implements GameRepo {

	private Set<Game> games;

	@Override
	public Game save(Game game) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game finByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Game> getGames() {
		return games;
	}

	public void setGames(Set<Game> games) {
		this.games = games;
	}

}
