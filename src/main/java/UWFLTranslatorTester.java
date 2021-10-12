import java.util.Scanner; //Used to get user input

public class UWFLTranslatorTester
{
	private static UWFLTranslator instance; //defining an instance of the UWFLTranslator class to get methods
	
	public static void main (String[] args)
	{
		//The first part of this will cover complete testing, the first part of part 2
		UWFLTranslator defaultConstructor = new UWFLTranslator();
		UWFLTranslator customConstructor = new UWFLTranslator("ernistu");
		
		System.out.println("Beginning Tests.");
		
		//Test both sets of getVowels() from both consturctor methods
		if (defaultConstructor.getVowels() != "aeiou") {
			System.out.println("   FAILURE AT defaultConstructor.getVowels()");
		}
		
		if (customConstructor.getVowels() != "ernistu") {
			System.out.println("   FAILURE AT customConstructor.getVowels()");
		}
		
		//Switch up the vowels, and make sure the setVowels() method works
		defaultConstructor.setVowels("ernistu");
		if (defaultConstructor.getVowels() != "ernistu") {
			System.out.println("   FAILURE AT defaultConstructor.setVowels()");
		}
		defaultConstructor.setVowels("aeiou");
		
		//Test both constructor ability to translate a full sentence
		String answer = defaultConstructor.translateString("Testing a sentence");
		if (!answer.equals("testingargo hauwf sentenceargo")) {
			System.out.println("   FAILURE AT defaultConstructor translate sentence");
		}
		
		answer = customConstructor.translateString("Testing a sentence");
		if (!answer.equals("htestinguwf aargo hsentenecuwf")) {
			System.out.println("   FAILURE AT customConstructor translate sentance");
		}
		
		//Test the ability to translate words that start with consonants
		answer = defaultConstructor.translateWord("fish");
		if (!answer.equals("fishargo")) {
			System.out.println("   FAILURE AT defaultConstructor translate word (no vowel)");
		}
		
		answer = customConstructor.translateWord("fish");
		if (!answer.equals("fishargo")) {
			System.out.println("   FAILURE AT customConstructor translate word (no vowel)");
		}
		
		//Test the ability to translate words that start with vowels
		answer = defaultConstructor.translateWord("apple");
		if (!answer.equals("haeppluwf")) {
			System.out.println("   FAILURE AT defaultConstructor translate word (vowel first)");
		}
		
		answer = customConstructor.translateWord("enough");
		if (!answer.equals("henuoghuwf")) {
			System.out.println("   FAILURE AT customConstructor translate word (vowel first)");
		}
		
		System.out.println("Testing Complete.");
		
		
		//-------------------------------
		//This is the start of the user prompted portion, the second part of part 2
		boolean stop = false; //setting a boolean to determine when to stop the loop for the user upon 'exit'
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the UWF Language Translator");
		condition: while(!stop) { //initiating the loop that will continue until the user exits
			
			String userVowels; //initiating a string for vowels the user inputs
			
			System.out.println("Enter a String to translate: ");
			String word = userInput.nextLine().toLowerCase(); //setting the word or phrase the user wants to translate
			
			if (word.equals("exit")) { //check to see if that word is 'exit', if so break the loop (condition)
			stop = true;
			break condition;
			}
			
			System.out.println("Enter a String to represent vowels: ");
			userVowels = userInput.nextLine().toLowerCase(); //setting the string for vowel input value
			
			
			instance = new UWFLTranslator(); //calling the UWFLTranslator class to have access to the methods
			instance.setVowels(userVowels); //setting user's input vowels as the private string 'vowels' in UWFLTranslator class
				
			String translated = instance.translateString(word); //calling the translate method and setting the result to string 'translated'
			System.out.println("Translation: " + translated); //print the result to the user
			
		}
		
		System.out.println("Goodbye!"); //when loop is exited, tell the user Goodbye
		
	}
}
