public class Main{
   
   public static void printDetails(Vehicle vehicle){
      vehicle.DisplayInfo();
   }
   
   public static void main(String[] args){
     // DEMO 1: A parent reference holding a child object
      System.out.println("=== 1 Parent Reference ====");
     
      Vehicle vehicle = new Car("Honda", "Civic", 2025, 4);
      vehicle.DisplayInfo();
      
      System.out.println(); 
      
    // 1.1: The same variable now refers to a Truck Object
      System.out.println("== TRUCK ==");
      Vehicle truck = new Truck("SinoTruck", "HOWO", 2024, 10);
      printDetails(truck);

    
      System.out.println();  
      
    // 1.1: The same variable now refers to a Motorcycle Object
      System.out.println("== MOTORCYCLE ==");
      Vehicle motor = new Motorcycle("Yamaha", "aerox", 2026, "155cc");
      printDetails(motor);

    
      System.out.println();
    // DEMO 2: One method accepts different Vehicle subclasses 
      System.out.println("=== 2 Parent Reference ==="); 
      Car car = new Car("Honda", "Civic", 2025, 4);
      car.DisplayInfo();
      
      
      System.out.println();
      
    // DEMO 3: One array holds different Vehicle subclasses   
      System.out.println("=== 3 Parent Reference ==="); 
      
      Vehicle[] vehicles = {
          new Car("Honda", "Civic", 2025, 4),
          new Motorcycle("Yamaha", "aerox", 2026, "155cc"),
          new Truck("SinoTruck", "HOWO", 2024, 10)
      };
        
        for(Vehicle currentVehicles : vehicles){
         printDetails(currentVehicles);
        }
   }
}