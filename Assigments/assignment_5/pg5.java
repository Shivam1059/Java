// maximum
// import java.util.Scanner;

// class Test{
//   public static void main(String arga[]){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the number  : ");
//     int size  = sc.nextInt();
//     int arr[] = new int[size];

//     for(int i=0; i<size; i++){
//       System.out.println("Enter the number  "+(i+1) + " element : "  );
//       arr[i] = sc.nextInt();
//     }
//    int max = arr[0];
//    for(int i=1; i<size; i++){
//       if(arr[i] > max){
//         max = arr[i];
//       }
//       System.out.print("Maximum value : "+ max);
//    }

//   }
// }

import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Entert the num : ");
    int num = sc.nextInt();

    int arr[] = new int[num];

    for(int i=0; i<num; i++){
       System.out.print("Enter the element : ");
       arr[i] = sc.nextInt();
    }

   for(int i=0; i<num; i++){
    System.out.println(" "+arr[i]);
   }

   for(int i=0; i<num; i++){
    if(arr[i]%5 == 0){
      arr[i] = 0;
    }
   }

   for(int i=0; i<num; i++){
    System.out.print(" "+arr[i]);
   }
  }
}