package com.mundisoft.linegame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mundisoft.screens.GameScreen;

public class LGame extends Game{

	@Override
	public void create() {
		Gdx.app.log("LGame", "created");
		setScreen(new GameScreen());
		
	}
	
}
