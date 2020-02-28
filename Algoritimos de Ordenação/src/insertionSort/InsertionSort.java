package insertionSort;

/**
 * 
 * @author Francisco de Assis de Souza Rodrigues. 09 de março de 2014. 
 *
 */

/**
 * 
 * Ordenação por Inserção - a idéia é ir ordenando aos poucos, inserindo cada
 * elemento na sua posição.
 * 
 */
public class InsertionSort {

	/**
	 * 
	 */
	public static void main(String args[]) {

		int array[] = { 1, 2, 5, 8, 32, 9 };

		for (int i = 1; i < array.length; i++) {
			int a = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > a) {
				array[j + 1] = array[j];
				array[j] = a;
				j--;
			}
		}
	}
}
