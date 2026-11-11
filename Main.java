public class Main{
   
   public static void printDetails(Vehicle vehicle){
      vehicle.DisplayInfo();
   }
   
   public static void main(String[] args){
     // DEMO 1: A parent reference holding a child object
      System.out.println("=== 1 Parent Reference using Polymorphism ====");
     
      Vehicle vehicle = new Car("Honda", "Civic", 2025, 4);
      vehicle.DisplayInfo();
      vehicle.moveForward();
      vehicle.moveBackward();
      vehicle.moveLeft();
      vehicle.moveRight();
      
      System.out.println(); 
      
    // 1.1: The same variable now refers to a Truck Object using vehicle abstaction
      vehicle = new Truck("SinoTruck", "HOWO", 2024, 10);
      vehicle.DisplayInfo();
      vehicle.moveForward();
      vehicle.moveBackward();
      vehicle.moveLeft();
      vehicle.moveRight();

    
      System.out.println();  
      
    // 1.1: The same variable now refers to a Motorcycle Object using vehicle abstaction
      vehicle = new Motorcycle("Yamaha", "aerox", 2026, "155cc");
      vehicle.DisplayInfo();
      vehicle.moveForward();
      vehicle.moveBackward();
      vehicle.moveLeft();
      vehicle.moveRight();

    
      System.out.println();
    // DEMO 2: One method accepts different Vehicle subclasses 
      System.out.println("=== Car Abstraction ==="); 
      Car car = new Car("Honda", "Civic", 2025, 4);
      printDetails(car);
      car.moveForward();
      car.moveBackward();
      car.moveLeft();
      car.moveRight();
      System.out.println();

      System.out.println("=== Motorcycle Abstraction ===");
      Motorcycle motor = new Motorcycle("Yamaha", "aerox", 2026, "155cc");
      printDetails(motor);
      motor.moveForward();
      motor.moveBackward();
      motor.moveLeft();
      motor.moveRight();
      System.out.println();

      System.out.println("=== Truck Abstraction ===");
      Truck truck = new Truck("SinoTruck", "HOWO", 2024, 10);
      printDetails(truck);
      truck.moveForward();
      truck.moveBackward();
      truck.moveLeft();
      truck.moveRight();
      System.out.println();

    // DEMO 3: One array holds different Vehicle subclasses   
      System.out.println("=== 3. Polymorphic array ===");
      
      Vehicle[] vehicles = {
          new Car("Honda", "Civic", 2025, 4),
          new Motorcycle("Yamaha", "aerox", 2026, "155cc"),
          new Truck("SinoTruck", "HOWO", 2024, 10)
      };
        
        for(Vehicle currentVehicles : vehicles){
         printDetails(currentVehicles);
         currentVehicles.moveForward();
         currentVehicles.moveBackward();
         currentVehicles.moveLeft();
         currentVehicles.moveRight();
         System.out.println();
        }
   }
}