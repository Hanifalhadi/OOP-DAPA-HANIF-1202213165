import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Calculation calcu = new Calculation();

        boolean repeat = false;

        Thread Thread1 = new Thread(calcu);

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=== menu program ===");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            System.out.println("Select Menu: ");

            int hitung = sc.nextInt();
            try {
                switch (hitung) {
                    case 1:
                        System.out.println("Enter the length of the side of the square: ");12
                        calcu.setSquare();
                        Thread1.start();
                        Thread1.join();
                        System.out.println("=====");
                        System.out.println("The calculation result: " + calcu.getSquare());
                        break;

                    case 2:
                        System.out.println("enter the radius of the circle: ");
                        calcu.radius = sc.nextDouble();
                        calcu.setCircle();
                        Thread1.start();
                        Thread1.join();
                        System.out.println("=====");
                        System.out.println("the calculation result is: " + calcu.getCircle());
                        break;

                    case 3:
                        System.out.println("insert the side of the base of the trapezoid: ");
                        double a = sc.nextDouble();
                        System.out.println("enter the upper side of the trapezoid: ");
                        double b = sc.nextDouble();
                        System.out.println("enter height: ");
                        double c = sc.nextDouble();
                        calcu.setTrapezoid(b, c, hitung);
                        Thread1.start();
                        Thread1.join();

                        System.out.println("=====");
                        System.out.println("the calculation result: " + calcu.getTrapezoid());
                        break;

                    default:
                        System.out.println("====erorr: option not available====");
                        break;
                }
            } catch (InputMismatchException a) {
                System.out.println("erorr:: input must be number");

            } catch (IllegalArgumentException e) {
                System.out.println("java.lang.IllegalArgumentException");
            }

        } while (repeat);
        sc.close();

    }
}