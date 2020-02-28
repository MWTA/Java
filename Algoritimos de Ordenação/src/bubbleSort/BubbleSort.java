package bubbleSort;

/**
 * 
 * @author Francisco de Assis de Souza Rodrigues. 09 de março de 2014..
 * 
 */

/**
 * 
 * Algoritimo da Bolha - o funcinamento lembra a forma como as bolhas de um
 * tanque de água procuram seu próximo nivel. Ele funciona permutando
 * repetidamente elementos adjacentes que estão fora de ordem.
 * 
 */
public class BubbleSort {

	/**
	 * Método que executa a aplicação.
	 */
	public static void main(String args[]) {

		Integer array[] = { 5, 3, 8, 7, 2, 4, 1, 9 };

		// Loop.
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > 0; j++) {
				// Condição.
				if (array[j] < array[j - 1]) {
					int aux = array[j];
					array[j] = array[j - 1];
					array[j - 1] = aux;
				}
			}
		}/* FIM Loop */

	}/* FIM Método Main */

}/* FIM Class */
