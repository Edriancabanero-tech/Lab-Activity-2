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
}