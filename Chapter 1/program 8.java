public class AreaAndPerimeterOfACircle {
    public static void main(String[] args) {
        double radius=5.5;//半径
        double perimeter;//周长
        double area;//面积
        double pai=3.14;
        perimeter = 2 * radius * pai;
        area = radius * radius * pai;
        System.out.println(perimeter);
        System.out.println(area);
    }
}
