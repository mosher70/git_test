// Neuer Kommentar hinzugef�gt
import java.util.Scanner;

public class Testaufruf {
	public static void main (String[] args){
		double bmi;
		double groesseInMeter;
		/* Konstruktor f�r den Zusammengestzen
		 * Datentyp "Person" und �bergabe der Werte 
		 * name, groesse, gewicht.
		 */
		Scanner inputname = new Scanner(System.in);
		
		System.out.print("Ihr Nachname: ");
		String name = inputname.nextLine();
		
		System.out.print("Ihr Vorname: ");
		String vorname = inputname.nextLine();
		
		System.out.print("Ihre Groe�e in cm: ");
		int groesse  = inputname.nextInt();
		
		System.out.print("Ihr Gewicht in kg: ");
		int gewicht = inputname.nextInt();
		
		inputname.close();
		
		Person input = new Person (name, vorname, groesse, gewicht );
		// Wandelt die gr��e von cm in m um
		groesseInMeter = input.groesse / 100;
		// Erechnet den BMI
		bmi = input.gewicht / (groesseInMeter * groesseInMeter);
		// Den BMI Wert auf 2 Nachkommastellen abrunden
		bmi = Math.round(bmi*100)/100.0; ;
		// Ausgabe der Ergebnisse	
		System.out.println(input.vorame + " " + input.name + " hat ein Gewicht von " + input.gewicht + " kg " + 
							" bei einer gr��e von " + input.groesse + " cm ");
	
		System.out.println("Das ergibt einen BMI von " + bmi);
		
		
	}
	
}
