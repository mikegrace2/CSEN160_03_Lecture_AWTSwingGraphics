package Static.Better;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleBetter {
    private static int howManyObjects;
    private static Collection<ExampleBetter> objectReferences;
    private int radius; // instance variable

    // Static initialization block
    static {
        ExampleBetter.howManyObjects = 0;
        ExampleBetter.objectReferences=new ArrayList<ExampleBetter>();
        System.out.println("Static initialization block executed: howManyObjects="+ ExampleBetter.howManyObjects);
    }

    private ExampleBetter(){
        throw new UnsupportedOperationException("Default constructor is not supported. Please use the parameterized constructor.");
    }

    public ExampleBetter(int radius) {
        ExampleBetter.howManyObjects++;
        ExampleBetter.objectReferences.add(this);
        //radius = radius;
        this.radius = radius;
    }

    public static int getHowManyObjects() {
        return ExampleBetter.howManyObjects;
    }

    public void printRadius() {
        System.out.println("Radius: " + this.radius);
    }

    public void calculateArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        System.out.println("Area: " + area+"\n");
    }

    public static void printObjectReferences() {
        for (ExampleBetter obj : ExampleBetter.objectReferences) {
            System.out.println("Object References: "+obj);
        }
        System.out.println();
    }
}