//34. Write a java program to implement linear search
import java.util.Scanner;
import java.util.Arrays;
class LinerSearch{
    public boolean findElement(int arr[], int target){
      boolean result  = false;
        for(int i=0; i<arr.length; i++){
          if(arr[i] == target){
            return true;
          }
        }
        return false;
    } 
}

class TestMain{
  public static void main(String[] arrgs){
    Scanner sc = new Scanner(System.in);
    int arr[] = {2,3,4,5,6,78,9,1};
    System.out.print(Arrays.toString(arr));
    System.out.println();

    System.out.print("Enter any element in target element  : ");
    int target = sc.nextInt();

    LinerSearch ls = new LinerSearch();
    boolean status  =   ls.findElement(arr,target);
    if(status){
      System.out.print("Eelment is found ");
    }else{
         System.out.print("Eelment is not found ");
    }
  }
}