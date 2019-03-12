public class Quick{
  public static int quickselect(int []data, int k){
    return 0;
   }
   int partition ( int [] data, int start, int end){
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
