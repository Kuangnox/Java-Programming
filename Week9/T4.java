package Week9;

import java.util.Date;
public class T4 {
    public static void main(String[] args) {
        Date date =new Date();
        System.out.println("The elapsed time since jan 1, 1970 is"+date.getTime()+"milliseconds");
        System.out.println(date.toString());
    }
}