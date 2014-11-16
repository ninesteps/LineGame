package com.mundisoft.gameobjects;

import com.badlogic.gdx.math.Vector2;

public class Circle {
	private Vector2 position;
	private Vector2 velocity;
	private Vector2 acceleration;
	
	private int width;
	private int height;
	
	public Circle(float x, float y, int width, int height) {
		this.width = width;
		this.height = height;
		position = new Vector2(x,y);
		velocity = new Vector2(0,0);
		acceleration = new Vector2(0, 460);
	}
	
	public void update(float delta) {
		velocity.add(acceleration.cpy().scl(delta));
		
		if (velocity.y > 200) {
			velocity.y = 200;
			}
		
		position.add(velocity.cpy().scl(delta));
		}
	}

