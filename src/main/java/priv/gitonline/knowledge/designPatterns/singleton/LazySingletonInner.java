package priv.gitonline.knowledge.designPatterns.singleton;

/**
 * 静态内部类 (线程安全)
 */
public class LazySingletonInner {

    private LazySingletonInner(){
        System.out.println("静态内部类");
    }

    private static class Loader{
        private final static LazySingletonInner singleton = new LazySingletonInner();
    }

    public final static LazySingletonInner getInstance(){
        return Loader.singleton;
    }
}
