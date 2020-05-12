package priv.gitonline.knowledge.designPatterns.strategy;

public class StrategyA implements Strategy{
    @Override
    public void action() {
        this.go();
        System.out.println("汽车出行");
    }
}
