import java.util.Scanner;

public class Menu {
    public void publicMenu(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("***** WELCOME *****");
        System.out.println("1- SIGN Up");
        System.out.println("2- SIGN IN");
        System.out.println("3- EXIT");
        System.out.println("choose Your Number: ");

        int number =scanner.nextInt();
        scanner.nextLine();
        System.out.println(number);
    }
}
