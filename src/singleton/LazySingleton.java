package singleton;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LazySingleton {
    private  String[]Letters={"a","b","c","d"};
    private List<String> data=Arrays.asList(Letters);
    private static  LazySingleton instance;

    public static LazySingleton getInstance() {
        // check if that  equal to null in the first thant give it a value from the class
        if(instance== null)
        {
            instance=new LazySingleton();
        }
        return instance;
    }

    private LazySingleton(){
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
