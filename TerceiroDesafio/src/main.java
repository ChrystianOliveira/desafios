import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static void insertionSort(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			int j = i;

			

		}
	}
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, k, resultado=0;
		
		
		System.out.println("Digite o valor do array de inteiros");
		
		do {
			n = in.nextInt();
			if(n<=0) {
				System.out.println("Para definir um vetor, necessario que seu numero seja positivo");
			}
		}while(n<=0);
		
		int vetor[] = new int[n];
		
		//Adicionando valores ao vetor
		for(int i = 0; i<vetor.length; i++){
			System.out.println("Digite o "+(i+1)+"° valor" );
			vetor[i]= in.nextInt();
		}
		
		//Definindo valor do alvo
		System.out.println("Digite o valor alvo");
		k=in.nextInt();
		in.close();
		//Obtendo quantidade de vezes que o alvo foi atingido
		for (int x : vetor) {
			for(int y: vetor) {
				if((x - y) == k) {
					resultado++;
				}
			}
		}
		
		System.out.println(resultado);

	}
	
}
