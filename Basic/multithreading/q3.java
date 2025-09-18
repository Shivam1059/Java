class Task{
  synchronized public void m1(){
    for(int i=0; i<5; i++){
      System.out.println("Thread m1...");
    }
  }
  synchronized public void m2(){
    for(int i=0; i<3; i++){
      System.out.println("Thread m2...");
    }
  }

  public void m3(){
    for(int i=0; i<3; i++){
      System.out.println("Thread m3...");
    }
  }
}


class A extends Thread{
    Task obj = null;
    public A(Task obj){
      this.obj = obj;
    } 
   public void run(){
    obj.m1();
   }
}

class B extends Thread{
    Task obj1 = null;
    public B(Task obj1){
      this.obj1 = obj1;
    } 
   public void run(){
    obj1.m2();
   }
}

class C extends Thread{
    Task obj2 = null;
    public C(Task obj2){
      this.obj2 = obj2;
    } 
   public void run(){
    obj2.m3();
   }
}

class TestMain{
  public static void main(String args[]){
     Task t = new Task();
     Thread t1 = new A(t);
     Thread t2 = new B(t);
     Thread t3 = new C(t);
     t1.start();
     t2.start();
     t3.start();
  }
}