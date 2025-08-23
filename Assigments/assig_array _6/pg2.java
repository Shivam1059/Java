import java.util.Scanner;

class Test{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    int n = sc.nextInt();
   
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      System.out.println("Enter the number  "+i);
      arr[i] = sc.nextInt();
    }

    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();

    int max = 0;
    int min = arr[0];
    for(int i=0; i<n; i++){
       if(max < arr[i]){
          max = arr[i];
       }
       else if( min >  arr[i]){
        min = arr[i];
       }
    }
    System.out.println(" Min : "+min);
    System.out.println(" Max : "+max);
   }
}