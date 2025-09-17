

class Singleton{
    private  static Singleton instance ;

    private Singleton(){

    }

    public static Singleton getsinglton(){
        if(instance  == null){
          instance =  new Singleton();
        }

        return instance;
    }
}


class TestMain{
  public static void main(String args[]){
     Singleton obj = Singleton.getsinglton();
     Singleton obj1 = Singleton.getsinglton();
     System.out.println(obj);
     System.out.println(obj1);
  }
}