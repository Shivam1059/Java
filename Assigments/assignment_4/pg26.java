// import java.util.Scanner;
// class Test{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter start num : ");
//     int start = sc.nextInt();
//     System.out.println("Enter end  num : ");
//     int end = sc.nextInt();

//     int i = start;
//     while(i <= end){
//       System.out.println(i);
//       i=i+3;
//     }
//   }
// }


import java.util.Scanner;

class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the num : ");
      int term = sc.nextInt();
      int i = term*(-1);
      while(i <= term){
        if(i%3 == 0){
          System.out.println(i);
        }
        i++;
      }
    }
} 