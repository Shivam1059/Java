class Dog{
    private String name ;
    private String  breed ;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public Dog(){};

    public void setN(String name){
         this.name = name;
    }
    public void setB(String breed){
         this.breed = breed;
    }

    public void getN(){
      System.out.print("Dog  Name : " +name);
    }
    public void getB(){
      System.out.println(" , breed : " +breed);
    }

}  

    class Test{
        public static void main(String args[]){
          Dog obj = new Dog();
          obj.setN("Akaya");
          obj.setB("Akita-japan");
          obj.getN();
          obj.getB();
        }
    }
