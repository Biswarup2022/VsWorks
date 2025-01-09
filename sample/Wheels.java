package sample;

class Wheels extends Car
{
    Wheels(String brand , String color , double price)
    {
        super(brand, color, price);
    }  
    public void door()
    {
        System.out.println("Door is in Wheels Class");
    }
} 
