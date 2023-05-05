package singleton;

public class Main {
    public static void main(String[] args) {
        // in singleton, we should not use new word and make the constructor  private
        // now how to get an instance of this class
//        LazySingleton instance1=new LazySingleton();
//        LazySingleton instance2=new LazySingleton();
//        instance1.printData();
        //different hash code
//        instance2.printData();


        // now we can use the function of getInstance
        LazySingleton instance1=LazySingleton.getInstance();
        LazySingleton instance2=LazySingleton.getInstance();
        instance2.printData();
        System.out.println(instance1.hashCode());
        //the hash code is same
        System.out.println(instance2.hashCode());
        instance1.printData();
        //not usable in multi thread
        testThreadSafeSingleton();

    }
    private  static  void testThreadSafeSingleton(){
        new DatePrinter().start();
        new DatePrinter().start();
    }
}
class  DatePrinter extends  Thread{
    @Override
    public void  run(){
        ThreadSafaSingleton.getInstance().printData();
    }
}
