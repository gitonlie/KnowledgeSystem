package priv.gitonline.knowledge.designPatterns.observer.sample;

public class PlayerC implements Player{
    @Override
    public void execute() {
        System.out.println("玩家C已接收任务");
    }
}
