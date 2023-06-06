package FizzBuzz;

public class FizzBuzz {

	// TODO:
	//  Ecrire les test pour la class FizzBuzz
	//  Énoncé :
	//  		Ecrire une fonction qui prend en entrée un int et retourne une String
	//  		Si c'est un multiple de 3 -> Fizz
	//  		Si c'est un multiple de 5 -> Buzz
	//  		Si c'est un multiple de 3 ET 5 -> FizzBuzz
	//  		Sinon retourner le nombre en entrée
	//  Rappel: D'abord écrire un test
	//				Faire passé le test en Vert avec le moins de ligne possible
	//				Faire du Refacto -> vérifier que les tests sont toujours Vert

	public String push(int input){
		if(multipleDe(input,3) && multipleDe(input, 5) ){
			return "FizzBuzz";
		}
		if(multipleDe(input,3)){
			return "Fizz";
		}
		if(multipleDe(input,5)){
			return "Buzz";
		}
		return String.valueOf(input);
	}

	private boolean multipleDe(int number, int multiplicateur){
		return number % multiplicateur == 0;
	}

	//Todo
	// Hint :
	// Etape 1 : Retourner seulement le nombre en entrée
	// Etape 2 : Ajouter la condition sur le multiple de 3
	// Etape 3 : Ajouter la condition sur le multiple de 5
	// Etape 4 : Et pour finir ajouter la condition sur les multiple de 3 ET 5

//	public String push(int input){
//		String r = "" ;
//		if(input % 3 == 0)
//			r = "Fizz";
//		if(input % 5 == 0)
//			r += "Buzz";
//		if(r.isEmpty())
//			r = String.valueOf(input);
//		return r;
//	}

}
