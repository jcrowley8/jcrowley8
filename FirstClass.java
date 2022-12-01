package blackJack_code;
import java.util.Scanner;  // Import the Scanner class


public class FirstClass {

	public static void main(String[] args) {
		
		

		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Please enter the card the dealer is showing (Ace is represented by the number 11)");

		    int dealerCard = myObj.nextInt();  // Read user input

		    System.out.println("Please enter your card total (Note 5 is the lowest card combo you can have): ");
		    int playerCard = myObj.nextInt();
		    
		
		System.out.printf("Dealer is showing [%d], player has [%d]\n\n", dealerCard, playerCard);
				
		cardCalculator(dealerCard, playerCard);
		
	}
	
	
	
	
	
	static void cardCalculator(int dealerCard, int playerCard) {
		switch (dealerCard) {
		
		case 2:
			if (playerCard >= 5 && playerCard <= 8) {
				System.out.println("The book says hit");
			}
			else if (playerCard == 9 || playerCard == 12) {
				System.out.println("The book says hit");
			}
			else if (playerCard == 10 || playerCard == 11) {
				System.out.println("The book says to double down");
			}
			else if (playerCard >=13) {
				System.out.println("The book says to stand");
			}
			break;

		case 3:
			if (playerCard >= 5 && playerCard <= 8 || playerCard == 12) {
				System.out.println("The book says hit");
			}
			else if (playerCard == 9 || playerCard == 10 || playerCard == 11) {
				System.out.println("The book says to double down");
			}
			else if (playerCard >= 13) {
				System.out.println("The book says to stand");
			}
			break;
			
		case 4:
			if (playerCard >= 5 && playerCard <= 8) {
				System.out.println("The book says hit");
			}
			else if (playerCard >= 9 && playerCard <= 11) {
				System.out.println("The book says to double down");
			}
			else if (playerCard >= 12 && playerCard <= 16 ) {
				System.out.println("The book says to stand");
			}
			break;
			
		case 5:
			if (playerCard >= 5 && playerCard <= 8) {
				System.out.println("The book says hit");
			}
			else if (playerCard >= 9 && playerCard <= 11) {
				System.out.println("The book says to double down");
			}
			else if (playerCard >= 12 && playerCard <= 16 ) {
				System.out.println("The book says to stand");
			}
			break;
			
		case 6:
			if (playerCard >= 5 && playerCard <= 8) {
				System.out.println("The book says hit");
			}
			else if (playerCard >= 9 && playerCard <= 11) {
				System.out.println("The book says to double down");
			}
			else if (playerCard >= 12 && playerCard <= 16 ) {
				System.out.println("The book says to stand");
			}
			break;
			
		case 7:
			if (playerCard == 10 || playerCard == 11) {
				System.out.println("The book says to double down");
			}
			else
				System.out.println("The book says to hit");
			break;
			
		case 8:
			if (playerCard == 10 || playerCard == 11) {
				System.out.println("The book says to double down");
			}
			else
				System.out.println("The book says to hit");
			break;
			
		case 9:
			if (playerCard == 10 || playerCard == 11) {
				System.out.println("The book says to double down");
			}
			else
				System.out.println("The book says to hit");
			break;
			
		case 10:
			if (playerCard == 10 || playerCard == 11) {
				System.out.println("The book says to double down");
			}
			else
				System.out.println("The book says to hit");
			break;
			
		case 11:
			if (playerCard == 10 || playerCard == 11) {
				System.out.println("The book says to double down");
			}
			else
				System.out.println("The book says to hit");
			break;
		}
		
		
		
	}

}
