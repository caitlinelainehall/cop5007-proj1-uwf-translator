import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class SettersGettersTest
{
	@Test
	public void testSetterAndGetter ()
	{
		UWFLTranslator translator = new UWFLTranslator();
		translator.setVowels("z");
		assertEquals("z", translator.getVowels());
	}
}
