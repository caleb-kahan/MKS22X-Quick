public class Quick{
  public static int quickselect(int []data, int k){
    int pivot = partition(data,0,data.length);
    while(pivot!=k){
      if(pivot>k){
        int size = data.length-pivot-1;
        int [] returner = new int[size];
        for(int i = data.length-1, j=0;i>data.length-1-size;i--,j++){
          returner[j]=data[i];

        }
      }
        pivot = partition(data,0,data.length);
    }
    return data[pivot];

   }
    public static int partition ( int [] data, int start, int end){
     if(data==0){
       int difference = end - start + 1;
       int add = (int)(Math.random()*difference);
       int pivot = start+add;
       data = swap(data,start,pivot);
       return partition(data,start+1,end);
     }
     int temp = start;
     while(start<end && data[start]<=data[0]) start++;
     while(end>start && data[end]>data[pivot]) end--;
     for(int i=start;i<=end;i++){
       if(data[i]<=data[0]){
         data = swap(data, i, start);
         return partition(data,start+1,end);
       }
     }
     //Everthing's done at this point, woohoo
     boolean swapWithStart = data[0]>=data[start];
     if(swapWithStart){
       return start;
     }
     return start-1;
   }
   public static int [] swap(int [] data, int index1, int index2){
     int temp = data[index1];
     data[index1]=data[index2];
     data[index2]=temp;
     return data;
   }
 }
