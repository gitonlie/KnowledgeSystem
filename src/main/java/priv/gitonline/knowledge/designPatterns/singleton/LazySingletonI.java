package priv.gitonline.knowledge.designPatterns.singleton;

/**
 * 懒汉式(非线程安全)
 */
public class LazySingletonI {

    private static LazySingletonI singleton = null;

    private LazySingletonI(){
        System.out.println("懒汉式初始化");
    }

    public static LazySingletonI getInstance(){
        if(singleton == null){
            singleton = new LazySingletonI();
        }
        return singleton;
    }
}
