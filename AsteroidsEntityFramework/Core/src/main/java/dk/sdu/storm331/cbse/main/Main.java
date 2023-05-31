package dk.sdu.storm331.cbse.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {

		int width = 1400;
		int height = 800;

		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("storm331 - Asteroids");
		config.setWindowedMode(width, height);
		config.setWindowSizeLimits(width,height,width,height);
		config.setResizable(false);

		AnnotationConfigApplicationContext application = new AnnotationConfigApplicationContext();
		application.scan("dk.sdu.storm331.cbse.main");
		application.refresh();

		new Lwjgl3Application((ApplicationListener) application.getBean("game"), config);
		
	}
	
}
