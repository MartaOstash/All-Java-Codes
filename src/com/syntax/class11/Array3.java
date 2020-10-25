package com.syntax.class11;

public class Array3 {

	public static void main(String[] args) {

		// create 2D array of food:
		// american
		// italian
		// asian
		// afghani
		// indian

		String[][] food = { { "steak", "hot dog", "cheeseburger" }, { "pizza", "pasta", "canoli" },
				{ "sushi", "ramen", "fried rice", "dumplings" }, { "kebab", "manto" },
				{ "beriyani", "masal", "curry", "chicken tikka masala" }

		};

		for (String[] dishes : food) {
			for (String dish : dishes) {
				System.out.println(dish + " ");
			}
			System.out.println();

			System.out.println("-----------------------------------------------");
			for (int i = 0; i < food.length; i++) {
				for (int j = 0; j < food[i].length; j++) {

					System.out.println(food[i][j] + " ");

				}
				System.out.println();

			}
		}

	}

}
