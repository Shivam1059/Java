//deadlock case
class A{
    synchronized public void m1(B s){
      for(int i=0; i<3; i++){
        System.out.println("Thread m1"+i);
      }
      s.x2();
    }
    synchronized public void m2(){
      for(int i=0; i<3; i++){
        System.out.println("Thread m1"+i);
      }
    }
}
class B{
    synchronized public void x1(A t){
      for(int i=0; i<3; i++){
        System.out.println("Thread x1"+i);
      }
      t.m2();
    }
    synchronized public void x2(){
      for(int i=0; i<3; i++){
        System.out.println("Thread x2"+i);
      }
    }
}

class First extends Thread{
    private A obja;
    private B objb;

   public First(A obja, B objb){
     this.obja = obja;
     this.objb = objb;
   }
  
  public void run(){
    obja.m1(objb);
  }
}
class Second extends Thread{
    private A obja;
    private B objb;

   public Second(A obja, B objb){
     this.obja = obja;
     this.objb = objb;
   }
  
  public void run(){
    objb.x1(obja);
  }
}

class TestMain{
  public static void main(String args[]){
    A task1 = new A();
    B task2 = new B();

    First f1 = new First(task1, task2);
    Second f2 = new Second(task1, task2);

    f1.start();
    f2.start();

  }
}