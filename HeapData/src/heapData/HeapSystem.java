/**
 * @author      Yulong Fang <jocstech@gmail.com>
 * @version     1.0                 
 * @since       2014-10-14   
 * @usage       Test the heap structure       
 */
package heapData;

public class HeapSystem {

	
	public static void main(String[] args) 
	{
		Comparable[] unsortedArray = {12,34,23,56,23,89,5,33,2,75,13,45,67,43,56,34,78,9,24};
		int ArraySize = unsortedArray.length;
		
		// Testing of our Heap data
		System.out.println("Before Heap Constructed:\n");
		printArray(unsortedArray);
		MaxHeapData maxHeap = new MaxHeapData(unsortedArray);
		System.out.println("\nAfter Heap Constructed:\n");
		maxHeap.printAsArray();
		System.out.println("\n\nHeap on tree:");
		maxHeap.printAsTree();
		
		
	}
	
	public void hashsort(Comparable array[])
	{
		MaxHeapData maxHeap2 = new MaxHeapData(array);
		maxHeap2.Heap_Sort();
		maxHeap2.printAsArray();
	}
	
	public static void printArray(Comparable[] unsortedArray)
	{
		for(Comparable i:unsortedArray)
		{
			System.out.print("["+i+"] ");
		}
		    System.out.print("\n");
	}

}
