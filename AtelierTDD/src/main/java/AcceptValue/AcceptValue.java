package AcceptValue;

public class AcceptValue {
	//Todo:
	// On a une fonction qui nous retourn un boolean par rapport à une string en entrée
	// Si la string est "true" ou "yes" -> true
	// Si la string est "fakse" ou "no" -> false
	// Sinon -> null
	// etape 1:
	// 	On part du principe que le code est fonctionnel
	// 	Ecrire l'enssemble des tests qui couvres tout les cas
	// etape 2:
	// 	refacto le code actuel (aussi côté test)
	// etape 3:
	// 	Ecrire un test pour tout les cas d'écriture de 'yes' 'no' 'true' et 'false'
	// etape 4:
	// 	Ici on ne traite pas tout les cas de lettre majuscules, on va remédier à ça
	// etape 5*:
	// 	faire du refacto si seula nessesaire

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
