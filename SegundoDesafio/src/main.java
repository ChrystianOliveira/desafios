import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double valor;
		int valorInteiro, centavos;
		int[] notas = { 100, 50, 20, 10, 5, 2 };
		double[] moedas = { 1, 0.5, 0.25, 0.1, 0.05, 0.01 };

		// Leitura do valor
		valor = in.nextDouble();
		in.close();

		// Calculo do valor em inteiros e centavos
		// valorInteiro = (int) valor;
		// centavos = (int) Math.round((valor - valorInteiro) * 100);

		valorInteiro = (int) valor;
		centavos = (int) (valor * 100) % 100;

		// Impressão das notas
		System.out.println("NOTAS:");
		for (int nota : notas) {
			int numNotas = valorInteiro / nota;
			System.out.printf("%d nota(s) de R$ %.2f\n", numNotas, (double) nota);
			valorInteiro %= nota;
		}
		System.out.println(valorInteiro);
		// Impressão das moedas 
		System.out.println("MOEDAS:");
		for (double moeda : moedas) {
			int numMoedas = centavos / (int) (moeda * 100);
			// Caso tenha restado 1 real do valorInteiro 
			if (valorInteiro != 0) {
				System.out.printf("%d moeda(s) de R$ %.2f\n", numMoedas + 1, moeda);
				valorInteiro %= moeda;
			}
			else {
				System.out.printf("%d moeda(s) de R$ %.2f\n", numMoedas, moeda);
			centavos %= (int) (moeda * 100);
			}
			
		}
	}
}