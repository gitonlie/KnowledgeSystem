package priv.gitonline.knowledge.designPatterns.command;

/**
 * 请求者角色类
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
