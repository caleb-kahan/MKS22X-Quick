public class Quick{
  public static int quickselect(int []data, int k){
    int pivot = partition(data,0,data.length-1);
    while(pivot!=k){
      if(pivot>k){
        int size = data.length-pivot-1;
        int [] returner = new int[size];
        for(int i = data.length-1, j=0; i>data.length-1-size; i--,j++) {
          returner[j]=data[i];
          return quickselect(returner,k-(data.length-size));
        }
      }
      else{
        int size = data.length-pivot-1;
        int [] returner = new int[size];
        for(int i = data.length-1, j=0; i>data.length-1-size; i--,j++) {
          returner[j]=data[i];
          return quickselect(returner,k-(data.length-size));
        }
      }
    }
    return data[pivot];
  }

  public static int partition ( int [] data, int start, int end) {
    int difference = end - start + 1;
    int add = (int)(Math.random() * difference);
    int pivot = start + add;

    data = swap(data, pivot, start);
    pivot = start++;

    while(start <= end) {
      if(data[pivot] >= data[start]) {
        start++;
      }
      else {
        data = swap(data, start, end);
        end--;
      }
    }

    data = swap(data, pivot, end);
    return end;
  }

  public static int [] swap(int [] data, int index1, int index2){
    int temp = data[index1];
    data[index1] = data[index2];
    data[index2] = temp;
    return data;
  }
}
