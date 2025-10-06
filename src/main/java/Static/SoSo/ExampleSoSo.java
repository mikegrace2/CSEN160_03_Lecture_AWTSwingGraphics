package Static.SoSo;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleSoSo {
    private static int howManyObjects;
    private static Collection<ExampleSoSo> objectReferences;
    private int radius; // instance variable

    // Static initialization block
    static {
        howManyObjects = 0;
        objectReferences=new ArrayList<ExampleSoSo>();
        //radius=0; // does not work, radius is not static
        System.out.println("Static initialization block executed: howManyObjects="+howManyObjects);
    }

    private ExampleSoSo(){
        throw new UnsupportedOperationException("Default constructor is not supported. Please use the parameterized constructor.");
    }

    public ExampleSoSo(int radius) {
        howManyObjects++; // does work because howManyObjects is static
        objectReferences.add(this); // does work because objectReferences is static
        radius = radius; // actually wrong, very odd!
        //this.radius = radius;
    }

    public static int getHowManyObjects() {
        return howManyObjects;
    }

    public static void printObjectReferences() {
        for (ExampleSoSo obj : objectReferences) {
            System.out.println(obj);
        }
    }

    public void printRadius() {
        System.out.println("Radius: " + radius);
    }

    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area: " + area+"\n");
    }

    public static void main(String[] args) {
        System.out.println("Initial howManyObjects: " + getHowManyObjects());
        ExampleSoSo obj1 = new ExampleSoSo(111);
        obj1.printRadius();
        obj1.calculateArea();

        ExampleSoSo obj2 = new ExampleSoSo(222);
        obj2.printRadius();
        obj2.calculateArea();

        printObjectReferences();
        System.out.println("howManyObjects after creating 2 instances: " + getHowManyObjects());
    }
}