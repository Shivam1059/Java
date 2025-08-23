import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    // for(int i=0; i<n; i++){
    //   System.out.print("Enter the number : ");
    //   arr[i] = sc.nextInt();
    // }
    // int occurence = 0;
    // for(int i=0; i<n; i++){
    //   for(int j=1; j<n; j++){
    //     if(arr[i] == arr[j]){
    //        occurence++;
    //      }
    //   }
    //   System.out.print(arr[i]+" ");
    // }
    // System.out.println();
    // System.out.print("Occurence of element is : "+occurence);

 for(int i=0; i<n; i++){
      System.out.print("Enter the number : ");
      arr[i] = sc.nextInt();
    }
     int count = 0;
     for (int i = 1; i<n; i++){
        for(int j = i-1 ; j<n; j++){
            if(arr[i] == arr[j]){
               count++;
            }
        }
     }

     System.out.print("occorance = "+ count);
  }
}