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

   public void moveForward(){
      System.out.println("The car move forward");
   }

   public void moveBackward(){
      System.out.println("The car move Backward");
   }

   public void moveLeft(){
      System.out.println("The car turning left");
   }

   public void moveRight(){
      System.out.println("The car turning right");
   }
} 