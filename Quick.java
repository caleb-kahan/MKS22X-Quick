public class Quick{
  public static int quickselect(int []data, int k){
    return 0;
   }
   public int partition ( int [] data, int start, int end){
     if(data==0){
       int difference = end - start + 1;
       int add = (int)(Math.random()*difference);
       int pivot = start+add;
       while(start<=end && data[start]<=data[pivot]){
        start++;
       }
       data = swap(data,start,pivot);
       return partition(data,start+1,end);
     }
     int pivot = start-1;
     while(start<=end && data[start]<=data[pivot]){
      start++;
     }
     if(start-1>pivot)data = swap(data,start-1,pivot);
     while(end>=start && data[end]>data[pivot]){
      end--;
     }
     



   }
   public int [] swap(int [] data, int index1, int index2){
     int temp = data[index1];
     data[index1]=data[index2];
     data[index2]=temp;
     return data;
   }
   public int partitionH ( int [] data, int start, int end){
     int difference = end - start + 1;
     int add = (int)(Math.random()*difference);
     int pivot = start+add;
     for(int i=start;i<end;i++){
       if(data[i]>data[pivot] && pivot>i){
         int temp = data[i];
         data[i]=data[pivot];
         data[pivot]=temp;
       }
     }
     return pivot;
   }
 }
