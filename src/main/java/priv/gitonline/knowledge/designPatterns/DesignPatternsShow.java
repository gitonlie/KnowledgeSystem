package priv.gitonline.knowledge.designPatterns;

import priv.gitonline.knowledge.designPatterns.builder.Director;
import priv.gitonline.knowledge.designPatterns.command.ConcreteCommand;
import priv.gitonline.knowledge.designPatterns.command.Invoker;
import priv.gitonline.knowledge.designPatterns.command.Receiver;
import priv.gitonline.knowledge.designPatterns.factory.abstracts.CarFactoryBean;
import priv.gitonline.knowledge.designPatterns.factory.methods.CarFactoryA;
import priv.gitonline.knowledge.designPatterns.factory.methods.CarFactoryB;
import priv.gitonline.knowledge.designPatterns.factory.simple.CarFactory;
import priv.gitonline.knowledge.designPatterns.observer.jdks.Game;
import priv.gitonline.knowledge.designPatterns.observer.jdks.Player;
import priv.gitonline.knowledge.designPatterns.observer.sample.*;
import priv.gitonline.knowledge.designPatterns.proxy.*;
import priv.gitonline.knowledge.designPatterns.singleton.HungrySingleton;
import priv.gitonline.knowledge.designPatterns.singleton.LazySingletonI;
import priv.gitonline.knowledge.designPatterns.singleton.LazySingletonInner;
import priv.gitonline.knowledge.designPatterns.singleton.SingletonEnum;
import priv.gitonline.knowledge.designPatterns.strategy.Context;
import priv.gitonline.knowledge.designPatterns.strategy.StrategyA;

/**
 * 设计模式演示
 */
public class DesignPatternsShow {


    public static void main(String[] args) {

        //------------------------------------创建型

        //单例模式
        HungrySingleton singleton1 = HungrySingleton.getInstance();
        HungrySingleton singleton2 = HungrySingleton.getInstance();
        LazySingletonI lazy1 = LazySingletonI.getInstance();
        LazySingletonInner lazyInner = LazySingletonInner.getInstance();
        SingletonEnum.INSTACE.dosomething();
        //简单工厂模式
        CarFactory.getInstance("pc").features();
        //工厂方法模式
        new CarFactoryA().create().features();
        new CarFactoryB().create().features();
        //抽象工厂模式
        new CarFactoryBean().createA().features();
        new CarFactoryBean().createB().features();

        //建造者模式
        Director director = new Director();
        director.create().descript();


        //------------------------------------结构型

        //静态代理模式
        IUserDao staticProxy = new StaticProxy(new UserDao());
        staticProxy.save();

        //动态代理
        IUserDao target = new UserDao();
        System.out.println(target.getClass());
        //  给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstanceLambda();
        proxy.save();

        //Cglib代理
        UserDao proxy2 = (UserDao)new CglibProxyFactory(target).getProxyInstance();
        //执行代理对象的方法
        proxy2.save();

        //------------------------------------行为型

        //策略模式
        Context context = new Context(new StrategyA());
        context.selectTransport();

        //观察者模式
        Task task = new TaskImpl();
        task.addPlayer(new PlayerA());
        task.addPlayer(new PlayerB());
        task.addPlayer(new PlayerC());
        //执行触发任务
        task.trigger();
        //jdk 观察者
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3= new Player();
        Game game = new Game();
        game.addObserver(player1);
        game.addObserver(player2);
        game.addObserver(player3);
        game.setChanged();
        game.notifyObservers("fuck");

        //命令模式
        Invoker invoker = new Invoker(new ConcreteCommand(new Receiver()));
        invoker.action();
    }

}
