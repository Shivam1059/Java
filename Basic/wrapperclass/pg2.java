//program 2-> "1,2,3,4,5,6,7,8,9,10";

class TestMain{
  public static void main(String args[]){
     String st = "1,2,3,4,5,6,7,8,9,10";
     String [] numberString = st.split(",");

    int sum = 0;
     for(int i=0; i<numberString.length; i++){
        sum += Integer.parseInt(numberString[i]);
     }
     System.out.println(sum);
  }
}