package programs.basic_01;

import java.util.Scanner;

public class MultiplicationTable {
    private static int a=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter the value of a:");
        a=scanner.nextInt();
        System.out.println("Multiplication Table of "+a+" is:");

        for (int i=1;i<=10;i++){
            System.out.println(a+"X"+i+"="+(a*i));
        }
    }
}
