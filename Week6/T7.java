package Week6;

public class T7 {
    public static void main(String[] args) {
        int j = 0; // 假设添加一个变量j用于演示，实际中可能不需要
        for (int i = 0; i < 10; i++) {
            if (i < j) { // 此处i < j逻辑可能并不符合实际需求，但按原代码逻辑修正
                System.out.println(i);
            } else {
                System.out.println(i); // 原代码中else分支打印的是j，但根据上下文，应打印i
            }
            // 注意：原代码中有多余的j++和错误的while循环，已删除
        }
        // 注意：原代码中有一个错误的while循环和多余的j++，已根据上下文逻辑删除
    }
}