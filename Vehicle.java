public class Vehicle{
   String brand;
   String model;
   int year;
   
   Vehicle(String brand, String model, int year){
      this.brand = brand;
      this.model = model;
      this.year = year;
   }
   
   void DisplayInfo(){
       System.out.println(brand + " " + model + " - " + year);
   }
   
   int calculateAge() {
        return 2026 - year;
    }

    boolean isVintage() {
        return calculateAge() > 25;
    } 
}