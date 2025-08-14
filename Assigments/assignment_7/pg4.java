import java.util.Scanner;

class Car{
    private String brand ;
    private String model ;
    private int  year ;

//setter
    public void setB(String brand){
       this.brand = brand;
    }
    public void setM(String model){
       this.model = model;
    }
    public void setY(int year){
       this.year = year;
    }

//getter method
    public void getB(){
        System.out.println("Brand of Car :"+ brand);
    }
    public void getM(){
        System.out.println("Brand of Car :"+ model);
    }
    public void   getY(){
        System.out.println("Brand of Car :"+ year);
    }
}

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the car brand : ");
        String b = sc.nextLine();
        System.out.print("Enter the car Model : ");
        String m = sc.nextLine();
        System.out.print("Enter the car Year : ");
        int  y = sc.nextInt();

        Car obj = new Car();
        obj.setB(b);
        obj.setM(m);
        obj.setY(y);

        obj.getB();
        obj.getM();
        obj.getY();
    }
}