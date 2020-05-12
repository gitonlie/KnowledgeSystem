package priv.gitonline.knowledge.designPatterns.command;

/**
 * 具体命令角色类
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("干一些事情");
        receiver.action();
    }
}
