package com.FirstSpring.FirstSpringLearning.game;

public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println(" High");
	}

	public void down() {
		System.out.println(" Low");
	}

	public void right() {
		System.out.println(" Shake");
	}

	public void left() {
		System.out.println("Shoot");
	}
}
