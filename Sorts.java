public class Sorts{

  public static void bubbleSort(int[] data){
    int lenList = data.length;
    for(int i = 0; i < lenList - 1; i++){
      for(int j = 0; j < lenList - i - 1; j++){
        if (data[j] > data[j+1]){
          int swap = data[j];
          data[j] = data[j + 1];
          data[j + 1] = swap;
        }
      }
    }
  }

  public static void selectionSort(int[] data){
    
  }
}
