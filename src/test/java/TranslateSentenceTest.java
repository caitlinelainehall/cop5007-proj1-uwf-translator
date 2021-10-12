import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TranslateSentenceTest
{
	@Test
	public void testWordsStartingWithVowels ()
	{
		UWFLTranslator translator = new UWFLTranslator();
		assertEquals("translateargo hiontuwf huwfuwf languageargo", translator.translateString("translate into UWF Language"));

		UWFLTranslator translator2 = new UWFLTranslator("ernistu");
		assertEquals("htrnstealauwf hintouwf huwfuwf languageargo", translator2.translateString("translate into UWF Language"));
	}
}
