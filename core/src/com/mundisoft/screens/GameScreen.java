package com.mundisoft.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.mundisoft.gameworld.GameRenderer;
import com.mundisoft.gameworld.GameWorld;
import com.mundisoft.lghelpers.InputHandler;

public class GameScreen implements Screen {
	private GameWorld world;
	private GameRenderer renderer;
	
	
	public GameScreen() {
		Gdx.app.log("GameScreen", "Attached");
		
		float screenWidth = Gdx.graphics.getWidth();
		float screenHeight = Gdx.graphics.getHeight();
		float gameWidth = 136;
		float gameHeight = screenHeight / (screenWidth / gameWidth);
		
		int midPointY = (int) (gameHeight / 2);
		
		world = new GameWorld(midPointY);
		renderer = new GameRenderer(world);
		
		Gdx.input.setInputProcessor(new InputHandler(world.getCircle()));
	}

	@Override
	public void render(float delta) {
		world.update(delta);
		renderer.render();
		
	}

	@Override
	public void resize(int width, int height) {
		Gdx.app.log("GameScreen", "resizing");
		
	}

	@Override
	public void show() {
		Gdx.app.log("GameScreen", "show called");
		
	}

	@Override
	public void hide() {
		Gdx.app.log("GameScreen", "hide called");
		
	}

	@Override
	public void pause() {
		Gdx.app.log("GameScreen", "pause called");
		
	}

	@Override
	public void resume() {
		Gdx.app.log("GameScreen", "resume called");
		
	}

	@Override
	public void dispose() {
		
	}

}
