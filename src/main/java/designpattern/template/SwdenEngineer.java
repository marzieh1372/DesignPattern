package designpattern.template;

public class SwdenEngineer extends TemplateSuperClass {

    @Override
    protected void wallConstruction() {
        System.out.println("Sweden wallConstruction");
    }

    @Override
    protected void foundation() {
        System.out.println("Sweden foundation");
    }

    @Override
    protected void excavation() {
        System.out.println("Sweden excavation");
    }
}
