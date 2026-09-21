public class main{
   public static void main(String[] args){
      Vehicle v1 = new Vehicle();
      Vehicle v2 = new Vehicle();
      Vehicle v3 = new Vehicle();
      
      v1.brand = "Dodge";
      v1.model = "Challenger SRT Demon";
      v1.year = 2018;
      
      v2.brand = "Ford";
      v2.model = "Fourth Gen Ranger";
      v2.year = 2022;
      
      v3.brand = "Mitsubishi";
      v3.model = "Starion GSR-VR";
      v3.year = 1988;
      
      v1.displayInfo();
         System.out.println("Age: " + v1.calculateAge());
         System.out.println("Vintage: " + v1.isVentage());
         System.out.println();
      
      
      v2.displayInfo();
         System.out.println("Age: " + v2.calculateAge());
         System.out.println("Vintage: " + v2.isVentage());
         System.out.println();
      
      
      v3.displayInfo();
         System.out.println(" Age: " + v3.calculateAge());
         System.out.println("Vintage: " + v3.isVentage());
         System.out.println();
   }
}