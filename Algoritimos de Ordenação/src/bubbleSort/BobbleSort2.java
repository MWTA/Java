package bubbleSort;

import java.util.Scanner;

public class BobbleSort2 {
	/* variaveis de controle */
	static boolean a = true;
	static boolean b = true;
	static boolean c = true;
	static boolean d = true;
	static boolean e = true;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[5];

		/* ============================================ */

		/* Alimenta o vetor */
		for (int i = 0; i < vetor.length; i++) {
			if (a == true) {
				System.out.println("Preenche Vetor: ");
				a = false;
			}
			vetor[i] = sc.nextInt();
		}

		/* Imprime o vetor */
		for (int n = 0; n < vetor.length; n++) {
			if (b == true) {
				System.out.println(" ");
				System.out.println("Vetor Desordenado: ");
				b = false;
			}
			System.out.print(vetor[n] + " ");
		}

		/* ============================================ */

		/* Ordena o Vetor Crescente */
		for (int i = 0; i < vetor.length; i++) {
			/* Decremento */
			for (int j = 0; j < i; j++) {
				/**/
				if (vetor[i] < vetor[j]) {

					int aux = vetor[j];

					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}

		/* Imprime Vetor Ordenado Crescente */
		for (int z = 0; z < vetor.length; z++) {
			if (c == true) {
				System.out.println(" ");
				System.out.println("Vetor Ordenado Crescente: ");
				c = false;
			}
			System.out.print(vetor[z] + " ");
		}

		/* ============================================ */

		/* Ordena o Vetor Decrescente */
		for (int i = 0; i < vetor.length; i++) {
			/* Decremento */
			for (int j = 0; j < i; j++) {
				/**/
				if (vetor[i] > vetor[j]) {

					int aux = vetor[j];

					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}

		/* Imprime Vetor Ordenado Decrescente */
		for (int z = 0; z < vetor.length; z++) {
			if (d == true) {
				System.out.println("\nVetor Ordenado Descrescente: ");
				d = false;
			}
			System.out.print(vetor[z] + " ");
		}

		/* ============================================ */
		/**/
		for (int z = 0; z < vetor.length; z++) {
			if (vetor[z] % 2 == 0) {
				if (e == true) {
					System.out.println("\nNumeros Pares: ");
				}
				System.out.print(vetor[z] + " ");
			}
		}

	}
}
