package Week6;

public class T9 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;

        // 外层循环控制行数
        for (int i = 0; i < rows; i++) {
            // 内层循环控制列数
            for (int j = 0; j < columns; j++) {
                // 根据行和列的位置输出星号或空格
                if (j<=i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // 换行以开始下一行
            System.out.println();
        }
    }
}