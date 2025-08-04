import java.util.Scanner;

 class Test{
  public  static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of arr : ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    for(int i=0; i<size; i++){
      System.out.print("Enter "+(i+1)+" element  : ");
       arr[i] = sc.nextInt();
    }

    int sum = 0;
    for(int i=0; i<size; i++){
      System.out.println(arr[i]);
      sum += arr[i];
    }

    System.out.print("Total sum : "+sum);
  }
}
