import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of arr : ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    int even_Sum = 0;
    int odd_Sum = 0;
    
    for(int i=0; i<size; i++){
      System.out.print("Enter "+(i+1)+" element : ");
      arr[i] = sc.nextInt();
    }

    for(int i=0; i<size; i++){
      if(arr[i]%2 == 0){
        even_Sum += arr[i];
      }else{
         odd_Sum += arr[i];
      }
    }

    System.out.println("Total even_sum : "+even_Sum);
    System.out.println("Total odd_sum : "+odd_Sum);
  }
}