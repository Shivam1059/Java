class Insertion{
  private int arr[];

  public Insertion(int arr[]){
    this.arr = arr;
  }
  public  void sortArray(){
 //  int arr[] = {3,9,6,8,4,52,30};
    for(int i=0; i<arr.length; i++){
      int j = i;
      while( j > 0 &&  arr[j-1] > arr[j] ){
         int temp = arr[j-1];
         arr[j-1]  = arr[j];
         arr[j] = temp;
         j--;
      }
    }
  }
}
class Main{
  public static void main(String[] args){
     int arr[] = {3,9,6,8,4,52,30};
    Insertion s = new Insertion(arr);
    s.sortArray();
    for(int i : arr){
      System.out.print(i+" ");
    }
  } 
}

