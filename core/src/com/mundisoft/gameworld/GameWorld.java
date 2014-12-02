package com.mundisoft.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.mundisoft.gameobjects.Circle;

public class GameWorld {
	private Circle circle;
	
	public GameWorld(int midPointY){
		circle = new Circle(33, midPointY -5, 17, 12);
	}
	
	public void update(float delta) {
		circle.update(delta);
	}
	
	public Circle getCircle() {
		return circle;
	}
	
	
}
