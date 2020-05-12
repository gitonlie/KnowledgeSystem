package priv.gitonline.knowledge.designPatterns.strategy;

public class StrategyB implements Strategy{
    @Override
    public void action() {
        this.go();
        System.out.println("飞机出行");
    }
}
