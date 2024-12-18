package Week9;

class Circle2 {
    double radius;
    static int numberOfObjects = 0;
    Circle2(){
        radius =1;
        numberOfObjects++;
    }
    static int getNumberOfObjects() {
        return numberOfObjects;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
}

public class T7 {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Cricle2 objects is " + Circle2.numberOfObjects);
        Circle2 c1 = new Circle2();
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius = " + c1.radius + " and number of Circle objects =" + c1.numberOfObjects);
        Circle2 c2= new Circle2();
        c1.radius = 9;
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius =" + c1.radius + " and number of Circle objects = " + c1.numberOfObjects);
        System.out.println("c2: radius = " + c2.radius + " and number of Circle objects =" + c2.numberOfObjects);
    }
}

