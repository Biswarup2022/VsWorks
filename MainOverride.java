    class Car
    {
        String brand, colour;
        double price;
        Car(String brand, String colour, double price)
        {
            this.brand=brand;
            this.colour=colour;
            this.price=price;
        }
        public void door()
        {
            System.out.println("Door is in Car Class");
        }
    }   
      class Wheels extends Car
      {
        Wheels(String brand, String color, double price)
        {
        super(brand, color, price);
        }
        @Override
        public void door()
        {
            System.out.println("Door is in Wheels Class");
        }
      }  
        public class MainOverride
     {
        public static void main(String[] args)
        {
            Wheels w1 = new Wheels("bmw","red",4500);
            w1.door();
            Car c = new Car("Audi", "Black", 8000.00);
            System.out.println(c.brand);
            System.out.println(c.colour);
            System.out.println(c.price);  
            System.out.println(w1.brand);      
            System.out.println(w1.colour);      
            System.out.println(w1.price);      
        }
     }  
