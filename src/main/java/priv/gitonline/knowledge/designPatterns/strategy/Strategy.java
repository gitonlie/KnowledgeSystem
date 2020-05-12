package priv.gitonline.knowledge.designPatterns.strategy;

/**
 * 策略
 */
public interface Strategy {

    void action();

    default void go(){
        System.out.println("出行方式:");
    }
}
