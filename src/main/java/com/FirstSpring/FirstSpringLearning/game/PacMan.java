package com.FirstSpring.FirstSpringLearning.game;

public class PacMan implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Pacman go up");
		
	}

	@Override
	public void down() {
		System.out.println("Pacman go down");
	}

	@Override
	public void right() {
		System.out.println("Pacman go right");
	}

	@Override
	public void left() {
		System.out.println("Pacman go left");	
	}

}
