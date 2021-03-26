
//  Saisir une serie de N nombres positif puis determinez la valeur
//  1- La valeur min et la valeur max 
//  2- les 2 valeurs min et les deux valeurs max
//  3- La somme des valeurs premieres
//  4- le produit des valeurs parfaites
//  5- La valeur min premier et la valeur max parfaite

//  1- La valeur min et la valeur max x
public static int valeurMinimum(int...table) {
    int min = 0;
    for (int i = 1; i < nombresDEntiers; i++){
        for (int j = i+1; i < nombresDEntiers; i++){
            if (table[j] < table[i]){
                min = table[i];
            }
        }
        return java.util.Arrays.stream(table).min().getAsInt(); 
    } 
}
public static int valeurMaximum(int...table) {
    int max = 0;
    for (int i = 1; i < nombresDEntiers; i++){
        for (int j = i+1; i < nombresDEntiers; i++){
            if (table[j] < table[i] ){
                min = table[j];
            }
        }
        return java.util.Arrays.stream(table).min().getAsInt(); 
    } 
}

//  2- les 2 valeurs min et les deux valeurs max

//  3- La somme des valeurs premieres

//  4- le produit des valeurs parfaites

//  5- La valeur min premier et la valeur max parfaite
