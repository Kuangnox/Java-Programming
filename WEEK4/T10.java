package classes;

import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {
        double sum=0;
        System.out.println("请输入每月储额：");
        Scanner sc =new Scanner(System.in);
        double money = sc.nextDouble();
        for(int i=0;i<=6;i++){
            sum=(sum+money)*(1+0.00417);
        }
        System.out.println("第六个月后，账户储值为"+sum);
    }
}
