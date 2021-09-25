import java.util.IdentityHashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
//        SingletonTest singleton = SingletonTest.getSingleton();
//        SingletonTest singleton1 = SingletonTest.getSingleton();
//        SingletonTest singleton2 = SingletonTest.getSingleton();
//
//        System.out.println("singleton hashCode: "+singleton.hashCode());
//        System.out.println("singleton1 hashCode: "+singleton1.hashCode());
//        System.out.println("singleton2 hashCode: "+singleton2.hashCode());
        Map<String,String> medaData = new IdentityHashMap<>();
        medaData.put("one","Akbar");
        medaData.put("two","Jarru");
        medaData.put("three","Shannu");
        medaData.put("four","Shakri");

        ImmutableClass immutable = new ImmutableClass("Saleem",1,medaData);
        System.out.println(immutable);

        immutable.getMedaData().put("Five","Munni");
        System.out.println(immutable);

    }
}
