import java.util.Scanner;

public class Assignment33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("What is your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("The name of the user is: " + name);
        System.out.println("The age of the user is: " + age);
        System.out.println("The salary of the user is: " + salary);
    }
}
