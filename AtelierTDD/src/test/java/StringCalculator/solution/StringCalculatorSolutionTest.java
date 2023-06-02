package StringCalculator.solution;

import FizzBuzz.FizzBuzz;
import StringCalculator.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringCalculatorSolutionTest {
	private static StringCalculator stringCalculator;

	@BeforeAll
	static void setUp(){
		stringCalculator = new StringCalculator();
	}

	@Test
	void Add_final_test() throws Exception {

		Assertions.assertEquals(7, stringCalculator.Add("//sep\\n2sep5"));
		Assertions.assertEquals(7, stringCalculator.Add("2,5"));
		Assertions.assertEquals(24, stringCalculator.Add("2,5,3,6,8"));
		Assertions.assertThrows(Exception.class, () -> stringCalculator.Add("//|\\n1|2,3") );
	}
}