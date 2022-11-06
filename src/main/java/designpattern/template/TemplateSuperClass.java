package designpattern.template;

public abstract class TemplateSuperClass {

    public final void  building(){
        excavation();
        foundation();
        wallConstruction();
    }

    protected abstract void wallConstruction();

    protected abstract void foundation();

    protected abstract void excavation();
}
