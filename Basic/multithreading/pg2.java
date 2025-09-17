class first  extends Thread{
   public void run(){
      for(int i=0; i<5; i++){
        System.out.println("Thread -T1 is excuted ");
      }
   }
}

class Second extends Thread{
  public void run(){
    for(int i=0; i<10; i++){
      System.out.println("Virat kohli....");
    }
  }
}

class TestMain{
  public static void main(String args[]){
     first t1 = new first();
     Second  t2 = new Second();
     t1.start();
     t2.start();
  }
}