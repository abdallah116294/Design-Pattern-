package adapter1;
//Adaptee class
public class Bicycle {
    public void pedal(){
        System.out.println("Bic starts to move");
    }
    public void stop() {
        System.out.println("Bic stopped");
    }
    public void ringBell() {
        System.out.println("Ring ring");
    }
}
