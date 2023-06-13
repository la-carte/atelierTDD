package StringCalculator;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringCalculator {

	//TODO:
	// Premier exo:
	// 	reponde à l'énoncé le plus rapidemnt possible
	// Enoncé :
	//		Récuperer en entrée une string contenant des chiffres séparé par un séparateur.(par défaut un ',')
	//		Retourne la somme de touts les chiffres avec un int (Sauf contre indication)
	// 	Pour définit un séparateur personalisé :
	//		"//[séparateur]\n[chiffres]" -> exemple -> "//ok\n3ok3" -> 6
	//    	Si il y a un autre séparateur, que celui définit : thow exception avec message : 'CustomSéparateur'expected but ',' found at position 3
	//    Interdire le séparteur en fin de ligne -> throw exception


	public int add(String numbers) throws Exception {
		return 0;
	}


	// TODO:
	//  Rappel: D'abord écrire un test
	//				Faire passer le test en Vert avec le moins de lignes possible
	//				Faire du Refacto -> vérifier que les tests sont toujours Verts

	//TODO:
	// Exo 2 : Récuperer en entrée une string contenant des chiffres séparé par un séparateur.
	//		  Retourne la somme de touts les chiffres avec un int (Sauf contre indication)
	// Etape 1 : La méthode ne peut prendre que maximum 2 chiffres séparés par une virgule
	//				1.1 - "1" -> 1
	//				1.2 - "2,6" -> 8
	//				1.3 - "" -> 0
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
