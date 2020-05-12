package priv.gitonline.knowledge.designPatterns.factory.methods;

public class CarFactoryB extends CarFactory {
    @Override
    public Car create() {
        return new CarB();
    }
}
