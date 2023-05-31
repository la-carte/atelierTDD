package FizzBuzz.solution;

import FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FizzBuzzSolutionTest {
	private static FizzBuzz fizzBuzz;

	@BeforeAll
	static void setUp(){
		fizzBuzz = new FizzBuzz();
	}

	@Test
	void push_Fizz_test() {
		Assertions.assertEquals("Fizz", fizzBuzz.push(3));
		Assertions.assertEquals("Fizz", fizzBuzz.push(72));
		Assertions.assertEquals("Fizz", fizzBuzz.push(831));
	}

	@Test
	void push_Buzz_test() {
		Assertions.assertEquals("Buzz", fizzBuzz.push(5));
		Assertions.assertEquals("Buzz", fizzBuzz.push(65));
		Assertions.assertEquals("Buzz", fizzBuzz.push(845));
	}

	@Test
	void push_FizzBuzz_test() {
		Assertions.assertEquals("FizzBuzz", fizzBuzz.push(15));
		Assertions.assertEquals("FizzBuzz", fizzBuzz.push(45));
		Assertions.assertEquals("FizzBuzz", fizzBuzz.push(135));
	}
}