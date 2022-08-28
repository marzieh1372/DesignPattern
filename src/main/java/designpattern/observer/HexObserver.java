package designpattern.observer;

public class HexObserver extends Observer {
    public HexObserver(Subject subject){

        this.subject = subject;
        this.subject.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println(" HexObserver :  " + Integer.toHexString(subject.getState()));
    }
}
