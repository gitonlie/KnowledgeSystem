package priv.gitonline.knowledge.designPatterns.strategy;

/**
 * 策略上下文
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void selectTransport(){
        strategy.action();
    }
}
