package priv.gitonline.knowledge.designPatterns.observer.sample;

/**
 * 被观察者
 */
public interface Task {
    /**
     * 添加玩家
     * @param player
     */
    void addPlayer(Player player);

    /**
     * 移除玩家
     * @param player
     */
    void removePlayer(Player player);

    /**
     * 触发任务通知玩家
     */
    void trigger();

}
