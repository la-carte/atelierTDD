package AcceptValue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AcceptValueTest {
	// TODO:
	//  Ecrire les tests pour la classe AcceptValue
	//  Rappel: Ecrire seulement un test à la fois
	//				après son écriture il doit FAIL

	@Test
	void test() {

		Assertions.assertEquals(new AcceptValue().asBoolean("yes"), true);
		Assertions.assertEquals(new AcceptValue().asBoolean("no"), false);
	}
}