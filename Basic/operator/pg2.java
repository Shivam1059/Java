//incompatible type possible lossy conversion from int to byte
//byte
class TestMain{
  public static void main(String args[]){
    byte a,b,c;
      a = 20;
      b = 30;
      c =  (byte) (a + b);

      System.out.println("Byte converstion : " + c);
  }
}