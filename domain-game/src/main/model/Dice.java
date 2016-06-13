package main.model;

import java.util.Random;

	/**
	 * @author Jamie
	 * 
	 * A die roller.
	 */

public class Dice {

	/**
	 * Roll a number of dice of the specified size
	 * @param numberOfDice - the number of dice to roll
	 * @param sidesOfDice - the number of sides of the rolled dice will have
	 * @return int - the face total for the rolled dice
	 * <p>
	 * i.e. roll(1, 6) == roll 1d6
	 */
	public static int roll(int numberOfDice, int sidesOfDice) {

		Random r = new Random();
		int total = 0;
		for (int i = 0; i < numberOfDice; i++) {
			total+=rollDieWithSidesNumbering(sidesOfDice, r);
		}
		return total;
	}

	private static int rollDieWithSidesNumbering(int sidesOfDice, Random r) {
		return r.nextInt(sidesOfDice + 1);
	}

}
