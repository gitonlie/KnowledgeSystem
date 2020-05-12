package priv.gitonline.knowledge.designPatterns.observer.jdks;


import java.util.Observable;
import java.util.Observer;

public class Player implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o.countObservers()+","+arg);
    }
}
