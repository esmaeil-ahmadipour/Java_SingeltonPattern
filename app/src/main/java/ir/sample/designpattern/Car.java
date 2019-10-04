package ir.sample.designpattern;

public class Car
{

    //Create Internal Object From Car Class ;
    private static Car instance = new Car();

    //Disable Create Direct Object ;
    private Car()
    {
    }

    //This Method Return New Object From Car Class ;

    public static Car getInstance()
    {
        return instance;
    }

    //Custom Method In Car Class
    public void moveCar()
    {
        System.out.println("Car is Moved !!!");
    }

    //Custom Method In Car Class ;
    public void stopCar()
    {
        System.out.println("Car is Stoped !!!");
    }
}
