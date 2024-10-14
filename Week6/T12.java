package Week6;

public class T12 {
    public static void main(String[] args) {
        int count = 0; // 用于计数已找到的素数
        int lineCount = 0; // 用于控制每行打印的素数数量
        System.out.println("The first 50 prime numbers are");

        for (int i = 2; count < 50; i++) { // 从2开始遍历整数
            if (isPrime(i)) { // 检查当前数是否为素数
                System.out.print(i + " "); // 打印素数并添加一个空格
                count++; // 增加找到的素数计数

                // 控制每行打印10个素数
                lineCount++;
                if (lineCount == 10) {
                    System.out.println(); // 换行
                    lineCount = 0; // 重置行计数
                }
            }
        }

        // 如果最后一行打印的素数数量不足10个，也进行换行以保持格式整齐（这里其实不需要，因为一定会打印满50个）
        // 但为了代码的完整性，可以保留此行（实际上在循环结束后，它不会执行，因为count正好为50时跳出循环）
        // System.out.println();
    }

    // 判断一个数是否为素数的辅助方法
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 小于等于1的数不是素数
        for (int i = 2; i <= Math.sqrt(num); i++) { // 检查从2到sqrt(num)的数是否能整除num
            if (num % i == 0) return false; // 如果能整除，则num不是素数
        }
        return true; // 如果没有找到能整除的数，则num是素数
    }
}