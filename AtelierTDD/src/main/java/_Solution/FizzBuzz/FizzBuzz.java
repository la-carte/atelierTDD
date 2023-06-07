package _Solution.FizzBuzz;

public class FizzBuzz {

	private static final String valMultipleTrois = "Fizz" ;
	private static final String valMultipleCinq = "Buzz" ;

	public String push(int input){
		if(multipleDe(input,3) && multipleDe(input, 5) ){
			return valMultipleTrois + valMultipleCinq;
		}
		if(multipleDe(input,3)){
			return valMultipleTrois;
		}
		if(multipleDe(input,5)){
			return valMultipleCinq;
		}
		return String.valueOf(input);
	}

	private boolean multipleDe(int number, int multiplicateur){
		return number % multiplicateur == 0;
	}

}
