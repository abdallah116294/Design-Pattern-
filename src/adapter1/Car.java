package adapter1;

public class Car implements  Vehicle {
    @Override
    public void accelerate() {
        System.out.println("car starts to move ");
    }

    @Override
    public void pushBreak() {
        System.out.println("car Stopped");
    }

    @Override
    public void soundHorn() {
        System.out.println("Be BE ");
    }
}
