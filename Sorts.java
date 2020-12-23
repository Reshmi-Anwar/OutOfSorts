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
    for(int i = 0; i < data.length - 1; i++){
      int index = i;
      for(int j = i; j < data.length; j++){
        if(data[j] < data[index]){
          index = j;
        }
      }
      int swap = data[i];
      data[i] = data[index];
      data[index] =  swap;
    }
  }

  public static void insertionSort(int[] data){
    for(int i = 1; i < data.length; i++){
      int x = data[i];
      int y = i - 1;
      while(x < data[y]){
        data[y + 1] = data[y];
        y--;
        if(y==-1){
          break;
        }
      }
      data[y + 1] = x;
    }
  }
}
