 class Task1{
       synchronized  public void  m1(){
        for(int i=0; i<3; i++){
          System.out.println("Thread 1 - m1");
        }
      }
      synchronized public void m2(){
        for(int i=0; i<3; i++){
          System.out.println("Thread 1 -m2");
        }
      }
 }
 class Task2{
      synchronized  static public void m3(){
        for(int i=0; i<3; i++){
          System.out.println("Thread 2 -m3");
        }
      }
      synchronized  static public void m4(){
        for(int i=0; i<3; i++){
          System.out.println("Thread 2 -m4");
        }
      }
 }
 class A extends Thread{
    private Task1 name;
    public A(Task1 name){
      this.name = name;
    }
     public void run(){
        name.m1();
     }
 }
 class B extends Thread{
    private Task1 name;
    public B(Task1 name){
      this.name = name;
    }
     public void run(){
        name.m2();
     }
 }
 class C extends Thread{
    private Task2 name;
    public C(Task2 name){
      this.name = name;
    }
     public void run(){
        Task2.m3();
     }
 }
 class D extends Thread{
    private Task2 name;
    public D(Task2 name){
      this.name = name;
    }
     public void run(){
      Task2.m4();
     }
 }

 class TestMain{
  public static void main(String args[]){
     Task1 t1 = new Task1();
     Task2 t2 = new Task2();
      A  a =  new A(t1);
      B  b =  new B(t1);
      C  c =  new C(t2);
      D  d =  new D(t2);

      a.start();
      b.start();
      c.start();
      d.start();
  }
 }