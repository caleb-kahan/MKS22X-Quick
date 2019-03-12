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
       swap(data,start,pivot);
       partition(data,start+1,end);
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
