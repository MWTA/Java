package selectionSort;

/**
 * Francisco de Assis de Souza Rodrigues. 09 de março de 2014.
 */

/**
 * 
 * Ordenação por Seleção - a idéia dele é passar o menor valor para a primeira
 * posição, o segundo menor valor para segunda posição, e assim por diante.
 * 
 */

public class SelectionSort {

	/**
	 * Método principal que execulta a aplicação.
	 */
	public static void main(String args[]) {
		int[] array = { 1, 9, 6, 3, 7 };

		for (int i = 0; i < array.length; i++) {
			int posMenor = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[posMenor]) {
					posMenor = j;
				}
			}
			int aux = array[i];
			array[i] = array[posMenor];
			array[posMenor] = aux;
		}
	}

}
