package Week6;

public class T14 {
    public static void main(String[] args) {
        double tuition = 10000.0; // 初始学费
        double doubleTuition = tuition * 2; // 学费翻倍后的金额
        double increaseRate = 0.07; // 每年学费增长率
        int years = 0; // 计算年数

        while (tuition < doubleTuition) {
            tuition *= (1 + increaseRate); // 计算下一年的学费
            years++; // 年数加1
        }

        System.out.println("Tuition will be doubled in " + years + " years");
        System.out.println("Tuition will be $" + tuition + " in " + years + " years");
    }
}