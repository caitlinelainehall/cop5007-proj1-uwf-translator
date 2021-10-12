import static org.junit.Assert.*;

import org.junit.Test;

public class UWFLTranslatorTest {

	@Test
	public void test() {
		UWFLTranslator defaultConstructor = new UWFLTranslator();
		UWFLTranslator customConstructor = new UWFLTranslator("ernistu");
		
		//Testing initial constructors
		assertEquals("aeiou", defaultConstructor.getVowels());
		assertEquals("ernistu", customConstructor.getVowels());
		
		//Testing setVowels()
		defaultConstructor.setVowels("ernistu");
		assertEquals("ernistu", defaultConstructor.getVowels());
		defaultConstructor.setVowels("aeiou");
		
		//Testing ability to translate multiple words
		assertEquals("testingargo hauwf sentenceargo", defaultConstructor.translateString("Testing a Sentence"));
		assertEquals("htestinguwf aargo hsentenecuwf", customConstructor.translateString("Testing a Sentence"));
		
		//Testing a consonant first translation of a word
		assertEquals("fishargo", defaultConstructor.translateWord("fish"));
		assertEquals("fishargo", customConstructor.translateWord("fish"));
		
		//Testing a vowel first translation of a word
		assertEquals("haeppluwf", defaultConstructor.translateWord("apple"));
		assertEquals("henuoghuwf", customConstructor.translateWord("enough"));
		
	}

}
