package dk.sdu.storm331.cbse.main;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class Main {
	
	public static void main(String[] args) {

		int width = 1400;
		int height = 800;

		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("storm331 - Asteroids");
		config.setWindowedMode(width, height);
		config.setWindowSizeLimits(width,height,width,height);
		config.setResizable(false);

		
		new Lwjgl3Application(new Game(), config);
		
	}
	
}