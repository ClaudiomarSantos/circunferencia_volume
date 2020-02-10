package entidades;

public class Circulos {

	public double raio;

	public static final double PI = 3.14;

	public static double Circunferencia(double raio) {
		return (2 * raio * PI);
	}

	public static double Volume(double raio) {
		return (4 * PI * Math.pow(raio, 3))/3;

	}
}
