import java.util.Scanner;

public class Calculator {
	
	
	
	
	public static void main(String arg[]) {
		//For future, for GUI
		//new CalculatorGUI(580, 600, "Calculator");
		
		Action act = new Action();
		//variables
		float[] numbers = new float[10];
		int wybor;
		
		for(int i=1; i<=2; i++) {
			System.out.println("Podaj liczbê nr." + i);
			Scanner sc = new Scanner(System.in);
			numbers[i] = sc.nextFloat();
			System.out.println(numbers[i]);
		}
		
		System.out.println("Wybierz operacjê:\n1.Dodawanie\n2.Odejmowanie\n3.Mno¿enie\n4.Dzielenie");
		Scanner sc2 = new Scanner(System.in);
		wybor = sc2.nextInt();
		switch(wybor) {
			case 1: System.out.println(act.Add(numbers[1], numbers[2]));
			break;
			case 2: System.out.println(act.Sub(numbers[1], numbers[2]));
			break;
			case 3: System.out.println(act.Div(numbers[1], numbers[2]));
			break;
			case 4: System.out.println(act.Multi(numbers[1], numbers[2]));
			break;
		}
	}
}

