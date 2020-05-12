package priv.gitonline.knowledge.designPatterns.observer.sample;

import java.util.ArrayList;
import java.util.List;

public class TaskImpl implements Task {

    private List<Player> players = new ArrayList<>();


    @Override
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void removePlayer(Player player) {
        players.remove(player);
    }

    @Override
    public void trigger() {
        System.out.println("触发任务通知所有玩家");
        players.forEach(player -> {
            player.execute();
        });
    }
}
