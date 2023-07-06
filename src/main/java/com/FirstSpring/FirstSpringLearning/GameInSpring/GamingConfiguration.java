package com.FirstSpring.FirstSpringLearning.GameInSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.FirstSpring.FirstSpringLearning.game.GameRunner;
import com.FirstSpring.FirstSpringLearning.game.GamingConsole;
import com.FirstSpring.FirstSpringLearning.game.MarioGame;
import com.FirstSpring.FirstSpringLearning.game.PacMan;
import com.FirstSpring.FirstSpringLearning.game.SuperContraGame;
@Configuration
public class GamingConfiguration {
//	//var marioGame = new MarioGame();
//	//var superContraGame = new SuperContraGame();
//	var pacman = new PacMan();
//	var gameRunner = new GameRunner(pacman);
//	gameRunner.run();
	
	@Bean
	public GamingConsole mgame()
	{
		var marioGame = new MarioGame();
		return marioGame; 
	}
	@Bean
	public GamingConsole sgame()
	{
		var superContraGame = new SuperContraGame();
		return superContraGame;
	}
	@Bean
	public GamingConsole pgame()
	{
		var pacman = new PacMan();
		return pacman;
	}
	@Bean
	@Primary
	public GameRunner gamerunner() //pacmangame
	{
		var gamerunner = new GameRunner(pgame());
		return gamerunner;
	}
	@Bean
	public GameRunner gamerunner1(GamingConsole sgame) //supercontragame
	{
		var gameRun = new GameRunner(sgame);
		return gameRun;
	}
	
}
