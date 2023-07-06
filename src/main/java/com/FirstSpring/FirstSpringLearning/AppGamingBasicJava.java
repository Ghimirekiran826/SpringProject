package com.FirstSpring.FirstSpringLearning;

import com.FirstSpring.FirstSpringLearning.game.GameRunner;
import com.FirstSpring.FirstSpringLearning.game.MarioGame;
import com.FirstSpring.FirstSpringLearning.game.PacMan;
import com.FirstSpring.FirstSpringLearning.game.SuperContraGame;

public class AppGamingBasicJava {
public static void main(String[] args) {
	//var marioGame = new MarioGame();
	//var superContraGame = new SuperContraGame();
	var pacman = new PacMan();
	var gameRunner = new GameRunner(pacman);
	gameRunner.run();
}
}
