package StringCalculator;

public class StringCalculator {

	// TODO:
	//  Rappel: D'abord écrire un test
	//				Faire passé le test en Vert avec le moins de ligne possible
	//				Faire du Refacto -> vérifier que les tests sont toujours Vert


	//TODO:
	// Exo: Récuperer en entrée une string contenant des chiffres séparé par un separateur.
	//		  Retourne la somme de tout les chiffres avec un int (Sauf contre indication)
	// Etape 1 : La methode ne peux prendre que maximume 2 chiffres séparé par une vigule
	//				1.1 - "1" -> 1
	//				1.2 - "2,6" -> 8
	//				1.3 - "" -> 0
	public int Add(String numbers){
		return 0;
	}


	//TODO:
	// Etape 2 : Permetre un nombre infini de chiffres en entrée
	// Etape 3 : Accepter comme sepateur en plus de la virgule, le retour à la ligne
	//				- "1,2\n3" -> 6
	//				- "1,\n3" -> Invalide, mais ne pas prendre en compte le cas.
	// Etape 4 : Interdire le séparteur en fin de ligne
	//				- "1,2," -> throw exception
	// Etape 5 : Deffinir le séparateur au début de la string
	//				- "//[séparateur]\n[chiffres]"
	//				- "//;\n1;3" -> 4
	//				- "//bonjour\n1bonjour5" -> 6
	//				- "//|\n1|2,3" -> throw exception avec le message : " '|' expected but ',' found at position 3"
}
