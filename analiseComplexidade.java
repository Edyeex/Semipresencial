import java.util.Random;

/**
  * Análise dos Resultados
 *  * Registre os dados obtidos para cada combinação de algoritmo e cenário:
 *  *
 *  * Comparações.
 *  * Trocas.
 *  * Tempo de execução.
 *  * Dicas para análise:
 *  *
 *  * Espera-se que o Merge Sort e o Quick Sort sejam mais rápidos em grandes tamanhos devido às complexidades mais eficientes.
 *  * O Bubble Sort, Selection Sort, e Insertion Sort são mais adequados para arrays pequenos ou ordenados.
 *  */


public class analiseComplexidade {

  //estrutura de um método
  public static void bubbleSort(int[] array) {
	int comparisons = 0;
	int swaps = 0;
	long startTime = System.nanoTime();

	for (int i = 0; i < array.length - 1; i++) {
	  for (int j = 0; j < array.length - i - 1; j++) {
		comparisons++;
		if (array[j] > array[j + 1]) {
		  swaps++;
		  int temp = array[j];
		  array[j] = array[j + 1];
		  array[j + 1] = temp;
		}
	  }
	}

	long endTime = System.nanoTime();
	System.out.println("Bubble Sort - Comparisons: " + comparisons + ", Swaps: " + swaps +
			", Time: " + (endTime - startTime) / 1e9 + " seconds");
  }

  //Ordenado (Crescente)
  public static int[] generateSortedArray(int size) {
	int[] array = new int[size];
	for (int i = 0; i < size; i++) {
	  array[i] = i + 1;
	}
	return array;
  }

	//Ordenado Inversamente (Decrescente)
  public static int[] generateReverseArray(int size) {
	int[] array = new int[size];
	for (int i = 0; i < size; i++) {
	  array[i] = size - i;
	}
	return array;
  }

	//Aleatório
  public static int[] generateRandomArray(int size) {
	int[] array = new int[size];
	Random random = new Random();
	for (int i = 0; i < size; i++) {
	  array[i] = random.nextInt(size);
	}
	return array;
  }

  public static void main(String[] args) {
	int[] sizes = {100, 10000, 100000};

	for (int size : sizes) {
	  System.out.println("\nArray size: " + size);

	  int[] sorted = generateSortedArray(size);
	  int[] reversed = generateReverseArray(size);
	  int[] random = generateRandomArray(size);

	  System.out.println("\n Bubble Sort:");
	  bubbleSort(sorted.clone());
	  bubbleSort(reversed.clone());
	  bubbleSort(random.clone());

	  System.out.println("\n Selection Sort:");
	  selectionSort(sorted.clone());
	  selectionSort(reversed.clone());
	  selectionSort(random.clone());

	  //Insertion Sort, Merge Sort e Quick Sort vão ser a mesma coisa
	}
  }


}




