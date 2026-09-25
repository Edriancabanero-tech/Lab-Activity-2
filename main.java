public class Main{
   public static void main(String[] args){
      Vehicle v1 = new Vehicle("Dodge", "Challenger SRT Demon", 2018);
      Vehicle v2 = new Vehicle("Ford", "Fourth Gen Ranger", 2022);
      Vehicle v3 = new Vehicle("Mitsubishi", "Starion GSR-VR", 1988);
      
      v1.displayInfo();
         System.out.println("Age: " + v1.calculateAge());
         System.out.println("Vintage: " + v1.isVintage());
         System.out.println();
      
      
      v2.displayInfo();
         System.out.println("Age: " + v2.calculateAge());
         System.out.println("Vintage: " + v2.isVintage());
         System.out.println();
      
      
      v3.displayInfo();
         System.out.println("Age: " + v3.calculateAge());
         System.out.println("Vintage: " + v3.isVintage());
         System.out.println();
   }
}