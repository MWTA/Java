package algoritmoDePesquisaBinaria;

/**
 * 
 * @author Francisco de Assis de Souza Rodrigues. 09 de março de 2014.
 *
 */

/**
 * 
 * Algoritmo de pesquisa em conjuntos de dados ordenados. Baseia-se na idéia de
 * dividir para conquistar.
 * 
 * Caso o elemento não seja o elemento do meio do conjunto, ou ele está acima ou
 * abaixo, e um novo meio é criado baseado nessa informação.
 * 
 * Muito mais eficiente que um algoritmo de busca linear (procurar um a um desde
 * o início).
 * 
 */

public class AlgoritmoDePesquisaBinaria {
	/**
 * 
 */
	public static void main(String args[]) {

		int array[] = { 9, 4, 5, 7, 6, 3, 2 };
		int num = 0;
		int primeiro = 0;
		int ultimo = array.length - 1;
		int meio = (primeiro + ultimo) / 2;

		while (array[meio] != num && ultimo >= primeiro) {
			if (num > array[meio]) {
				primeiro = meio + 1;
			} else {
				ultimo = meio - 1;
			}
			meio = (primeiro + ultimo) / 2;
		}

		if (array[meio] != num) {
			System.out.println("numero não encontrado");
		}
	}
}
