// Pair coded with James


import java.util.Scanner;

public class ArraysAndExceptions {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput = "";
		int index = 0;
		int userChoice = 0;
		
		String[] students = {"Hannah", "Gerard", "James", "Sandya", "Shireesha", "David", "Vincent", "Graham", "Tia", "Sienna"};
		String[] hometowns = {"Union Lake", "Northville", "Harper Woods", "Troy", "Troy", "Westland", "Northland", "Novi", "Farmington", "Hamtrammack"};
		String[] foods = {"Avocado", "Scwarma", "Scotch", "Okra", "Rice", "Pizza", "Crab", "Kombucha", "Pasta", "Drunken Noodles"};
	
		
		System.out.println("Welcome to our Java class. Which student would you like to know more about?");
		
		for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i]);
		}
		
		do {
			try {  
		            System.out.println("Pick an student, 1 through " + students.length + ": ");
			            userChoice = scnr.nextInt();
			            index = userChoice - 1;
			            System.out.println("Student " + userChoice + " is " + students[index] + ". What would you like to know about " + students[index] + "? (enter \"hometown\" or \"favorite food\"): ");
			            
			} catch (Exception ex) {
	        	System.out.println("That student does not exist. Please try again. (enter a number 1-10)");
	        }         
		} while ((index < 0) || (index >= 10));
	            
		
		scnr.nextLine();
	    userInput = scnr.nextLine();
	      
	            
	            
	            if (userInput.equals("hometown")) {
	            	System.out.println(students[index] + " is from " + hometowns[index] + ".");
	            	System.out.println("Would you like to know more? (enter \"yes\" or \"no\")");
	            	String hometownInput = scnr.nextLine();
	            	if (hometownInput.equals("yes")) {
	            		System.out.println(students[index] + " loves " + foods[index] + "!");
	            	} else if (hometownInput.equals("no")) {
	            		System.out.println("Thanks!");
	            	} else {
	            		try {
							throw new Exception("Try again! You must enter the input exactly as prompted."); // custom exception
						} catch (Exception ex) {
							System.out.println(ex.getMessage());
						}
	            	}
	            } else if (userInput.equals("favorite food")) {
	            	System.out.println("Student " + students[index] + " loves " + foods[index] + "!");
	            	System.out.println("Would you like to know more? (enter \"yes\" or \"no\")");
	            	String foodInput = scnr.nextLine();
	            	if (foodInput.equals("yes")) {
	            		System.out.println(students[index] + " is from " + hometowns[index] + ".");
	            	} else if (foodInput.equals("no")) {
	            		System.out.println("Thanks!");
	            	} else {
	            		try {
							throw new Exception("Try again! You must enter the input exactly as prompted."); // custom exception
						} catch (Exception ex) {
							System.out.println(ex.getMessage());
						}
	            	}
	            } else {
	            	try {
						throw new Exception("Try again! You must enter the input exactly as prompted."); // custom exception
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
						
					}
	            	
	            }
	            
	
	}

}