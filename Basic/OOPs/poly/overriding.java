//overriding in java
class Animal{
     void move(){
       System.out.println("Anima is moved ");
     }
}
class Dog extends Animal{
    void move(){
      System.out.println("Dog is bark");
    }
}

class Test{
  public static void main(String args[]){
    Animal a = new Animal();
      a.move();
      
    Dog d = new Dog();
    d.move();  

    Animal ad = new Dog();
    ad.move();  //Output: Dog is running. (runtime decides)
  }
}


