
import java.util.Scanner;

// class Test{
//     private String data;

//     public Test(String data){
//        this.data = data;
//     }

//     public String getTrime(){
//       char arr[] = data.toCharArray();

//       for(int i=0; i<arr.length-1; i++){
//         if(arr[i] == ' ' && arr[i+1] == ' '){
//              arr[i] = '\0';
//         }
//       }
//       String s = new String(arr);
//       arr = s.toCharArray();
//       if(arr[0] == ' ')
//          arr[0] = '\0';

//        if(arr[arr.length-1] == ' ')
//         arr[arr.length-1] = '\0';

//         return new String(arr);  
//     }
// }


class Test{
      private String data;

      public Test(String data){
        this.data = data;
      }

      public String getTrime(){
        char arr[] = data.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            if(arr[start] != arr[end]){
               return new String(arr);
            }else{
              start++;
              end--;
            }
        }
      }
}

class TestMain{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the string : ");
      String str = sc.nextLine();
        System.out.println("before string : "+str);
      Test obj = new Test(str);
      String result = obj.getTrime();
      System.out.println("Update string is : "+ result);
  }
}