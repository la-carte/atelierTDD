package FizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	// TODO:
	//  Ecrire les test pour la class FizzBuzz
	//  Rappel: Ecrire seulement un test à la fois
	//				après son écriture il doit FAIL


	@Test
	void push_retour_input_test() {

		FizzBuzz fizzBuzz = new FizzBuzz();
		Assertions.assertEquals("1",fizzBuzz.push(1));
		Assertions.assertEquals("7",fizzBuzz.push(7));
	}

	@Test
	void push_retour_Fizz_multiple_de_3_test() {

		FizzBuzz fizzBuzz = new FizzBuzz();
		Assertions.assertEquals("Fizz",fizzBuzz.push(6));
		Assertions.assertEquals("Fizz",fizzBuzz.push(63));
	}

	@Test
	void push_retour_Buzz_multiple_de_5_test() {

		FizzBuzz fizzBuzz = new FizzBuzz();
		Assertions.assertEquals("Buzz",fizzBuzz.push(5));
		Assertions.assertEquals("Buzz",fizzBuzz.push(55));
	}

	@Test
	void push_retour_Buzz_multiple_de_3_et_5_test() {

		FizzBuzz fizzBuzz = new FizzBuzz();
		Assertions.assertEquals("FizzBuzz",fizzBuzz.push(15));
		Assertions.assertEquals("FizzBuzz",fizzBuzz.push(75));
	}
}