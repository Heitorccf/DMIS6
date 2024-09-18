package semana_03;

import java.util.Scanner;

public class exercise_01 {
	// Método para calcular o tempo de execução do algoritmo
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar o tamanho do arranjo
		System.out.print("Digite o tamanho do arranjo: ");
		int n = scanner.nextInt();

		int[] array = new int[n];

		// Solicitar os elementos do arranjo
		System.out.println("Digite os elementos do arranjo:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		long startTime = System.nanoTime(); // Iniciar a contagem do tempo de execução
		insertionSort(array); // Chamar o método de ordenação
		long endTime = System.nanoTime(); // Finalizar a contagem do tempo de execução

		// Exibir o arranjo ordenado
		System.out.println("Arranjo ordenado:");
		for (int num : array) {
			System.out.print(num + " ");
		}

		// Calcular e exibir o tempo de execução
		long executionTime = endTime - startTime;
		System.out.println("\nTempo de execução: " + executionTime + " nanosegundos");
	}

	// Método de ordenação InsertionSort
	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}
}