public class Quick{
  public static int quickselect(int []data, int k){
    return 0;
   }
   public int parttition ( int [] data, int start, int end){
     if(data==0){
       int difference = end - start + 1;
       int add = (int)(Math.random()*difference);
       int pivot = start+add;
       int temp = data[0];
       data[0]=data[pivot];
       data[pivot]=temp;
       partition(data,start+1,end);
     }

   }
   public void swap(int [] data, int index1, int index2){
     
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
