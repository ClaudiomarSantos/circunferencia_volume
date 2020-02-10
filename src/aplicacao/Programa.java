package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Circulos;

public class Programa {
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Circulos circulo = new Circulos();

		System.out.println("digite o valor do Raio: ");
		double raio = sc.nextDouble();

		double circ = Circulos.Circunferencia(raio);
		double volume = Circulos.Volume(raio);

		System.out.printf("circunferencia: %.2f%n", circ);

		System.out.printf("volume: %.2f%n", volume);

		sc.close();
	}

}
