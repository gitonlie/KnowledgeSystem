package priv.gitonline.knowledge.designPatterns.command;

/**
 * 接收者角色类
 */
public class Receiver {

    /**
     * 实际操作命令
     */
    public void action(){
        System.out.println("执行操作...");
    }

}
