package designpattern.observer;

public class OctObserver extends Observer {
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver( this );
    }
    public void update() {
        System.out.println(" OctObserver : " + Integer.toOctalString(subject.getState()));
    }
}
