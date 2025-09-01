//Problem 6: Zoo Animal Management
interface Flyble{
  void fly(String m);
}
abstract class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
      this.name = name;
      this.age = age;
    }
    public String getName(){
      return name;
    }
    public int  getAge(){
      return age;
    }
    public void showInfo(){
      System.out.println("----------------"+getName()+" Infomation----------");
      System.out.println(getName() + "  age is "+getAge());
    }
    abstract public void eat(String s);
    abstract public void makeSound(String m);
}

class Lion extends Animal{
    public Lion(String name, int age){
      super(name, age);
    }

    public void eat(String m){
       System.out.println(getName()+" is eat "+m);
    }
    public void makeSound(String m){
       System.out.println(getName()+" is sound  "+m);
    }
}
class Elemphant extends Animal{
    public Elemphant(String name, int age){
      super(name, age);
    }

    public void eat(String m){
       System.out.println(getName()+" is eat "+m);
    }
    public void makeSound(String m){
       System.out.println(getName()+" is sound  "+m);
    }
}
class Perrot extends Animal implements Flyble{
       public Perrot(String name, int age){
      super(name, age);
    }

    public void eat(String m){
       System.out.println(getName()+" is eat "+m);
    }
    public void makeSound(String m){
       System.out.println(getName()+" is sound  "+m);
    }

    public void fly(String m){
      System.out.println(getName()+" is "+m);
    }
}

class TestMain{
  public static void main(String[] args){


    Animal  l = new Lion("Lion", 40);
    l.showInfo();
    l.eat("meat");
    l.makeSound("growl");

    Animal e = new Elemphant("Elephant",50);
    e.showInfo();
    e.eat("grasses fruits");
    e.makeSound("trumpet");

    Perrot p = new Perrot("Perrot", 12);
    p.showInfo();
    p.eat("fruits, nuts, seeds, grains, vegetables,");
    p.makeSound("squawk");
    p.fly(" fly in the Sky");
  }
}