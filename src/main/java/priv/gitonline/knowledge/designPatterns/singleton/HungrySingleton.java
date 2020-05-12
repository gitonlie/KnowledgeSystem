package priv.gitonline.knowledge.designPatterns.singleton;

/**
 * 饿汉式 (线程安全)
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){
        System.out.println("饿汉式初始化");
    }

    public static HungrySingleton getInstance(){
        return singleton;
    }

}
