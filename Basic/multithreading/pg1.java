class test extends Thread{
     public void  run(){
        System.out.println("T thread is excuted");
      }
}

class Testmain{
  public static void main(String args[]){
    test t = new test();
    t.start();
  }
}