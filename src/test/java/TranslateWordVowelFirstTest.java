import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TranslateWordVowelFirstTest
{
	@Test
	public void testWordsStartingWithVowels ()
	{
		UWFLTranslator translator = new UWFLTranslator();
		assertEquals("heoounrmsuwf", translator.translateWord("enormous"));

		translator.setVowels("zt");
		assertEquals("hzztopuwf", translator.translateWord("zoztp"));
	}
}
