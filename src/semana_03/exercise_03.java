package semana_03;

public class exercise_03 {
	// Criação de quatro versões com classes internas
	public static void main(String[] args) {
		AlgoritmosBusca.InnerClass1 innerClass1 = new AlgoritmosBusca().new InnerClass1();
		AlgoritmosBusca.InnerClass2 innerClass2 = new AlgoritmosBusca().new InnerClass2();
		AlgoritmosBusca.InnerClass3 innerClass3 = new AlgoritmosBusca().new InnerClass3();
		AlgoritmosBusca.InnerClass4 innerClass4 = new AlgoritmosBusca().new InnerClass4();

		// Exemplo de uso das classes internas
		int[] array = { 5, 2, 9, 1, 5, 6 };
		innerClass1.insertionSort(array);
		innerClass2.insertionSort(array);
		innerClass3.insertionSort(array);
		innerClass4.insertionSort(array);
	}
}

// Classe com quatro versões de InsertionSort usando classes internas
class AlgoritmosBusca {

	// Primeira classe interna
	public class InnerClass1 {
		public void insertionSort(int[] array) {
			// Implementação do InsertionSort
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

	// Segunda classe interna
	public class InnerClass2 {
		public void insertionSort(int[] array) {
			// Implementação do InsertionSort
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

	// Terceira classe interna
	public class InnerClass3 {
		public void insertionSort(int[] array) {
			// Implementação do InsertionSort
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

	// Quarta classe interna
	public class InnerClass4 {
		public void insertionSort(int[] array) {
			// Implementação do InsertionSort
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
}