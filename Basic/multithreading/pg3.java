class First extends Thread{
   public void run(){
     for(int i=0; i<3; i++){
         try{
          System.out.println("Cheeku ----");
          Thread.sleep(2000);
         }catch(InterruptedException e){
          e.printStackTrace();
         }
     }
   }
}


class Second extends Thread{
  public void run(){
    for(int i=1; i<5; i++){
      try{
        System.out.println("peeku---");
        Thread.sleep(1000);
      }catch(InterruptedException e){
          e.printStackTrace();
         }
    }
  }
}


class TestMain{
  public static void main(String args[]){
    First f = new First();
    f.start();
    Second s = new Second();
    s.start();
  }
}