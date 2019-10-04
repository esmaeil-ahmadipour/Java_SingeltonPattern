package ir.sample.designpattern;

public class Main
{
    public static void main(String[] args)
    {
        //Call moveCar Method From Car Class
        Car.getInstance().moveCar();

        //Call moveCar Method From Car Class
        Car.getInstance().stopCar();
    }
}
