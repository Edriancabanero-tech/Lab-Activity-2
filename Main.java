public class Main{
   public static void main(String[] args){
   
        Vehicle v1 = new Vehicle("Toyota", "Corolla", 2020);
        Vehicle v2 = new Vehicle("Honda", "Civic", 1995);
        Vehicle v3 = new Vehicle("Ford", "Ranger", 2015);
        
      //new methods of v1 test getter
        System.out.println("Vehicle: 1");
        System.out.println("Brand: " + v1.getBrand());
        System.out.println("Model: " + v1.getModel());
        System.out.println("Year: "+ v1.getYear());
        System.out.println();
        
      //old methods of v1 
        System.out.println("Old method Vehicle: 1");
        v1.DisplayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println();

      //new methods of v1 test getter
        System.out.println("Vehicle: 2");
        System.out.println("Brand: " + v2.getBrand());
        System.out.println("Model: " + v2.getModel());
        System.out.println("Year: "+ v2.getYear());
        System.out.println();
        
      //old methods of v2   
        System.out.println("Old method Vehicle: 2");
        v2.DisplayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());
        System.out.println();


      //new methods of v3 test getter
        System.out.println("Vehicle: 3");
        System.out.println("Brand: " + v3.getBrand());
        System.out.println("Model: " + v3.getModel());
        System.out.println("Year: "+ v3.getYear());
        System.out.println();

      //old methods of v3  
        System.out.println("Old method Vehicle: 3");
        v3.DisplayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());


        
        System.out.println("\n---Testing Set v1----\n");
        
        boolean Set = v1.setYear(2000); 
        System.out.println("SetYear: " + Set);
        System.out.println("New year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println();
        
        Set = v1.setYear(1885); 
        System.out.println("SetYear: " + Set);
        System.out.println("Year Remainds: " + v1.getYear());
        System.out.println();
        
        Set = v1.setYear(2027); 
        System.out.println("SetYear: " + Set);
        System.out.println("Year Remainds: " + v1.getYear());
        System.out.println();

      //Testing the vehicle to invalid 
        Vehicle invalidV1 = new Vehicle("Testing", "Vehicle 1885", 1885);
        System.out.println("New vehicle with year 1885: ");
        System.out.println("Initial year: " + invalidV1.getYear());
        System.out.println();
        
        invalidV1 = new Vehicle("Testing", "Vehicle 2027", 2027);
        System.out.println("New vehicle with year 2027: ");
        System.out.println("Initial year: " + invalidV1.getYear());       
            
   }
}