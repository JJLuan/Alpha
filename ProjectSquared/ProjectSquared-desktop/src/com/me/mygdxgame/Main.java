package com.me.mygdxgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		System.out.println("this is a test");
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "DOES THIS WORK?";
		cfg.useGL20 = true;
		cfg.width = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		cfg.height = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		
		
		new LwjglApplication(new MyGdxGame(), cfg);
	}
}
