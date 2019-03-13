public class MyDriver{
  public static void main(String [] args){
    int [] myBest = {3,5,9,4,3,9,2,1,6,4,7,8,6,8,6};
    System.out.println(Quick.partition(myBest,0,myBest.length-1));
    System.out.println();
    for(int x: myBest){
      System.out.println(x);
    }
  }
}
