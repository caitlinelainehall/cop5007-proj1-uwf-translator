# cop5007-proj1-uwf-translator
# Project-1
![Points badge](../../blob/badges/.github/badges/points.svg)
## translateargo hiontuwf huwfuwf languageargo

## Overview
The UWF Language (short UWFL) is a centuries old way of concealing the true form of words to anyone not familiar with the principles.
Every English word is translated by two simple rules:
1. If the word begins with a vowel, an "h" is inserted before this vowel, then all other vowels in the word follow in order of appearance, then all consonants in the word in order of appearance and finally the suffix "uwf" is added.
So, enormous => henormous => heoounrms => heoounrmsuwf
2. If the word begins with a consonant, then the rule is even simpler.
You just need to add the suffix "argo" to the end of the word. So leaf => leafargo.

For this programming assignment, you will be creating a class that can handle translating a string of words (without punctuation or special characters) from normal English to UWFL.
Furthermore, you will be allowing the user of the class to specify what they believe to be vowels.

## Learning Objectives
The focus of this assignment is on the following learning objectives:
- Gain experience in using Java conditionals and Java looping constructs
- Gain experience with using boolean values and expressions
- Be able to manipulate Java Strings and chars
- Experience writing tests for Java classes

## Assignment
There are two parts to this assignment.

### Part 1
The first part is to create the class for translating into UWFL called ***UWFLTranslator***.

![UML diagram of desired class](http://www.plantuml.com/plantuml/svg/SoWkIImgAStDuKhEIImkLWWDT_C9AKhCAyv9BCalughcqbKeoozFpIcsKWWkAShCI-VIHbEZeOafXAe5fA0ujIGCB8WXfwjG0jMO6fvVbA9H3YJWiWe8Qn7A828QnM0AYz9QBeVKl1IWdm00)

This class must obey the following specifications:

#### Instance Variables
- You will need to have an instance variable of type String.
Each character in this String will be considered a vowel.
Every other character is considered a consonant.
Make sure to set the correct access level for instance variables.

#### Constructors
- A default constructor that will set the vowels to the standard "aeiou".
- A parameterized constructor that accepts a String representing the letters that count as vowels.
For instance, if instead of "aeiou", you also wanted 'y', then call the constructor with "aeiouy".
You're welcome to try your program with weird "vowels", such as "ernistu" (which covers a lot of first characters in an English word!).

#### Methods
- Getter and setter methods for the `vowels` instance variable.
- `translateWord` - a public helper method that will take in a String representing a word to be translated to UWFLang.
The method will apply the rules of UWFLang using the user defined vowels.
It will then return the translated word to `translateString`.
- `translateString` - a public method that will take in a String to translate to UWFLang.
This method will loop over each word in the String (you can assume spaces delimit words) and call the helper method `translateWord` with each word.
It should build up a new String with the translated words and return that to the user of the class.
_Note: In order to keep this simple, you can assume no punctuation and only lowercase letters_.

### Part 2
The second part of the assignment is to create a driver for the class.
This program should do the following:
- Create a UWFLTranslatorTester class with a main method that completely tests the UWFLTranslator class.
- In the main method of the driver, this program will provide a loop that continuously prompts a user for new Strings to translate and the set of accepted vowels until the user types in "exit".
Both strings (word to translate and set of vowels) must be converted to lowercase before being processed.

## Example Input and Output
This is an example of the input and output for the driver program:
`Welcome to the UWF Language Translator`\
`Enter a String to translate:` **translate into UWF Language**\
`Enter a String to represent vowels:` **aeiou**\
`Translated String: translateargo hiontuwf huwfuwf languageargo`\
`Enter a String to translate:` **translate into UWF Language**\
`Enter a String to represent vowels:` **ernistu**\
`Translated String: htrnstealauwf hintouwf huwfuwf languageargo`\
`Enter a String to translate:` **exit**\
`Goodbye!`

Good luck and...
***sayargo yourargo prayersargo littleargo hoenuwf dontargo forgetargo myargo sonargo toargo hiuenclduwf heeoevrynuwf***

## Submission
1. Push your completed project to GitHub.
2. Verify your score aligns with your expectations in the GitHub interface.
3. Re-commit/push as necessary until satisfied with your score.

