import java.util.Scanner;

public class Aufgabe2 {

	static Scanner s;

	public static void main(String args[]){
		
		s = new Scanner(System.in);
		
		int keepRunning = 1;
		
		while (keepRunning == 1){
			System.out.println("Hallo ich bin Programm 700.0");
			
			System.out.println("Gib die erste Zahl ein.");
				int a = s.nextInt();
			
			System.out.println("Gib den Operator ein.");
				String operator = s.next();
			
			System.out.println("Gib die zweite Zahl ein.");
				int b = s.nextInt();
			
			double result = 0;
			
			switch (operator){
				
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
					System.out.println("Diesen Operator " + operator + "kenne ich nicht!");
					result = 0;
			}
			String ausgabe = "Ergebnis von " + a + " " + operator + " " + b + " = " + result;
			
			System.out.println(ausgabe);
			
			System.out.println("Zum weiter rechnen 1 drücken.");
			keepRunning = s.nextInt();
			
		}
	}
}

