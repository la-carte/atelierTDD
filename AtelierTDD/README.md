# Atelier d'initiation au TDD: Test Driven Development 

## Organisation de l'atelier 
Il va y avoir deux énoncés différents *FizzBuzz* et *StringCalculator*.

### Etape 1 : 
Commencer par FizzBuzz et implémenter le code une solution le plus rapidement possible. (plus c'est moche, mieux c'est)
Lancer la classe de Test du dossier Solution pour vérifier notre code (**SANS regarder l'implémentation du test**)  

### Etape 2 : 
Recommencer l'implémentation d'une solution mais cette fois si en appliquant le **TDD**

### Etape 3 : 
Passez au 2eme énoncé,
Implémenter la fonction Add de la classe StringCalculator étape par étape en appliquant bien le **TDD**

## "Solution"
Le package Solution est juste un exemple d'implémentation, et le test peut permettre de vérifier si notre 
code marche bien. Il n'est en aucun cas une réponse finale et unique. 


## Petit rappel sur l'utilisation du TDD

### Les 3 fondamentaux : 
 - Tu ne dois pas écrire du code à moins qu'il soit déjà son test qui *fail*
 - Tu ne dois pas écrire plus de code de test que nécessaire pour qu'il fail
 - Tu ne dois pas écrire plus de code que nécessaire pour faire passer l'unique test qui fail

### Cycle du Rouge-Vert-Refacto:
 - Rouge : Ecrire **UN** seul test qui décrit une partie du problème, et il faut qu'il **Fail**
 - Vert : Ecrire le **minimum** de code pour que le test réussisse. -> Vérifier que **tout** les tests passes
 - Refacto : Refacto le code de production mais aussi le code de test. -> Si un test vient à **Fail** 
-> Revert les modifications et recommencer le Refacto
 - Différent voit d'amélioration pour lors du refacto :
   - la nomenclature : variable, fonction, classe
   - simplifier le code et l'algorithmique
   - supprimer les répétitions de code
