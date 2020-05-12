package priv.gitonline.knowledge.designPatterns.factory.methods;

public class CarFactoryA extends CarFactory{
    @Override
    public Car create() {
        return new CarA();
    }
}
