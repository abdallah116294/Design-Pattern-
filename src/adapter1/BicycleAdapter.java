package adapter1;
// now make the adapter
public class BicycleAdapter implements  Vehicle{
    // make the adaptee item to the adapter an make initialize with the constractur
    private  Bicycle bicycle;
    public BicycleAdapter(Bicycle bicycle)
    {
        this.bicycle=bicycle;
    }
    @Override
    public void accelerate() {
    bicycle.pedal();
    }

    @Override
    public void pushBreak() {
bicycle.stop();
    }

    @Override
    public void soundHorn() {
bicycle.ringBell();
    }
}
