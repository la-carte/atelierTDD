package FizzBuzz;

public class FizzBuzz {

	// TODO:
	//  Ecrire les test pour la class FizzBuzz
	//  Rappel: D'abord écrire un test
	//				Faire passé le test en Vert avec le moins de ligne possible
	//				Faire du Refacto -> vérifier que les tests sont toujours Vert
//	public String push(int input){
//		return null;
//	}

	public String push(int input){
		String r = "";
		if(input % 3 == 0)
			r += "Fizz";
		if(input % 5 == 0)
			r += "Buzz";
		return r;
	}

}
