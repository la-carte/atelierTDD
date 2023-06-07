package _Solution.AcceptValue;

import java.util.Arrays;
import java.util.Locale;

public class AcceptValue {
	private static final String[] listValeurAccepted = {"true","yes"};
	private static final String[] listValeurRejected = {"false","no"};

	public Boolean acceptedValue(String valeur){
		if(valeur == null) {
			return null;
		}
		valeur = valeur.toLowerCase();
		if (Arrays.asList(listValeurAccepted).contains(valeur)){
			return true;
		}
		if (Arrays.asList(listValeurRejected).contains(valeur)){
			return false;
		}
		return null;
	}
}
