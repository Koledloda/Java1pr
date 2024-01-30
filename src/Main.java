import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите грамовку для каждого ингредиента:");

        System.out.print("Мука: ");
        int flour = scanner.nextInt();

        System.out.print("Сахар: ");
        int sugar = scanner.nextInt();

        System.out.print("Яйца: ");
        int eggs = scanner.nextInt();

        System.out.println("Напишите полный способ приготовления:");
        scanner.nextLine();
        String method = scanner.nextLine();


        PrintWriter print = new PrintWriter("resipe.txt");

        print.write("Ингредиенты: \n");
        print.write("");
        print.write("Мука: " + flour + "гр. \n");
        print.write("");
        print.write("Сахар: " + sugar + "гр. \n");
        print.write("");
        print.write("Яйца: " + eggs + "штук\n");
        print.write("");
        print.write("Способ приготовления:\n");
        print.write("");
        print.write(method);

        print.close();

        System.out.println("Рецепт успешно записан в файл «recipe.txt»");
    }
}