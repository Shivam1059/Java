class Task1{
   public static  void m1(){
       for(int i=0; i<3; i++){
        System.out.println("Thread m1....."+i);
        try{
          Thread.sleep(1000);
        }catch(InterruptedException e){
          e.printStackTrace();
        }
       }
   }
}

class Task2{
   public static void m2(){
    for(int i=0; i<3; i++){
      System.out.println("Thread m2...."+i);
       try{
          Thread.sleep(100);
        }catch(InterruptedException e){
          e.printStackTrace();
        }
    }
  }
}

class A extends Thread{
   private  String taskname;
   public A(String taskname){
    this.taskname = taskname;
   }

   public void run(){
    if (taskname.equalsIgnoreCase("task1")) {
            Task1.m1();
        } else if (taskname.equalsIgnoreCase("task2")) {
            Task2.m2();
        }
   }
}

class Test{
  public static void main(String args[]){

    Thread s = new A("task1");
    Thread p = new A("task2");
    s.start();
    p.start();
  }
}