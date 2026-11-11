public class Motorcycle extends Vehicle{
   private String engineType;
   
   public Motorcycle(String brand, String model, int year, String engineType){
      super(brand, model, year);
      this.engineType = engineType;
   }
   
   @Override
   public void DisplayInfo(){
      super.DisplayInfo();
      System.out.println("Engine Type: "+ engineType);
   }

   public void moveForward(){
      System.out.println("The motorcycle move forward");
   }

   public void moveBackward(){
      System.out.println("The motorcycle move Backward");
   }

   public void moveLeft(){
      System.out.println("The motorcycle turning left");
   }

   public void moveRight(){
      System.out.println("The motorcycle turning right");
   }
}