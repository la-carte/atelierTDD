package AcceptValue.Solution;

import AcceptValue.AcceptValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AcceptValueSolutionTest {

	@Test
	void test() {
		AcceptValue acceptValue = new AcceptValue();

		Assertions.assertEquals(acceptValue.TorF("yes"), true);
		Assertions.assertEquals(acceptValue.TorF("yEs"), true);
		Assertions.assertEquals(acceptValue.TorF("yeS"), true);
		Assertions.assertEquals(acceptValue.TorF("TrUe"), true);
		Assertions.assertEquals(acceptValue.TorF("no"), false);
		Assertions.assertEquals(acceptValue.TorF("faLSE"), false);
		Assertions.assertEquals(acceptValue.TorF("fALsE"), false);
	}
}