class persion{
    private String name;
    private int age;

    public persion(String name, int age){
      this.name = name; 
      this.age  = age; 
    }

    public persion(){};

    public void setN(String name){
      this.name = name;
    }
    public void setA(int age){
      this.age = age;
    }

    public void getN(){
      System.out.print(" Name : "+name);
    }
    public void getA(){
      System.out.print(" age : "+age);
    }
}

class Testmain{
   public static void main(String args[]){
     persion obj = new persion();
     obj.setN("Shivay");
     obj.setA(20);
     obj.getN();
     obj.getA();
   }
}