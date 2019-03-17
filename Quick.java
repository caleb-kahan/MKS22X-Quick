public class Quick{
  public static int quickselect(int []data, int k){
    return quickselect(data, 0, data.length-1, k);
  }
  private static void insertionSort(int [] data, int start, int end){
    for(int i =start;i<=end;i++){
      if(data[i]<data[i-1]){
        int from = i-1;
	while(from>=start && data[from]>data[i]) from--;
	insert(data,from+1,i);
      }
    }
  }
  private static void insert(int [] data, int from, int to){
    int temp = data[from];
    data[from] = data[to];
    for(int j=from+1;j<=to;j++){
      int LocTemp = data[j];
      data[j]=temp;
      temp = LocTemp;
      
    }
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
  /*public static void quicksort(int[] data, int start, int end) {
      if(start>=end) return;
      int pivot = partition(data,start,end);
      quicksort(data,start,pivot-1);
      quicksort(data,pivot+1,end);
  }*/
  public static void quicksort(int[] data, int start, int end) {
      if(end-start<25){
	  insertionSort(data,start,end);
	  return;
      }
      if(start>=end) return;
      int [] pivots = partitionDutch(data,start,end);
      quicksort(data,start,pivots[0]-1);
      quicksort(data,pivots[1]+1,end);
  }

  public static int[] partitionDutch(int[] data,int lo, int hi){
    int lt = lo;
    int i  = lo+1;
    int gt = hi;

    int central = (lo+hi)/2;
    int pivot;
    int pivotValue = (data[lo] + data[central] + data[hi])
                   - Math.max(data[lo], Math.max(data[central], data[hi]))
                   - Math.min(data[lo], Math.min(data[central], data[hi]));
    if(pivotValue == data[lo])
      pivot = lo;
    else if(pivotValue == data[central])
      pivot = central;
    else
      pivot = hi;


    data = swap(data, pivot, lt);

    while(i<=gt) {
      if(pivotValue==data[i]){
          i++;
      }
      else if(data[i] < pivotValue){
        data = swap(data, i, lt);
        i++;
	      lt++;
      }
      else{
        data = swap(data, i, gt);
        gt--;
      }
    }

    return new int [] {lt,gt};
    //your code
    //return an array [lt,gt]
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
