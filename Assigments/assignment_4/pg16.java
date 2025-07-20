import java.util.Scanner;
class Test{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);

  
   System.out.println(" Enter the number : ");
    int n = sc.nextInt();

    int i = 0;
    while( n >= 1){ 
      if(n%i == 0){
         int a = n/i;
         n = a;
         System.out.println(i);
       
        }
        else{
          i = 0;
        }
        i++;
     }
     
  }
  
}