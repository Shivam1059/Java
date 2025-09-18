   class Task1{
        synchronized public void  m1(){
          for(int i=0; i<2; i++){
              System.out.println("Task t1...");
          }
        }
   }

   class A extends Thread{
     Task1 obj = null;
     public A(Task1 obj ){
       this.obj = obj;
     }

     public void run(){
       obj.m1();
     }
   }

   class TestMain{
    public static void main(String args[]){
      Task1 t = new Task1();
      Task1 m  = new Task1();

      Thread t1 = new A(t);
      Thread t2 = new A(m);

     t1.start();
     t2.start();
    }
   }