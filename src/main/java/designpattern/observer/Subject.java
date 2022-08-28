package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList=new ArrayList<Observer>();
    private int state;

    public void addObserver(Observer o){
        observerList.add(o);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        execute();
    }

    private void execute(){
        for (Observer observer:observerList){
            observer.update();
        }
    }
}
