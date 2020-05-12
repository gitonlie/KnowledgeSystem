package priv.gitonline.knowledge.designPatterns.observer.sample;

public class PlayerB implements Player {
    @Override
    public void execute() {
        System.out.println("玩家B已接收任务");
    }
}
