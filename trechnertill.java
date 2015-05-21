package thomas;

import java.util.Scanner;

public class trechnertill {
	static Scanner s;

	public static void main(String args[]) {
		s = new Scanner(System.in);
		boolean keepRunning = true;
		while (keepRunning) {
			System.out.println("Hallo ich bin Programm 700.0");
			System.out.println("Gib die erste Zahl ein.");
			int a = s.nextInt();
			System.out.println("Gib den Operator ein.");
			String operator = s.next();
			System.out.println("Gib die zweite Zahl ein.");
			int b = s.nextInt();
			double result = 0;
			switch (operator) {
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				result = a / b;
				break;
			default:
				System.out.println("Diesen Operator " + operator
						+ "kenne ich nicht!");
				result = 0;
			}
			String ausgabe = "Ergebnis von " + a + " " + operator + " " + b
					+ " = " + result;
			
			System.out.println(ausgabe);
			
			System.out.println("Zum weiter rechnen '1' drücken, wenn nicht '2'.");
			
			
			if (s.next().equals("2")) {
				keepRunning = false;
				
			}
		System.out.println("Auf Wiedersehen!");
		}
		
	}
}
