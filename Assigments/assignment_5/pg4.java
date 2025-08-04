import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of arr : ");
    int size = sc.nextInt();

   int arr[] = new int[size];
    for(int i=0; i<size; i++){
      System.out.print("Enter "+i+" element : ");
      arr[i] = sc.nextInt();
    }
    
    System.out.println("Enter the element if you want to find : ");
    int a = sc.nextInt();
    for(int i=0; i<size; i++){
      if(arr[i] == a){
        System.out.println("Element is found");
        break;
      }else{
        System.out.println("Element is not found");
      }
    }

  }
}