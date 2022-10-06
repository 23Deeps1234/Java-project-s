package maven1;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import maven1.Palindrome;

//test class
public class Testpalindrome {

	@DisplayName(value="Checking String palindrome")
	//parametrized test is check for multiple strings
	@ParameterizedTest
	//valuesource contains multiple strings
	@ValueSource(strings  = {"bbbb","nitin","radar","acccca"})
	//method call
	public void isPalindromeTest(String str)
	{
		assertTrue(Palindrome.ispalindrome(str));
	}
}
