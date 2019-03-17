public class MyDriver{
  public static void main(String [] args){
    int [] myBest = {6,2,2,3,4,1,1,3,5,5,5,5,6,7,2,1,5};
    int [] printer = Quick.partitionDutch(myBest,0,myBest.length-1);
    System.out.println(printer [0] + "  "+ printer[1]);
    System.out.println();
    for(int x: myBest){
      System.out.println(x);
    }
  }
}
