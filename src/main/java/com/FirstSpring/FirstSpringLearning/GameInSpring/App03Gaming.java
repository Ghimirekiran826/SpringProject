package com.FirstSpring.FirstSpringLearning.GameInSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.FirstSpring.FirstSpringLearning.game.GameRunner;
import com.FirstSpring.FirstSpringLearning.game.GamingConsole;
import com.FirstSpring.FirstSpringLearning.game.MarioGame;

public class App03Gaming {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);)
		{
			//context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
	}
}
