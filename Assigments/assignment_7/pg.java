import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);


    System.out.println("Entet the row size = ");
    int row_n = sc.nextInt();
    System.out.println("Entet the col size = ");
    int col_n = sc.nextInt();


    int arr[][] = new int[row_n][col_n];
    for(int i=0; i<row_n; i++){
      System.out.print("Entet the "+i+" st row element : ");
      for(int j=0; j<col_n; j++){
          arr[i][j] = sc.nextInt();
      }
    }


     for(int i=0; i<row_n; i++){
      for(int j=0; j<col_n; j++){
          System.out.print(arr[i][j]+" ");
      }
               System.out.println();
    }
     for(int i=0; i<row_n; i++){
      for(int j=0; j<col_n; j++){
        if(i==j){
          System.out.print(arr[i][j]+" ");
        }
      }
               System.out.println();
    }
  }
}