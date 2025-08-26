//34. Write a java program to implement linear search
import java.util.Scanner;
import java.uiil.Arrays;
class LinerSearch{
    public void findElement(int arr[], int target){
        for(int i=0; i<arr.length; i++){
          if(arr[i] == target){
            return "Element is found ";
          }
        }
         
    } 
}

class TestMain{
  public static void main(String[] arrgs){
    int arr[] = {2,3,4,5,6,78,9,1};
    System.out.print(Arrays.toString(arr));
    System.out.println();

    System.out.print("Enter any element in target element  : ");
    int target = sc.nextInt();

    LinerSearch ls = new LinerSearch();
    ls.findElement(arr,target);



  }
}