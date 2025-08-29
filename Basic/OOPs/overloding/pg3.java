class Test{
  public void name(String str){
     System.out.print(str);
  }
}
class best extends Test{
  @override
  public void name(String str1){
     System.out.print(str1);
  }
}
class TestMain{
  public static void main(String[] args){
     Test t = new best();
     t.name("Shivam ");
  }
}





















































