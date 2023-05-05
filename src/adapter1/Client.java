package adapter1;
// client class
public class Client

{
    public static  void  main(String[] args){
           Vehicle car =new Car();
     playWithVehicle (car);
    }
    private static  void playWithVehicle(Vehicle vehicle)
    {
        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();
    }

}
