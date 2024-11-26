package Week11;

public class Array {
    public static void main(String[] args) {
        Circle[] circleArray;
        circleArray = createCircleArray();
        printCircleArray(circleArray);
    }
    public static Circle[] createCircleArray(){
        Circle[] circleArray = new Circle[5];
        for(int i = 0;i < circleArray.length;i++){
            circleArray[i] = new Circle(Math.random() * 10);
        }
        return circleArray;
    }
    public static void printCircleArray(Circle[] circleArray){
        System.out.printf("%.30s%-15s\n","Radius","Area");
        for(int i = 0;i < circleArray.length;i++){
            System.out.printf("%.30f%-15s\n" , circleArray[i].getRadius(),circleArray[i].getArea());
        }
    }
}