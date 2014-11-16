package com.mundisoft.linegame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mundisoft.linegame.LGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Line Game";
		config.width = 272;
		config.height = 408;
		new LwjglApplication(new LGame(), config);
	}
}
