package priv.gitonline.knowledge.designPatterns.observer.sample;

public class PlayerA implements Player{
    @Override
    public void execute() {
        System.out.println("玩家A已接收任务");
    }
}
