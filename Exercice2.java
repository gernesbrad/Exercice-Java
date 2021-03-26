
//   Saisir une année  et un mois puis determiner le nombre de jour de ce mois dans l'année
//       1- pas de classe de java 
//       2- Faire avec les classes Java 

// pas de classe de java
public class Nbre_d_jr_du_mw {
    /**
         * @param args
         * @param Year 
         */
	public static void main(String[] args) {
			Scanner ok = new Scanner(System.in);
			System.out.println("veiller saisir le mois");
			String mois = ok.nextLine();
			int i = Integer.parseInt(mois);
			System.out.println("veiller saisir l'annee");
			String annee = ok.nextLine();
			int j = Integer.parseInt(annee);
			System.out.println(Month.of(i).length(Year.isLeap(j)));
	}
 
}

// Faire avec les classes Java
import java.time.*;
import java.util.Scanner;

public class Nbre_d_jr_du_mw {
    /**
         * @param args
         * @param Year 
         */
	public static void main(String[] args) {
			Scanner ok = new Scanner(System.in);
			System.out.println("veiller saisir le mois");
			String mois = ok.nextLine();
			int i = Integer.parseInt(mois);
			System.out.println("veiller saisir l'annee");
			String annee = ok.nextLine();
			int j = Integer.parseInt(annee);
			System.out.println(Month.of(i).length(Year.isLeap(j)));
	}
 
}