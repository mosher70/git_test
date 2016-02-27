

public class Testaufruf {
	public static void main (String[] args){
		double bmi;
		double groesseInMeter;
		/* Konstruktor für den Zusammengestzen
		 * Datentyp "Person" und übergabe der Werte 
		 * name, groesse, gewicht.
		 */
		Person uwe = new Person("Uwe", 182, 130);
		// Wandelt die größe von cm in m um
		groesseInMeter = uwe.groesse / 100;
		// Erechnet den BMI
		bmi = uwe.gewicht / (groesseInMeter * groesseInMeter);
		// Den BMI Wert auf 2 Nachkommastellen abrunden
		bmi = Math.round(bmi*100)/100.0; ;
		// Ausgabe der Ergebnisse	
		System.out.println(uwe.name + " hat ein Gewicht von " + uwe.gewicht + " kg " + 
							" bei einer größe von " + uwe.groesse + " cm ");
		System.out.println(groesseInMeter);
		System.out.println("Das ergibt einen BMI von " + bmi);
	}
	
}
