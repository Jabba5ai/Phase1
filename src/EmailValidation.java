import java.util.Scanner;

public class EmailValidation {
	boolean isValid = false;

	// logic for email validation
	public void isValidation(String[] array, String input) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(input)) {
				isValid = true;
				break;
			}
			else {
				isValid = false;
			}
		}
		if (isValid) {
			System.out.println("\n--- Email is Valid :) ---\n");
		} else {
			System.out.println("\n*** Email is InValid :( ***\n");
		}
	}

	public static void main(String[] args) {
		// Array creation
		String[] emails = new String[10];
		String input;
		char choice;
		// Assigning the values to array emails.
		emails[0] = "eshwar_sai@gmail.com";
		emails[1] = "bhavya_ganguru@gmail.com";
		emails[2] = "jyothi_gottumukkala@gmail.com";
		emails[3] = "vinod_199@yahoo.com";
		emails[4] = "bhuvana_1234@gmail.com";
		emails[5] = "gayathti_99@gmail.com";
		emails[6] = "eshwar_jabba@yahoo.com";
		emails[7] = "rajeswari_1999@gmail.com";
		emails[8] = "bantu_5668@gmail.com";
		emails[9] = "jhansiganguru123@gmail.com";
		Scanner sc = new Scanner(System.in);
		// creating the object for EmailValidation
		EmailValidation obj = new EmailValidation();
		do {
			System.out.println("\n\nMain Menu\n1.e-mail Validation\n2.Exit\n");
			System.out.println("Enter the choice : ");
			choice = sc.next().charAt(0);
			switch (choice) {
			case '1':
				// User entered the input string
				System.out.println("Enter the email : ");
				input = sc.next();
				obj.isValidation(emails, input); // calling the method
				break;
			case '2':
				System.out.println("Thank you!");
				System.exit(0);
			}
		} while (choice != 2);
	}
}
