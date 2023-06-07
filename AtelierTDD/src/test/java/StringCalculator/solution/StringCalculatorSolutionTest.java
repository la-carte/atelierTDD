package StringCalculator.solution;

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
	void Add_test_string_vide() throws Exception {
		Assertions.assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void Add_test_string_un_nombre() throws Exception {
		Assertions.assertEquals(1, stringCalculator.add("1"));
		Assertions.assertEquals(8, stringCalculator.add("8"));
	}

	@Test
	void Add_test_string_deux_nombre_simple() throws Exception {
		Assertions.assertEquals(9, stringCalculator.add("1,8"));
		Assertions.assertEquals(11, stringCalculator.add("8,3"));
	}

	@Test
	void Add_test_string_new_line_separateur() throws Exception {
		Assertions.assertEquals(9, stringCalculator.add("1\n8"));
		Assertions.assertEquals(11, stringCalculator.add("8\n3"));
	}


	@Test
	void Add_test_string_plusieur_nombre() throws Exception {
		Assertions.assertEquals(26, stringCalculator.add("1,8,3,8,6"));
		Assertions.assertEquals(27, stringCalculator.add("8\n3\n6\n3\n7"));
	}

	@Test
	void add_interdire_separateur_fin_ligne_test(){
		StringCalculator stringCalculator = new StringCalculator();
		Assertions.assertThrows(Exception.class, () -> stringCalculator.add("2,3,") );
		Assertions.assertThrows(Exception.class, () -> stringCalculator.add("2,3\n") );
	}

	@Test
	void Add_test_string_custome_line_separator() throws Exception {
		Assertions.assertEquals(7, stringCalculator.add("//sep\n2sep5"));
		Assertions.assertEquals(15, stringCalculator.add("//baba\n2baba5baba8"));
		Assertions.assertThrows(Exception.class, () -> stringCalculator.add("//|\n1|2,3"), "'|'expected but ',' found at position 3");
	}
}