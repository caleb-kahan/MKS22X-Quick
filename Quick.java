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
    if(data[start]>=data[central] && data[start] <= data[end]) pivot = start;
    else if(data[central]>data[start] && data[central]<data[end]) pivot = central;
    else pivot = end;
    /*int difference = end - start + 1;
    int add = (int)(Math.random() * difference);
    int pivot = start + add;*/

    data = swap(data, pivot, start);
    pivot = start++;

    while(start <= end) {
      while(start<=end && data[pivot] >= data[start]){
        boolean fifty_fifty = Math.random()>0.5;
        if(data[pivot]==data[start] && fifty_fifty) break;
        start++;
      }
      if(start<=end){
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

  private static void printArray(int [] printer){
	System.out.print("[");
	for(int x: printer)
		System.out.print(x + " , ");
	System.out.println("]");
  }
}
