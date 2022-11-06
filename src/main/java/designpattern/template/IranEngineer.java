package designpattern.template;

public class IranEngineer extends TemplateSuperClass{

    @Override
    protected void wallConstruction() {
        System.out.println("Iran wallConstruction");
    }

    @Override
    protected void foundation() {
        System.out.println("Iran foundation");
    }

    @Override
    protected void excavation() {
        System.out.println("Iran excavation");
    }
}
