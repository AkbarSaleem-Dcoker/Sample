public class SingletonTest {
    private static SingletonTest singleton=null;

    private SingletonTest(){

    }

    public static SingletonTest getSingleton(){
        if(singleton==null){
            singleton =  new SingletonTest();
        }

        return singleton;
    }


}
