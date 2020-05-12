package priv.gitonline.knowledge.designPatterns.singleton;

/**
 * 懒汉式 (线程安全)
 */
public class LazySingletonII {

    private static LazySingletonII singleton = null;

    private LazySingletonII(){
        System.out.println("懒汉式初始化");
    }

    public static synchronized LazySingletonII getInstance(){
        if(singleton == null){
            singleton = new LazySingletonII();
        }
        return singleton;
    }

}
