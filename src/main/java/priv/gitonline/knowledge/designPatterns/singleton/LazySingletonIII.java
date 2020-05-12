package priv.gitonline.knowledge.designPatterns.singleton;

/**
 * 双重校验 (线程安全)
 */
public class LazySingletonIII {

    private static LazySingletonIII singleton = null;

    private LazySingletonIII(){
        System.out.println("懒汉式初始化");
    }

    public static LazySingletonIII getInstance(){
        if(singleton == null){
            synchronized(LazySingletonIII.class){
                if(singleton == null){
                    singleton = new LazySingletonIII();
                }
            }
        }
        return singleton;
    }

}
