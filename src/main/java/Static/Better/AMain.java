package Static.Better;

public class AMain {
    public static void main(String[] args) {
        System.out.println("Initial howManyObjects: " + ExampleBetter.getHowManyObjects());
        ExampleBetter obj1 = new ExampleBetter(100);
        obj1.printRadius();
        obj1.calculateArea();

        ExampleBetter obj2 = new ExampleBetter(200);
        obj2.printRadius();
        obj2.calculateArea();

        ExampleBetter.printObjectReferences();
        System.out.println("howManyObjects after creating 2 instances: " + ExampleBetter.getHowManyObjects());

        //StaticExampleBetter obj3 = new StaticExampleBetter();
    }
}
