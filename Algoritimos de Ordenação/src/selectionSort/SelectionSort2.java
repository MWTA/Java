package selectionSort;

import java.util.Scanner;

public class SelectionSort2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[5];

		for (int n = 0; n < vetor.length; n++) {
			vetor[n] = sc.nextInt();
		}

		/**/
		for (int i = 0; i < vetor.length; i++) {
			int posMenor = i;
			for (int z = 0; z < vetor.length; z++) {
				if (vetor[z] < posMenor) {
					int aux = vetor[i];
					vetor[i] = vetor[posMenor];
					vetor[posMenor] = aux;
				}
			}
		}

		for (int x = 0; x < vetor.length; x++) {
			System.out.println(vetor[x] + " ");
		}
	}
}
