/*
 * Project One: UWFL Translator
 * Author: Caitlin Hall
 * Date Due: 1/25/2021
 * 
 * Parameters include:
 * - private string that will be manipulated through the setVowels() and getVowels() methods
 * - default constructor that sets the class string vowels = aeiou
 * - customizable constructor that allows the user to input any vowels they want to pass
 * - setVowels() method can be called in another classes to change the vowels parameter in this class, since the string is private this is the only way a user can manipulate it
 * - getVowels() method can be used in another class to call what the vowels parameter is currently set to or equal to
 * - translateWord() is a public helped function to translateString() where it will take individual words and translate them according to the provided project translation rules
 * - 	translateWord() would typically not be used by the user, instead a user would implement translateString() but for the purposes of this project it is a public helper to pass the GitHub tests
 * - translateString() can take a single or multiple word string and feed it to the helper function to get a complete translation
 * -	this is why translateString() could be the only function called since it feeds everything through translateWord() it could technically be private and not effect the user unless the user needs to directly call the translateWord() function
 * 
 * Expected output:
 * - The expected output is a complete translated string from English to UWF Language
 * - Rules:
 * -	If the word begins with a user-defined 'vowel', "h" shall be placed at the beginning followed by the string of vowels in the string then the consonants and ending with "uwf"
 * -	If the word does not begin with a user-defined 'vowel', "argo" shall be placed at the end of the string
 * 
 * 
 */


public class UWFLTranslator { 
	
	//create a private instance variable
	private String vowels;
	
	//First constructor - accepts the general 'aeiou' vowels
	public UWFLTranslator() {
		this.vowels = "aeiou";
	}
	
	//Second constructor - accepts other characters defined as vowels for the purposes of this project
	public UWFLTranslator(String vowels) {
		this.vowels = vowels;
		
	}
	
	//setVowels() allows the user to manipulate the private instance variable 
	public void setVowels(String vowels) {
		this.vowels = vowels;
	}
	
	
	//getVowels() retrieves the current value for the variable
	public String getVowels() {
		return this.vowels;
	}
	
	
	//translateWord() will apply the rules for translating English to UWF Language
	public String translateWord(String word) {
		
		String myVowels = this.vowels; //creating a copy of the variable (not completely necessary)
		String translatedWord; //initiating string variables needed for this method 
		String vowelSequence = ""; //setting these blank because we will add to them in the for loop
		String consonantSequence = "";
		boolean startsWithVowel = false;
		
		//loops through the characters of myVowels and checks against the first character of the user input string
		for(int i=0; i < myVowels.length(); i++) {
			if (myVowels.charAt(i) == word.charAt(0)){
				startsWithVowel = true; //if a vowel equals the first character, set to true
				break;
			}
			else {
				continue; //else boolean will stay false, this determines where the code goes in the next if/else
			}
		}
		
		if(startsWithVowel) { //if boolean was changed to true then enter this code block
			for(int i=0; i < word.length(); i++) { //go through each char and sort into vowel or consonant sequence
				if(myVowels.indexOf(word.charAt(i)) != -1) {
					vowelSequence = vowelSequence + word.charAt(i);
				}
				
				else {
					consonantSequence = consonantSequence + word.charAt(i);
				}
			}
			
			translatedWord = "h" + vowelSequence + consonantSequence + "uwf"; //after sequences are established, add h to the beginning and uwf to the end
		}
		else {
			translatedWord = word + "argo"; //if boolean stayed false, then just add argo to the end because it started with a consonant
		}
		
		return translatedWord; //return the word to the variable that calls this method
	}
	
	public String translateString(String string) {
		
		string = string.toLowerCase(); //set the string to lower case
		
		if (string.contains(" ")) { //if there is more than one word entered
			String[] splitString = string.split(" "); //split words into array
			string = "";
			for (int i=0; i<splitString.length; i++) {
				if (i != splitString.length - 1) { //if its not the last word, then add the translated word to the string and a space at the end
					string = string + translateWord(splitString[i]) + " ";
				}
				else { //if it is the last word, don't add the space at the end
					string = string + translateWord(splitString[i]);
				}
			}
		}
		else {
			string = translateWord(string); //if there was not more than one word, just translate the string
		}
		return string; //return to user
	}
}
