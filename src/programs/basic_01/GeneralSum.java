package programs.basic_01;

import java.util.Scanner;

public class GeneralSum {
    private static int a=0;
    private static int b=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter the value of a:");
        a=scanner.nextInt();
        System.out.print("please enter the value of b:");
        b=scanner.nextInt();
        System.out.println("Sumation of a & B is:"+(a+b));
    }
}
