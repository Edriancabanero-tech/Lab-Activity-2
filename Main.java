public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Toyota", "Corolla", 2020);
        Vehicle v2 = new Vehicle("Honda", "Civic", 1995);
        Vehicle v3 = new Vehicle("Ford", "Ranger", 2015);
      
        v1.DisplayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println();

        
        v2.DisplayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());
        System.out.println();

        
        v3.DisplayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());
    }
}