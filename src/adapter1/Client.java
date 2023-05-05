package adapter1;
// client class
public class Client

{
    public static  void  main(String[] args){
           Vehicle car =new Car();
           playWithVehicle (car);
        //test the bicycle clas
        // when we use the method get an error
//     Bicycle bicycle=new Bicycle();
//     bicycle.pedal();
//     bicycle.stop();bicycle.ringBell();


//     //test the adapter pattern
        Vehicle bicycle=new BicycleAdapter(new Bicycle());
        playWithVehicle(bicycle);

    }
    private static  void playWithVehicle(Vehicle vehicle)
    {
        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();
    }

}
