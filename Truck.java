public class Truck extends Vehicle{
   private int numberOfWheels;
   
   public Truck(String brand, String model, int year, int numberOfWheels){
      super(brand, model, year);
      this.numberOfWheels = numberOfWheels;
   }
   
   @Override
   public void DisplayInfo(){
      super.DisplayInfo();
      System.out.println("Number of Wheels: "+ numberOfWheels);
   }

   public void moveForward(){
      System.out.println("The truck move forward");
   }

   public void moveBackward(){
      System.out.println("The truck move Backward");
   }

   public void moveLeft(){
      System.out.println("The truck turning left");
   }

   public void moveRight(){
      System.out.println("The truck turning right");
   }
}