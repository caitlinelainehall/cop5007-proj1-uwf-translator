import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class  ParameterizedConstructorTest
{
	@Test
	public void testConstructor ()
	{
		UWFLTranslator translator = new UWFLTranslator("abcde");
		assertTrue(translator instanceof UWFLTranslator);
	}
}
