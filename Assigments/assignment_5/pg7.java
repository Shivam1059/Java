import java.util.Scanner;
 class Test{
  public static void main(String agrs[]){
    Scanner sc = new Scanner(System.in);

    int arr[] = {10, 20, 30, 40, 50, 60, 70, 80};

    System.out.println("Enter the element : ");
    int target  = sc.nextInt();

    int size = arr.length;
     int low = 0;
     int high = size-1;
  
     while(low <= high){
      int mid =( low + high)/2;

      if(arr[mid] == target){
        System.out.println("Element is found ");
         break;
      }
      else if (target > arr[mid]){
          low = mid + 1;
        }
        else{
           high  = mid - 1;
        }
      } 
      if(low > high) System.out.println("Element is not found ");
    }
  }
