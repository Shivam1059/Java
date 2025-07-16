import java.util.Scanner;

class digit{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the 4 digit number : ");
     int digit = sc.nextInt();

    int reverse_num = 0;
     while(digit > 0){
        int lastdigit  = digit%10;
        reverse_num = (reverse_num*10)+lastdigit;
        digit = digit/10;
     }
    
    System.out.println("reverse number of digit : "+reverse_num);
   }
}