public class Main{
   
   public static void performService(Serviceable item){
      item.service();
   }
   
   public static void main(String[] args){

      // Interface Demo
      System.out.println("=== Interface ===");

      System.out.println("=== Car Interfaces ===");
      Car car1 = new Car("Honda", "Civic", 2025, 4);
      performService(car1);
      System.out.println();

      System.out.println("=== Motorcycle Interaces ===");
      Motorcycle motor1 = new Motorcycle("Yamaha", "aerox", 2026, "155cc");
      performService(motor1);
      System.out.println();

      System.out.println("=== Truck Interfaces ===");
      Truck truck1 = new Truck("SinoTruck", "HOWO", 2024, 10);
      performService(truck1);
      System.out.println();

      // Using array

      System.out.println("=== Interface Array ===");
      Serviceable[] serviceables = {
          new Car("Honda", "Civic", 2025, 4),
          new Motorcycle("Yamaha", "aerox", 2026, "155cc"),
          new Truck("SinoTruck", "HOWO", 2024, 10),
          new Printer()
      };

      for(Serviceable currentServiceables : serviceables){
         performService(currentServiceables);
         System.out.println();
      }

      System.out.println("=== Interface Array with Vehicle ===");
      Vehicle[] vehicles = {
          new Car("Honda", "Civic", 2025, 4),
          new Motorcycle("Yamaha", "aerox", 2026, "155cc"),
          new Truck("SinoTruck", "HOWO", 2024, 10)
      };

      for(Vehicle currentVehicle : vehicles){
         currentVehicle.DisplayInfo();
         System.out.println();

        currentVehicle.moveForward();
        currentVehicle.moveBackward();
        currentVehicle.moveLeft();
        currentVehicle.moveRight();
        System.out.println();
      }
    }
}