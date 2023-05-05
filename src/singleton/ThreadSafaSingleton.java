package singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreadSafaSingleton {
    private  String[]Letters={"a","b","c","d"};
    private List<String> data= Arrays.asList(Letters);
    private static  volatile ThreadSafaSingleton instance;
    private static boolean delayMe=true;

    public static synchronized ThreadSafaSingleton getInstance() {
        // check if that  equal to null in the first thant give it a value from the class
        if(instance== null)
        {
            if(delayMe){
                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                //    throw new RuntimeException(e);
                }
            }
            instance=new ThreadSafaSingleton();
        }
        return instance;
    }

    private ThreadSafaSingleton(){
        Collections.shuffle(data);
        // printData();
    }
    public  void  printData(){
        for(String item:data){
            System.out.printf("\s"+item);
        }
        System.out.println();
    }
}
