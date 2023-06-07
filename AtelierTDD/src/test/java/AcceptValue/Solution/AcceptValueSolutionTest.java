package AcceptValue.Solution;

import AcceptValue.AcceptValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AcceptValueSolutionTest {

	@Test
	void test() {
		AcceptValue acceptValue = new AcceptValue();

		Assertions.assertEquals(acceptValue.asBoolean("yes"), true);
		Assertions.assertEquals(acceptValue.asBoolean("yEs"), true);
		Assertions.assertEquals(acceptValue.asBoolean("yeS"), true);
		Assertions.assertEquals(acceptValue.asBoolean("TrUe"), true);
		Assertions.assertEquals(acceptValue.asBoolean("no"), false);
		Assertions.assertEquals(acceptValue.asBoolean("faLSE"), false);
		Assertions.assertEquals(acceptValue.asBoolean("fALsE"), false);
	}
}