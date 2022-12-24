import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n, valor;
		
		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();
		
		System.out.println("Digite a quantidade de numeros para o array");

		//Defindo tamanho do array
		do {
			n = in.nextInt();
			if (n <= 1 || n > 100000) {
				System.out.println("A quantidade de numero deve ser maior do que 1 e menor ou igual a 100000");
			}
		} while (n <= 1 || n > 100000);

		int lista[] = new int[n];

		// Adicionando valores para o array
		for (int i = 0; i < n; i++) {
			do {
				System.out.println("Digite o " + (i + 1) + "°" + "valor");
				valor = in.nextInt();
				if (valor <= 0) {
					System.out.println("Apenas valores positivos serão aceitos");
				}
			} while (valor <= 0);
			lista[i] = valor;
		}

		in.close();
		
		// Separando valores impares e pares
		for(int x : lista) {
			if(x%2==0) {
				pares.add(x);
			}else {
				impares.add(x);
			}
		}
		
		// Ordenando as listas de numeros impares e pares conforme solicitado
		pares.sort(null);
		Collections.sort(impares, Collections.reverseOrder());
		
		//Retornando valores com ordenações desejadas
		System.out.println("--------------------------------------");
		for(int x : pares) {
			System.out.println(x);
		}
		
		for(int x : impares) {
			System.out.println(x);
		}
	}
}
