package adapter1;
// client class
public class Client

{
    public static  void  main(String[] args){
           Vehicle car =new Car();
   //  playWithVehicle (car);
        //test the bicycle clas
     Bicycle bicycle=new Bicycle();
     bicycle.pedal();
     bicycle.stop();bicycle.ringBell();
    }
    private static  void playWithVehicle(Vehicle vehicle)
    {
        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();
    }

}
