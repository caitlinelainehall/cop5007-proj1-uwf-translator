import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TranslateWordNoVowelTest
{
	@Test
	public void testWordsNotStartingWithVowels ()
	{
		UWFLTranslator translator = new UWFLTranslator();
		assertEquals("leafargo", translator.translateWord("leaf"));

		translator.setVowels("l");
		assertEquals("embargo", translator.translateWord("emb"));
	}
}
