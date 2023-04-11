package com.java;

public class SnakeAndLadderUC3 {
	public static final int startPosition = 0;
	public static final int isSnake = 1;
	public static final int isLadder = 2;

	public static void main(String[] args) {
		System.out.println("<--------Welcome to Snake And Ladder Game---------->");

		System.out.println("<--------------------------------------------->");
		int currentPosition = 0;
		int diceNumber = (int) ((Math.random() * 10 % 6) + 1);
		System.out.println("Dice Number : " + diceNumber);
		System.out.println("<--------------------------------------------->");
		int option = (int) ((Math.random() * 10 % 3) + 1);
		if (option == isSnake) {
			currentPosition -= diceNumber;
			System.out.println("Player in snake position : " + currentPosition);
		} else if (option == isLadder) {
			currentPosition += diceNumber;
			System.out.println("Player in ladder position : " + currentPosition);
		} else {
			System.out.println("No Play " + currentPosition);
		}
	}
}

