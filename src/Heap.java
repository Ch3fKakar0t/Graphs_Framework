import java.util.Scanner;

public class Heap extends BinaryTree {

	private static int heapSize;
	private static int[] theHeap;
	private int maxHeap;

	public Heap(int[] theHeap) {
		super();
		Heap.theHeap = theHeap;
	}

	public int getHeapSize() {
		return heapSize;
	}

	public void setHeapSize(int heapSize) {
		Heap.heapSize = heapSize;
	}

	public int[] getTheHeap() {
		return theHeap;
	}

	public void setTheHeap(int[] theHeap) {
		Heap.theHeap = theHeap;
	}

	public int getMaxHeap() {
		return maxHeap;
	}

	public void setMaxHeap(int maxHeap) {
		this.maxHeap = maxHeap;
	}

	public static int Left(int i) {
		return 2 * i + 1;
	}

	public static int Right(int i) {
		return 2 * i + 2;
	}

	public static int Parent(int i) {
		return (i / 2);
	}

	/*
	 * Heapify algorithms found in Introduction to Algorithms CLRS
	 */

	public static void buildMaxHeap(int[] theHeap) {
		heapSize = theHeap.length - 1;
		for (int n = (int) Math.floor(heapSize / 2); n >= 0; n--)
			maxHeapify(theHeap, n);
	}

	public static void maxHeapify(int[] theHeap, int i) {
		int left = Left(i);
		int right = Right(i);
		int largest = i;

		if (left <= heapSize && theHeap[left] > theHeap[i])
			largest = left;
		else
			largest = i;

		if (right <= heapSize && theHeap[right] > theHeap[largest])
			largest = right;

		if (largest != i) {
			int temp = theHeap[i];
			theHeap[i] = theHeap[largest];
			theHeap[largest] = temp;
			maxHeapify(theHeap, largest);
		}
	}

	public static void heapSort(int[] theHeap) {
		buildMaxHeap(theHeap);
		for (int i = heapSize; i > 0; i--) {
			int temp = theHeap[0];
			theHeap[0] = theHeap[i];
			theHeap[i] = temp;

			heapSize = heapSize - 1;
			maxHeapify(theHeap, 0);
		}
	}

	// public void insertInto(int index, HeapVertex heapData) {
	// theHeap[index] = heapData;
	// }
	//
	// // Generate random ints for heap
	// public void generateRandInts(int randNum) {
	// HeapVertex randomInt;
	//
	// for (int i = 0; i < this.maxHeap; i++) {
	// randomInt = new HeapVertex((int) (Math.random() * randNum) + 1);
	//
	// this.insertInto(i, randomInt);
	//
	// incrementHeap();
	//
	// }
	// }
	//
	// public void incrementHeap() {
	// listInt++;
	//
	// }

//	public static void main(String[] args) {
//
//		/*
//		 * This was my test heap to check if everything was working properly
//		 */
//		// int[] testHeap = { 5, 13, 2, 25, 7, 17, 20, 8, 4 };
//		// heapSort(testHeap);
//		// for (int i = 0; i < testHeap.length; i++) {
//		// System.out.println(testHeap[i] + "");
//		// }
//
//		/*
//		 * This part of the main method will allow you to choose the number of
//		 * elements and input your own integers into the tree.
//		 */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("HeapSort Test\n");
//		int n, i;
//
//		System.out.println("Enter number of elements:");
//		n = scan.nextInt();
//
//		int testHeap[] = new int[n];
//
//		System.out.println("\nEnter your " + n + " elements:");
//		for (i = 0; i < n; i++)
//			testHeap[i] = scan.nextInt();
//
//		heapSort(testHeap);
//
//		System.out.println("\nElements after HeapSort: ");
//		for (i = 0; i < n; i++)
//			System.out.print(testHeap[i] + " ");
//		System.out.println();
//	}
}
