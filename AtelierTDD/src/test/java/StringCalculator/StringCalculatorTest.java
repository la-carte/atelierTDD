package StringCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void add_infini_nombre_test() throws Exception {
		StringCalculator stringCalculator = new StringCalculator();
		Assertions.assertEquals(1, stringCalculator.add("1"));
		Assertions.assertEquals(10, stringCalculator.add("2,8"));
		Assertions.assertEquals(0, stringCalculator.add(""));
		Assertions.assertEquals(20, stringCalculator.add("2,8,2,8"));
	}


	@Test
	void add_interdire_separateur_fin_ligne_test() throws Exception {
		StringCalculator stringCalculator = new StringCalculator();
		Assertions.assertThrows(Exception.class, () -> stringCalculator.add("2,3,") );
		Assertions.assertThrows(Exception.class, () -> stringCalculator.add("2,3\n") );
	}

	@Test
	void add_creer_nouveau_separator_test() throws Exception {
		StringCalculator stringCalculator = new StringCalculator();
		Assertions.assertEquals(7, stringCalculator.add("//sep\n2sep5"));
		Assertions.assertThrows(Exception.class, () -> stringCalculator.add("//|\n1|2,3"), "message" );
	}
}