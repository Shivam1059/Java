import java.util.Scanner;


class Duplicate{
   private int arr[];

   public Duplicate(int arr[]){
    this.arr = arr;
   }

    public void  removeDup(){
       for(int i=1; i<arr.length; i++){
           if(arr[i] != arr[i-1]){
            System.out.print(arr[i-1]+" ");
           }else{
            continue;
           }
        }
    }
}

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of arr : ");
    int n = sc.nextInt();
   
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      System.out.println("Enter the element "+i);
      arr[i] = sc.nextInt();
    }
    Duplicate obj = new Duplicate(arr);
    obj.removeDup(); 
  }
}