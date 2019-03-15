public class Quick{
  public static int quickselect(int []data, int k){
    return quickselect(data, 0, data.length-1, k);
  }

  public static int quickselect(int[] data, int start, int end, int k) {
      if(! (k>=start && k<=end)) return 0;
  	  int pivot = partition(data, start, end);
      if(pivot==k) return data[pivot];
      return quickselect(data, start, pivot-1, k) + quickselect(data, pivot+1, end, k);
  }
  public static void quicksort(int []data){
    quicksort(data,0,data.length-1);
  }
  public static void quicksort(int[] data, int start, int end) {
      if(start>=end) return;
      int pivot = partition(data,start,end);
      quicksort(data,start,pivot-1);
      quicksort(data,pivot+1,end);
  }

  public static int partition ( int [] data, int start, int end) {
    int central = (start+end)/2;
    int pivot;
    int pivotValue = (data[start] + data[central] + data[end])
                   - Math.max(data[start], Math.max(data[central], data[end]))
                   - Math.min(data[start], Math.min(data[central], data[end]));
    if(pivotValue == data[start])
      pivot = start;
    else if(pivotValue == data[central])
      pivot = central;
    else
      pivot = end;
    

    data = swap(data, pivot, start);
    pivot = start++;
    int dataPivot = data[pivot];
    boolean flip = false;

    while(start <= end) {
      if(dataPivot==data[start]){
	if(flip){
	  data = swap(data, start, end);
	  end--;
        }
        else {
          start++;
	}
      }
      else if(dataPivot > data[start]){
        start++;
      }
      else{
        data = swap(data, start, end);
        end--;
      }
      flip = !flip;
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

  private static void printArray(int [] printer){
	System.out.print("[");
	for(int x: printer)
		System.out.print(x + " , ");
	System.out.println("]");
  }
}
