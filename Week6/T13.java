package Week6;

import java.util.Scanner;

public class T13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入第一个整数
        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();

        // 提示用户输入第二个整数
        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();

        // 调用findGCD方法计算最大公约数
        int gcd = findGCD(num1, num2);

        // 输出结果
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);

        // 关闭Scanner对象
        scanner.close();
    }

    // 使用欧几里得算法计算最大公约数
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}