package com.me.mygdxgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "ProjectSquared";
		cfg.useGL20 = false;
		cfg.width = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		cfg.height = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		
		
		new LwjglApplication(new MyGdxGame(), cfg);
	}
}
