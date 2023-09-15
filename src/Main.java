import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //variable declarations
    double winter;
    double summer;
    double spring;
    double fall;
    double yearly;

    System.out.println("Please enter the maintenance cost of the winter season");
    winter = scan.nextDouble();
    System.out.println("Please enter the maintenance cost of the spring season");
    spring = scan.nextDouble();
    System.out.println("Please enter the maintenance cost of the summer season");
    summer = scan.nextDouble();
    System.out.println("Please enter the maintenance cost of the fall season");
    fall = scan.nextDouble();
    yearly = winter + summer + spring + fall;
    System.out.println("The total yearly maintenance cost is $" + yearly + ".");
    }

}