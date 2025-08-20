import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the array length : ");
    int n =  sc.nextInt();

    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      System.out.println("Enter the element : "+i);
      arr[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }

    int occurence = 0;
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
       if(arr[i] == arr[j]){
        occurence++;
       }
      }
    }
    System.out.print("ocuurence : "+occurence);

   
  }
}