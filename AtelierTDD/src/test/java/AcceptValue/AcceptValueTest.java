package AcceptValue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AcceptValueTest {

	@Test
	void test() {
		AcceptValue acceptValue = new AcceptValue();

		Assertions.assertEquals(acceptValue.TorF("yes"), true);
		Assertions.assertEquals(acceptValue.TorF("no"), false);
	}
}