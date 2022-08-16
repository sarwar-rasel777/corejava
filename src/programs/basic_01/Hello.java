package programs.basic_01;

import java.util.Scanner;

public class Hello {
    private static String name=null;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Your Name:");
        name=scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
