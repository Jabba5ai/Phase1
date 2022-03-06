package com.locked.me;

import java.util.Scanner;

public class Main {

	public static void chooseSubOptions() {

		char subchoice;

		String input;

		Scanner sc = new Scanner(System.in);

		do {

			// prepare menu for the user to see multiple operations.

			System.out.println("\nOperations : \n1.Add a File\n2.Delete a File\n3.Search a File\n4.Back to Features");

			System.out.print("Enter your choice : ");

			subchoice = sc.next().charAt(0);

			switch (subchoice) {

			case '1':

				System.out.println("Enter a file name to be added :");

				input = sc.next();

				BusinessOperations.createFile(input);

				break;

			case '2':

				System.out.println("Enter a file name to be deleted :");

				input = sc.next();

				BusinessOperations.deleteFile(input);

				break;

			case '3':

				System.out.println("Enter a file name to be searched :");

				input = sc.next();

				BusinessOperations.searchFile(input);

				break;

			case '4':

				Main.main(null);

				break;

			}

		} while (subchoice != 4);

	}

	public static void main(String[] args) {

		char mainchoice;

		Scanner sc = new Scanner(System.in);

		System.out.println("*****************************************************");

		System.out.println("                     LockedMe.com          ");

		System.out.println("*****************************************************");

		System.out.println("------------------ Powered By : MGrp ----------------");

		System.out.println("\n");

		System.out.println("Generic Features ");

		do {

			// prepare menu for the user to see multiple operations.

			System.out.println(

					"\nFeatures : \n1.Retrieving the File names in an asecnding order\n2.Business Level Operations\n3.Close the Application");

			System.out.print("Enter your choice : ");

			mainchoice = sc.next().charAt(0);

			switch (mainchoice) {

			case '1':

				BusinessOperations.listFiles();

				break;

			case '2':

				Main.chooseSubOptions();

				break;

			case '3':

				System.exit(0);

				break;

			default:

				System.out.println("--------- Thank You --------------");

			}

		} while (mainchoice != 3);

	}

}
