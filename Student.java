class Vehicle {
    void start() {
        System.out.println("this is a mechine");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("car start with key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike start with self");
    }
}

public class Student {
    public static void main(String[] args) {

        Vehicle [] vs = {

            new Bike(),
            new Car()
          };

        for (Vehicle vehicle : vs) {
            
            vehicle.start();
        }

    }  
}
