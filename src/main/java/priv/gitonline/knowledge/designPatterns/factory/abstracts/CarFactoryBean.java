package priv.gitonline.knowledge.designPatterns.factory.abstracts;

public class CarFactoryBean extends CarFactory {

    @Override
    public Car createA() {
        return new CarAA();
    }

    @Override
    public Car createB() {
        return new CarBB();
    }
}
