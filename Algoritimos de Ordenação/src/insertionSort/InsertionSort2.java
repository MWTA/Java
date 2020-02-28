package insertionSort;

import java.util.Scanner;

public class InsertionSort2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[5];

		/* Insere valores do vetor. */
		for (int n = 0; n < vetor.length; n++) {
			vetor[n] = sc.nextInt();
		}

		/* Ordena vetor */
		for (int i = 1; i < vetor.length; i++) {
			int a = vetor[i];
			int j = i - 1;
			
			/**/
			while (j >= 0 && vetor[j] > a) {
				vetor[j + 1] = vetor[j];
				vetor[j] = a;
				j--;
			}
			
		}

		for (int n = 0; n < vetor.length; n++) {
			System.out.println(vetor[n]);
		}

	}

}
