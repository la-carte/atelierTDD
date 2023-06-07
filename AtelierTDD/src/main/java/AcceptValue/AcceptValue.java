package AcceptValue;

public class AcceptValue {
	//Todo:
	// On a une fonction qui nous retourne un boolean par rapport à une string en entrée
	// Si la string est "true" ou "yes" -> true
	// Si la string est "fakse" ou "no" -> false
	// Sinon -> null
	// étape 1:
	// 	On part du principe que le code est fonctionnel
	// 	Ecrire l'ensemble  des tests qui couvre tous les cas
	// étape 2:
	// 	refacto le code actuel (aussi côté test)
	// étape 3:
	// 	Ecrire un test pour tous les cas d'écriture de 'yes' 'no' 'true' et 'false'
	// étape 4:
	// 	Ici on ne traite pas tous les cas de lettre majuscule, on va remédier à ça
	// étape 5*:
	// 	faire du refacto si cela  est nécessaire

	public Boolean TorF(String v){
		if(v == "yes"){
			return true;
		}
		if(v == "no"){
			return false;
		}
		if(v == "Yes"){
			return true;
		}
		if(v == "yEs"){
			return true;
		}
		if(v == "No"){
			return false;
		}
		if(v == "yeS"){
			return true;
		}
		if(v == "YEs"){
			return true;
		}
		if(v == "true"){
			return true;
		}
		if(v == "TRue"){
			return true;
		}
		if(v == "truE"){
			return true;
		}
		if(v == "YeS"){
			return true;
		}
		if(v == "false"){
			return false;
		}
		if(v == "fALse"){
			return false;
		}
		if(v == "FalsE"){
			return false;
		}
		return null;
	}
}
