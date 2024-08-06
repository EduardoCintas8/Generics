package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			PrintService ps = new PrintService();

			System.out.print("How many values? ");
			Integer qtd = sc.nextInt();

			for (int i = 1; i <= qtd; i++) {
				System.out.print("Enther number " + i + "°: ");
				Integer value = sc.nextInt();
				ps.addValue(value);
			}

			ps.print();
			System.out.println("First: " + ps.first());
			System.out.println("Last: " + ps.last());

		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Invalid digit!");
		} finally {
			sc.close();
		}
	}
}
