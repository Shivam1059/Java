import java.util.Scanner;

class Test{
  public static void  main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter data size : ");
    int n = sc.nextInt();

    //declaration of array
    int arr[] = new int[n];

    for(int i=0; i<n; i++){
      System.out.println("Enter  "+(i+1)+"element");
      arr[i] = sc.nextInt();
    }
    
    System.out.println("Given data ....");
    for(int i=0; i<n; i++)
     System.out.println(arr[i]);

  }
}