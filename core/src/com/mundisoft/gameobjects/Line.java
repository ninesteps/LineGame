package com.mundisoft.gameobjects;

import java.util.Random;

public class Line extends Scrollable {
	private Random r;
	
	public Line(float x, float y, int width, int height, float scrollSpeed) {
		super (x, y, width, height, scrollSpeed);
		r = new Random();
	}
	
	@Override
	public void reset(float newX, int newHeight) {
		super.reset(newX);
		height = newHeight;
	}
	
}
