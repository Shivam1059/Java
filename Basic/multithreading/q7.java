class A{
    synchronized public void m1(Task s){
      for(int i=0; i<3; i++){
        System.out.println("Thread m1"+i);
      }
    }
    synchronized public void m2(Task s){
      for(int i=0; i<3; i++){
        System.out.println("Thread m1"+i);
      }
    }
}
class B{
    synchronized public void x1(Task t){
      for(int i=0; i<3; i++){
        System.out.println("Thread x1"+i);
      }
    }
    synchronized public void x2(Task t){
      for(int i=0; i<3; i++){
        System.out.println("Thread x2"+i);
      }
    }
}

class First extends Thread{
    private Task obja;
    private Task objb;

   public First(Task obja, Task objb){
     this.obja = obja;
     this.objb = objb;
   }
  
  public void run(){
    obja.m1()
  }


}

class TestMainn{
  public statc void main(String args[]){

  }
}