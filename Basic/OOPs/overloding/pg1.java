class A{
     void name(){
          System.out.print("Shivay");
     }
}

class B extends A{
  @Override
     void name(){
         System.out.print("Shivam - Ahirwar");
     }
}

class TestMain{
  public static void main(String[] args){
     A obj = new B();
     obj.name();
  }
}