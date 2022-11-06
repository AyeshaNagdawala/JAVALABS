// Bubble sort in Java

import java.util.Arrays;

class Main {

  // perform the bubble sort
  static void bubbleSort(int array[]) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++)
    
 
      for (int j = 0; j < n - i - 1; j++)
        if (array[j] > array[j + 1]) 
        {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public static void main(String args[]) {
      
    int[] array = { -2, 45, 0, 11, -9 , 6,6};
    
    // call method using class name
    Main.bubbleSort(array);
    
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(array));
  }
}
