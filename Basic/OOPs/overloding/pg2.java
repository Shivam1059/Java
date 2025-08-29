class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        // super.run();   // Calls parent method
        System.out.println("Bike is running safely");
    }
}

 class Main {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.run();
    }
}

   // Output:
        // Vehicle is running
        // Bike is running safely