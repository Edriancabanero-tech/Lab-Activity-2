public class Car extends Vehicle{
   private int numberOfDoors;
   
   public Car(String brand, String model, int year, int numberOfDoors){
      super(brand, model, year);
      this.numberOfDoors = numberOfDoors;
   }
   
   @Override
   public void DisplayInfo(){
    super.DisplayInfo();
    System.out.println("Number Of Doors: "+ numberOfDoors);  
   }
} 