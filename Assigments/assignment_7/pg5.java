import java.util.Scanner;

class Test{
  public static void main(String args[]){

     int arr[][] = {{10, 20, 30},
                   {40, 50, 60},
                   {70, 80, 90}};
    
    int even_sum = 0;
    int odd_sum = 0;
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        if(j%2 == 0){
          even_sum++;
        }else{
          odd_sum++;
        }
      }
    }
    System.out.println("Even sum : "+even_sum);
    System.out.print("Odd sum : "+odd_sum);
  }
}