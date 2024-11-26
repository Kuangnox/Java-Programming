package Week11;

public class TestPass {
    public static void main(String[] args) {
        Circle myCircle = new Circle(1);
        int n = 5;
        printAreas(myCircle,n);
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }
    public  static void printAreas(Circle c, int n){
        while(n >= 1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            n--;
        }
    }
}