import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner text = new Scanner(System.in);
		
		int n, tamanhoLinha, metade;
		String linha, resultado;

		System.out.println("Digite a quantidade de linhas");
		n = in.nextInt();

		for (int i = 0; i < n; i++) {

			linha = text.nextLine();

			tamanhoLinha = linha.length();
			metade = (tamanhoLinha / 2) + (tamanhoLinha % 2);

			resultado = "";
			for (int j = metade - 1; j >= 0; j--)
				resultado += linha.charAt(j);

			for (int j = tamanhoLinha - 1; j >= metade; j--)
				resultado += linha.charAt(j);

			System.out.println(resultado);
		}

		System.out.println("encerrado");
		in.close();
		text.close();
	}
}
