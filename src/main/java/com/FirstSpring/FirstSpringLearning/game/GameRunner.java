package com.FirstSpring.FirstSpringLearning.game;

public class GameRunner {
	GamingConsole gcgame;
	public GameRunner(GamingConsole gcgame)
	{
		this.gcgame = gcgame;
	}
	
	public void run()
	{
		System.out.println("Running game: "+gcgame);
		gcgame.up();
		gcgame.down();
		gcgame.right();
		gcgame.left();
	}
}
