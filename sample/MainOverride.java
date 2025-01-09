    
    package sample;   
    public class MainOverride
     {
        public static void main(String[] args)
        {
            Wheels w1 = new Wheels("bmw", "Red", 10000.00);
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
