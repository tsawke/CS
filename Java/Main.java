package CS.Java;

import java.io.IOException;
// import java.io.IOException;
import java.util.Scanner;

import CS.Java.test.test;

class labExercise1{
    public static Scanner main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of a rectangle: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height of a rectangle: ");
        double height = sc.nextDouble();
        System.out.printf("The area is %.2f.\nThe perimeter is %.2f.\n", width * height, (width + height) * 2);
        return sc;
        // sc.close();
    };
};

class labExercise2{
    public static void main(String[] args, Scanner sc) throws IOException{
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int sec = sc.nextInt();
        System.out.printf("The equivalent time is %d hours %d minutes and %d seconds.\n", sec / 3600,  (sec % 3600) / 60, sec % 60);
        sc.close();
    };
};

public class Main{
    public static void main(String[] args) throws IOException{
        // test.Main(args);
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println("Hello World!");
        // System.out.println(a);
        // sc.close();
        labExercise2.main(args, labExercise1.main(args));
    }
};