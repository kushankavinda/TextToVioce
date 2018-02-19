package com.kushan.freetts;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		// Defining Scanner Object to read data from console
		Scanner inputScanner = new Scanner(System.in);
		
		TextToSpeech ttsc = new TextToSpeech();

		System.out.println("Enter the Text : (type 'exit' to terminate)");

		// Reading the text
		String inputText = inputScanner.nextLine();

		while (true) {

			if("exit".equalsIgnoreCase(inputText)) {
				
				inputText = "there are ten laptops";
				ttsc.speak(inputText);
				break;
			}
			
			ttsc.speak(inputText);
			
			System.out.println("Enter the Text : (type 'exit' to terminate)");
			inputText = inputScanner.nextLine();
		}

		inputScanner.close();
		
	}
}
