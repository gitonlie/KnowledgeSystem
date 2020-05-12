package priv.gitonline.knowledge.designPatterns.factory.simple;

public class CarFactory {

    public static Car getInstance(String name){
        Car car = null;
        if("pc".equals(name)){
            car =  new CarA();
        }else if("pt".equals(name)){
            car =  new CarB();
        }
        return  car;
    }
}
