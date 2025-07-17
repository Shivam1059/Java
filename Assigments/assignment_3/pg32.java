import java.util.Scanner;

class check{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter charcter : ");
      char ch = sc.next().charAt(0);

      switch(ch){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u': System.out.println("Vowel");
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U': System.out.println("Vowel");break;
        default: System.out.println("Not a Vowel "); break;
      }
  }
}